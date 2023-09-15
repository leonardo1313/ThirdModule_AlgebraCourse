package com.example.thirdmodule

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ApiMovie(
    @SerializedName("adult")
    @Expose
    val adult: Boolean,
    @SerializedName("backdrop_path")
    @Expose
    val backdropPath: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("poster_path")
    @Expose
    val imagePath: String,
    @SerializedName("release_date")
    @Expose
    val releaseDate: String,
    @SerializedName("overview")
    @Expose
    val overview: String,
    @SerializedName("vote_average")
    @Expose
    val voteAverage: Number,
    @SerializedName("vote_count")
    @Expose
    val voteCount: Int,
    @SerializedName("popularity")
    @Expose
    val popularity: Number,
    @SerializedName("video")
    @Expose
    val video: Boolean,
    @SerializedName("original_language")
    @Expose
    val originalLanguage: String,
    @SerializedName("original_title")
    @Expose
    val originalTitle: String,
    @SerializedName("genre_ids")
    @Expose
    val genreIds: List<Int>,


)