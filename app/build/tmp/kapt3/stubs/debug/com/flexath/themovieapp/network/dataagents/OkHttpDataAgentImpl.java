package com.flexath.themovieapp.network.dataagents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016JP\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2*\u0010\u0007\u001a&\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0006\u0010\u0010\u001a\u00020\u0006J6\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J8\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J>\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J6\u0010\u0017\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J6\u0010\u0018\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016J6\u0010\u0019\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/flexath/themovieapp/network/dataagents/OkHttpDataAgentImpl;", "Lcom/yeminnaing/movieapplication/network/dataagents/MovieDataAgent;", "()V", "mClient", "Lokhttp3/OkHttpClient;", "getActors", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "onFailure", "", "getCreditByMovie", "movieId", "Lkotlin/Pair;", "getExe", "getGenres", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "getMovieDetails", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getMoviesByGenres", "genreId", "getNowPlayingMovies", "getPopularMovies", "getTopRatedMovies", "GetNowPlayingMovieOkHttpTask", "app_debug"})
public final class OkHttpDataAgentImpl implements com.yeminnaing.movieapplication.network.dataagents.MovieDataAgent {
    @org.jetbrains.annotations.NotNull()
    public static final com.flexath.themovieapp.network.dataagents.OkHttpDataAgentImpl INSTANCE = null;
    private static final okhttp3.OkHttpClient mClient = null;
    
    private OkHttpDataAgentImpl() {
        super();
    }
    
    @java.lang.Override()
    public void getNowPlayingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getMoviesByGenres(@org.jetbrains.annotations.NotNull()
    java.lang.String genreId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getActors(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.yeminnaing.movieapplication.data.vos.MovieVO, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    @java.lang.Override()
    public void getCreditByMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Pair<? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>, ? extends java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO>>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    public final void getExe() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0015\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/flexath/themovieapp/network/dataagents/OkHttpDataAgentImpl$GetNowPlayingMovieOkHttpTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/flexath/themovieapp/network/responses/MovieListResponse;", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "doInBackground", "p0", "", "([Ljava/lang/Void;)Lcom/flexath/themovieapp/network/responses/MovieListResponse;", "onPostExecute", "", "result", "app_debug"})
    public static final class GetNowPlayingMovieOkHttpTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.flexath.themovieapp.network.responses.MovieListResponse> {
        private final okhttp3.OkHttpClient mOkHttpClient = null;
        
        public GetNowPlayingMovieOkHttpTask(@org.jetbrains.annotations.NotNull()
        okhttp3.OkHttpClient mOkHttpClient) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        @java.lang.Deprecated()
        protected com.flexath.themovieapp.network.responses.MovieListResponse doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
        
        @java.lang.Override()
        @java.lang.Deprecated()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        com.flexath.themovieapp.network.responses.MovieListResponse result) {
        }
    }
}