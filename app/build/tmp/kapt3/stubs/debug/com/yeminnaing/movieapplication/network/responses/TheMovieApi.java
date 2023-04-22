package com.yeminnaing.movieapplication.network.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/yeminnaing/movieapplication/network/responses/TheMovieApi;", "", "getActors", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/flexath/themovieapp/network/responses/GetActorsResponse;", "api_key", "", "page", "", "getCreditByMovie", "Lcom/flexath/themovieapp/network/responses/GetCreditsByMovieResponse;", "movieId", "getGenres", "Lcom/flexath/themovieapp/network/responses/GetGenresResponse;", "getMovieDetails", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getMoviesByGenre", "Lcom/flexath/themovieapp/network/responses/MovieListResponse;", "genreId", "getNowPlayingMovies", "getPopularMovies", "getTopRatedMovies", "searchMovie", "query", "app_debug"})
public abstract interface TheMovieApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/now_playing")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.MovieListResponse> getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/popular")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.MovieListResponse> getPopularMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/top_rated")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.MovieListResponse> getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/genre/movie/list")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.GetGenresResponse> getGenres(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/discover/movie")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.MovieListResponse> getMoviesByGenre(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "with_genres")
    java.lang.String genreId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/person/popular")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.GetActorsResponse> getActors(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie//{movie_id}")
    public abstract io.reactivex.rxjava3.core.Observable<com.yeminnaing.movieapplication.data.vos.MovieVO> getMovieDetails(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie//{movie_id}/credits")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.GetCreditsByMovieResponse> getCreditByMovie(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/search/movie")
    public abstract io.reactivex.rxjava3.core.Observable<com.flexath.themovieapp.network.responses.MovieListResponse> searchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}