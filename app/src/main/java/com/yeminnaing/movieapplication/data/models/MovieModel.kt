package com.yeminnaing.movieapplication.data.models

import androidx.lifecycle.LiveData
import com.yeminnaing.movieapplication.data.vos.ActorVO
import com.yeminnaing.movieapplication.data.vos.GenreVO
import com.yeminnaing.movieapplication.data.vos.MovieVO
import io.reactivex.rxjava3.core.Observable

interface MovieModel {
    fun getNowPlayingMovies(
        onFailure: (String) -> Unit
    ) : LiveData<List<MovieVO>>?

    fun getPopularMovies(
        onFailure: (String) -> Unit
    ) : LiveData<List<MovieVO>>?

    fun getTopRatedMovies(
        onFailure: (String) -> Unit
    ) : LiveData<List<MovieVO>>?

    fun getGenres(
        onSuccess: (List<GenreVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getMoviesByGenre(
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
        onFailure: (String) -> Unit
    ) : LiveData<MovieVO?>?

    fun getCreditByMovie(
        movieId:String,
        onSuccess: (Pair<List<ActorVO>,List<ActorVO>>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun searchMovie(
        query:String
    ) : Observable<List<MovieVO>>

    // Reactive Streams only

    fun getNowPlayingMoviesObservable() : Observable<List<MovieVO>>?
    fun getPopularMoviesObservable() : Observable<List<MovieVO>>?
    fun getTopRatedMoviesObservable() : Observable<List<MovieVO>>?
    fun getGenresObservable() : Observable<List<GenreVO>>?
    fun getMoviesByGenreObservable(genreId:String) : Observable<List<MovieVO>>?
    fun getActorsObservable() : Observable<List<ActorVO>>?
    fun getMovieDetailsObservable(movieId:String) : Observable<MovieVO?>?
    fun getCreditByMovieObservable(movieId:String) : Observable<Pair<List<ActorVO>,List<ActorVO>>>
}