package com.example.test_taskk.database

import com.example.test_taskk.data.MediaItem

interface DataBase {

    fun getMediaItems(): List<MediaItem>
}