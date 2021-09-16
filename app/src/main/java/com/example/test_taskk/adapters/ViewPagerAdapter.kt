package com.example.test_taskk.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.test_taskk.data.MediaItem
import com.example.test_taskk.ui.FragmentPagerItem

class ViewPagerAdapter(
    manager: FragmentManager,
    lifecycle: Lifecycle,
    private val mediaItems: List<MediaItem>
) : FragmentStateAdapter(manager, lifecycle) {

    private val hashMap = HashMap<Int, Fragment>()

    override fun getItemCount() = hashMap.size

    override fun createFragment(position: Int): Fragment {
        val fragment = FragmentPagerItem.newInstance(mediaItems[position])
        hashMap[position] = fragment
        return fragment
    }
}