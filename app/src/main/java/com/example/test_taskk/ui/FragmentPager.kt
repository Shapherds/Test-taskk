package com.example.test_taskk.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test_taskk.adapters.ViewPagerAdapter
import com.example.test_taskk.database.DataBase
import com.example.test_taskk.database.DataBaseImp
import com.example.test_taskk.databinding.FragmentPagerBinding


class FragmentPager : Fragment() {

    private val dataBase: DataBase = DataBaseImp()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = FragmentPagerBinding.inflate(layoutInflater, container, false)

        val pagerAdapter = activity?.let {
            ViewPagerAdapter(
                it.supportFragmentManager,
                it.lifecycle,
                dataBase.getMediaItems().shuffled()
            )
        }
        view.root.adapter = pagerAdapter
        if (pagerAdapter != null) {
            createMediaFragments(pagerAdapter)
        }
        return view.root
    }

    private fun createMediaFragments(adapter: ViewPagerAdapter) {
        val mediaItems = dataBase.getMediaItems()
        for (i in mediaItems.indices) {
            adapter.createFragment(i)
        }
    }

    companion object {

        fun newInstance() = FragmentPager()
    }
}