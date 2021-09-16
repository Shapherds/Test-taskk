package com.example.test_taskk.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.test_taskk.data.MediaItem
import com.example.test_taskk.databinding.FragmentMediaItemBinding


class MusicItemRecyclerViewAdapter(
    private val values: List<MediaItem>
) : RecyclerView.Adapter<MusicItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        FragmentMediaItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(private val uiBinding: FragmentMediaItemBinding) :
        RecyclerView.ViewHolder(uiBinding.root) {

        fun bind(item: MediaItem) {
            uiBinding.mediaIconImageView.setImageDrawable(
                getDrawable(
                    uiBinding.root.context,
                    item.image
                )
            )
            uiBinding.mediaTitleTextView.text = item.name
            uiBinding.mediaDescriptionTextView.text = item.details
        }
    }

}