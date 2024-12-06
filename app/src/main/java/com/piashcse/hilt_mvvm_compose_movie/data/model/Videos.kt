package com.piashcse.hilt_mvvm_compose_movie.data.model

import com.google.gson.annotations.SerializedName

data class Videos(
    @SerializedName("results")
    var results: List<Video>
)
