package com.yeminnaing.movieapplication.network.dataagents

import com.yeminnaing.movieapplication.data.vos.ActorVO
import com.yeminnaing.movieapplication.data.vos.GenreVO
import com.yeminnaing.movieapplication.data.vos.MovieVO

interface MovieDataAgent {
    fun getNowPlayingMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getPopularMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getTopRatedMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getGenres(
        onSuccess: (List<GenreVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getMoviesByGenres(
        genreId:String,
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getActors(
        onSuccess: (List<ActorVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getMovieDetails(
        movieId:String,
        onSuccess: (MovieVO) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getCreditByMovie(
        movieId:String,
        onSuccess: (Pair<List<ActorVO>,List<ActorVO>>) -> Unit,
        onFailure: (String) -> Unit
    )
}