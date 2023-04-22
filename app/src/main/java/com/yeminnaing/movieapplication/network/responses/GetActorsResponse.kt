package com.flexath.themovieapp.network.responses

import com.yeminnaing.movieapplication.data.vos.ActorVO
import com.google.gson.annotations.SerializedName

data class GetActorsResponse(
    @SerializedName("results")
    val results:List<ActorVO>?
)
