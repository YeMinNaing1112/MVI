package com.yeminnaing.movieapplication.mvi.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/processors/MainProcessor;", "", "()V", "mMovieModel", "Lcom/yeminnaing/movieapplication/data/models/MovieModel;", "loadAllHomePageData", "Landroidx/lifecycle/LiveData;", "Lcom/yeminnaing/movieapplication/mvi/states/MainState;", "previousState", "loadMoviesByGenre", "genreId", "", "app_debug"})
public final class MainProcessor {
    @org.jetbrains.annotations.NotNull()
    public static final com.yeminnaing.movieapplication.mvi.processors.MainProcessor INSTANCE = null;
    private static final com.yeminnaing.movieapplication.data.models.MovieModel mMovieModel = null;
    
    private MainProcessor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.yeminnaing.movieapplication.mvi.states.MainState> loadAllHomePageData(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.mvi.states.MainState previousState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.yeminnaing.movieapplication.mvi.states.MainState> loadMoviesByGenre(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.mvi.states.MainState previousState, int genreId) {
        return null;
    }
}