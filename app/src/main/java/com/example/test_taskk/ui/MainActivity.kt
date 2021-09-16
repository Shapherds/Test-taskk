package com.example.test_taskk.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.test_taskk.R
import com.example.test_taskk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var uiBinding: ActivityMainBinding
    private var fragmentList = FragmentList.newInstance()
    private var fragmentPager = FragmentPager.newInstance()
    private var isList = true
    private var isButtonClick = false

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)
        supportFragmentManager.beginTransaction().run {
            add(uiBinding.fragmntContainerFrameLayout.id, fragmentPager)
            commit()
        }
        uiBinding.viewChangerImageView.run {
            background = getDrawable(R.drawable.ic_solo)
            setOnClickListener {
                if (!isButtonClick) {
                    isButtonClick = true
                    val fragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.setCustomAnimations(
                        R.anim.enter_from_left,
                        R.anim.exit_to_right,
                        R.anim.enter_from_right,
                        R.anim.exit_to_left
                    )
                    isList = !isList
                    uiBinding.viewChangerImageView.background
                    when (isList) {
                        false -> {
                            fragmentTransaction.replace(
                                uiBinding.fragmntContainerFrameLayout.id,
                                fragmentList
                            )
                            background = getDrawable(R.drawable.ic_list)
                            fragmentTransaction.commit()
                        }
                        true -> {
                            fragmentTransaction.replace(
                                uiBinding.fragmntContainerFrameLayout.id,
                                fragmentPager
                            )
                            background = getDrawable(R.drawable.ic_solo)
                            fragmentTransaction.commit()
                        }
                    }
                    Handler(mainLooper).postDelayed({
                        isButtonClick = false
                    }, 250)
                }
            }
        }

    }
}