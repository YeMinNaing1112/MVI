package com.yeminnaing.movieapplication.mvi.states

import com.yeminnaing.movieapplication.data.vos.ActorVO
import com.yeminnaing.movieapplication.data.vos.GenreVO
import com.yeminnaing.movieapplication.data.vos.MovieVO
import com.yeminnaing.movieapplication.mvi.mvibase.MVIState

data class MainState(
    val isLoading: Boolean = false,
    val errorMessage: String = "",
    val nowPlayingMovies: List<MovieVO>,
    val popularMovies: List<MovieVO>,
    val topRatedMovies: List<MovieVO>,
    val genres: List<GenreVO>,
    val moviesByGenre: List<MovieVO>,
    val actors: List<ActorVO>
) : MVIState {
    companion object {
        fun idle(): MainState = MainState(
            isLoading = false,
            errorMessage = "",
            nowPlayingMovies = listOf(),
            popularMovies = listOf(),
            topRatedMovies = listOf(),
            genres = listOf(),
            moviesByGenre = listOf(),
            actors = listOf()
        )
    }
}