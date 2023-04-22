package com.yeminnaing.movieapplication.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u000bH&JP\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2*\u0010\u0004\u001a&\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J.\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e0\u000b2\u0006\u0010\r\u001a\u00020\tH&J6\u0010\u0010\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0006\u0018\u00010\u000bH&J.\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001a\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH&J>\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\tH&J*\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u000bH&J*\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u000bH&J*\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0006\u0018\u00010\u000bH&J\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u000b2\u0006\u0010!\u001a\u00020\tH&\u00a8\u0006\""}, d2 = {"Lcom/yeminnaing/movieapplication/data/models/MovieModel;", "", "getActors", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "onFailure", "", "getActorsObservable", "Lio/reactivex/rxjava3/core/Observable;", "getCreditByMovie", "movieId", "Lkotlin/Pair;", "getCreditByMovieObservable", "getGenres", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "getGenresObservable", "getMovieDetails", "Landroidx/lifecycle/LiveData;", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getMovieDetailsObservable", "getMoviesByGenre", "genreId", "getMoviesByGenreObservable", "getNowPlayingMovies", "getNowPlayingMoviesObservable", "getPopularMovies", "getPopularMoviesObservable", "getTopRatedMovies", "getTopRatedMoviesObservable", "searchMovie", "query", "app_debug"})
public abstract interface MovieModel {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getMoviesByGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String genreId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getActors(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<com.yeminnaing.movieapplication.data.vos.MovieVO> getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getCreditByMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, ? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getNowPlayingMoviesObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getPopularMoviesObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getTopRatedMoviesObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO>> getGenresObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getMoviesByGenreObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String genreId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>> getActorsObservable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.rxjava3.core.Observable<com.yeminnaing.movieapplication.data.vos.MovieVO> getMovieDetailsObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Observable<kotlin.Pair<java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>>> getCreditByMovieObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId);
}