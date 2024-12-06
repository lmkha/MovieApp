package com.piashcse.hilt_mvvm_compose_movie.data.datasource.local.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.piashcse.hilt_mvvm_compose_movie.data.model.Videos

class VideosTypeConverter {
    @TypeConverter
    fun fromVideos(videos: Videos): String {
        return Gson().toJson(videos)
    }

    @TypeConverter
    fun toVideos(videosString: String): Videos {
        val type = object : TypeToken<Videos>() {}.type
        return Gson().fromJson(videosString, type)
    }
}