package com.example.test_taskk.database

import com.example.test_taskk.R
import com.example.test_taskk.data.MediaItem

class DataBaseImp : DataBase {

    override fun getMediaItems() = createMediaItems()

    private fun createMediaItems() =
        listOf(
            MediaItem(R.drawable.media_file1, " title 1 ", "description 1"),
            MediaItem(R.drawable.media_file2, " title 2 ", "description 2"),
            MediaItem(R.drawable.media_file3, " title 3 ", "description 3"),
            MediaItem(R.drawable.media_file4, " title 4 ", "description 4"),
            MediaItem(R.drawable.media_file5, " title 5 ", "description 5"),
            MediaItem(R.drawable.media_file6, " title 6 ", "description 6"),
            MediaItem(R.drawable.media_file7, " title 7 ", "description 7"),
            MediaItem(R.drawable.media_file8, " title 8 ", "description 8"),
            MediaItem(R.drawable.media_file9, " title 9 ", "description 9"),
            MediaItem(R.drawable.media_file10, " title 10 ", "description 10")
        )
}