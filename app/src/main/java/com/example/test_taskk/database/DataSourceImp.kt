package com.example.test_taskk.database

import com.example.test_taskk.R
import com.example.test_taskk.data.MediaItem

class DataSourceImp : DataSource {

    override fun getMediaItems() = createMediaItems()

    private fun createMediaItems() =
        listOf(
            MediaItem(R.drawable.media_file1, " Fancy Like   ", "Walker Hayes"),
            MediaItem(R.drawable.media_file2, " Shivers ", "Ed Sheeran"),
            MediaItem(R.drawable.media_file3, " Bad Habits", "Ed Sheeran"),
            MediaItem(R.drawable.media_file4, " STAY", "The Kid LAROI & Justin Bieber"),
            MediaItem(R.drawable.media_file5, " If I Didn't Love You", "Jason Aldean & Carrie Underwood"),
            MediaItem(R.drawable.media_file6, " Fancy Like (feat. Kesha) ", "Walker Hayes & Kesha"),
            MediaItem(R.drawable.media_file7, " Never Wanted To Be That Girl", "Carly Pearce & Ashley McBryde"),
            MediaItem(R.drawable.media_file8, " Ride the Lightning (717 Tapes)", "Warren Zeiders"),
            MediaItem(R.drawable.media_file9, " Buy Dirt (feat. Luke Bryan) ", "Jordan Davis"),
            MediaItem(R.drawable.media_file10, " Cold Heart (PNAU Remix)", "Elton John & Dua Lipa")
        )
}