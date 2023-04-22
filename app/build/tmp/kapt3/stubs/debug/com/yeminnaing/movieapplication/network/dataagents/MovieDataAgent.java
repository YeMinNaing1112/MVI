package com.yeminnaing.movieapplication.network.dataagents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&JP\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2*\u0010\u0004\u001a&\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J6\u0010\r\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J8\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J>\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J6\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J6\u0010\u0014\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&J6\u0010\u0015\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0016"}, d2 = {"Lcom/yeminnaing/movieapplication/network/dataagents/MovieDataAgent;", "", "getActors", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "onFailure", "", "getCreditByMovie", "movieId", "Lkotlin/Pair;", "getGenres", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "getMovieDetails", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getMoviesByGenres", "genreId", "getNowPlayingMovies", "getPopularMovies", "getTopRatedMovies", "app_debug"})
public abstract interface MovieDataAgent {
    
    public abstract void getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getMoviesByGenres(@org.jetbrains.annotations.NotNull()
    java.lang.String genreId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getActors(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.yeminnaing.movieapplication.data.vos.MovieVO, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
    
    public abstract void getCreditByMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, ? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
}