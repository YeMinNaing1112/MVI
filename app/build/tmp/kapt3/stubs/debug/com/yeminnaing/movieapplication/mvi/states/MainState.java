package com.yeminnaing.movieapplication.mvi.states;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u00c6\u0003J}\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/states/MainState;", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIState;", "isLoading", "", "errorMessage", "", "nowPlayingMovies", "", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "popularMovies", "topRatedMovies", "genres", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "moviesByGenre", "actors", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActors", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "getGenres", "()Z", "getMoviesByGenre", "getNowPlayingMovies", "getPopularMovies", "getTopRatedMovies", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "app_debug"})
public final class MainState implements com.yeminnaing.movieapplication.mvi.mvibase.MVIState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> nowPlayingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> popularMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> topRatedMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> moviesByGenre = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> actors = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.yeminnaing.movieapplication.mvi.states.MainState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yeminnaing.movieapplication.mvi.states.MainState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> nowPlayingMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> popularMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> topRatedMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> moviesByGenre, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> actors) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MainState(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> nowPlayingMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> popularMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> topRatedMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> moviesByGenre, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> actors) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> getNowPlayingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> getTopRatedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> getMoviesByGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> getActors() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/states/MainState$Companion;", "", "()V", "idle", "Lcom/yeminnaing/movieapplication/mvi/states/MainState;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yeminnaing.movieapplication.mvi.states.MainState idle() {
            return null;
        }
    }
}