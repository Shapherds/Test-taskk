package com.example.test_taskk.database

import com.example.test_taskk.data.MediaItem

interface DataSource {

    fun getMediaItems(): List<MediaItem>
}