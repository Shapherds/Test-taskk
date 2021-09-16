package com.example.test_taskk.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test_taskk.R
import com.example.test_taskk.data.MediaItem
import com.example.test_taskk.databinding.FragmentPagerItemBinding

class FragmentPagerItem private constructor() : Fragment() {

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = FragmentPagerItemBinding.inflate(layoutInflater, container, false)
        view.mediaIconImageView.setImageDrawable(requireActivity().getDrawable(fragmentMediaItem.image))
        view.mediaTitleTextView.text = fragmentMediaItem.name
        view.mediaDescriptionTextView.text = fragmentMediaItem.details
        return view.root
    }

    companion object {
        lateinit var fragmentMediaItem: MediaItem

        fun newInstance(mediaItem: MediaItem): FragmentPagerItem {
            fragmentMediaItem = mediaItem
            return FragmentPagerItem()
        }
    }
}