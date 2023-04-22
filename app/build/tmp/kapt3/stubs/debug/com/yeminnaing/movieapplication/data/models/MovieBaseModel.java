package com.yeminnaing.movieapplication.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/yeminnaing/movieapplication/data/models/MovieBaseModel;", "", "()V", "mMovieApi", "Lcom/yeminnaing/movieapplication/network/responses/TheMovieApi;", "getMMovieApi", "()Lcom/yeminnaing/movieapplication/network/responses/TheMovieApi;", "setMMovieApi", "(Lcom/yeminnaing/movieapplication/network/responses/TheMovieApi;)V", "mMovieDatabase", "Lcom/yeminnaing/movieapplication/persistence/MovieDatabase;", "getMMovieDatabase", "()Lcom/yeminnaing/movieapplication/persistence/MovieDatabase;", "setMMovieDatabase", "(Lcom/yeminnaing/movieapplication/persistence/MovieDatabase;)V", "initDatabase", "", "context", "Landroid/content/Context;", "app_debug"})
public abstract class MovieBaseModel {
    @org.jetbrains.annotations.NotNull()
    private com.yeminnaing.movieapplication.network.responses.TheMovieApi mMovieApi;
    @org.jetbrains.annotations.Nullable()
    private com.yeminnaing.movieapplication.persistence.MovieDatabase mMovieDatabase;
    
    public MovieBaseModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.yeminnaing.movieapplication.network.responses.TheMovieApi getMMovieApi() {
        return null;
    }
    
    protected final void setMMovieApi(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.network.responses.TheMovieApi p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.yeminnaing.movieapplication.persistence.MovieDatabase getMMovieDatabase() {
        return null;
    }
    
    protected final void setMMovieDatabase(@org.jetbrains.annotations.Nullable()
    com.yeminnaing.movieapplication.persistence.MovieDatabase p0) {
    }
    
    public final void initDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}