package com.flexath.themovieapp.network.responses

import com.yeminnaing.movieapplication.data.vos.GenreVO
import com.google.gson.annotations.SerializedName

data class GetGenresResponse(
    @SerializedName("genres")
    val genres:List<GenreVO>
)
