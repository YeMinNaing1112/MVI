package com.yeminnaing.movieapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/yeminnaing/movieapplication/activities/MovieSearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/flexath/themovieapp/delegates/MovieViewHolderDelegate;", "()V", "mAdapter", "Lcom/yeminnaing/movieapplication/adapters/MovieAdapter;", "mMovieModel", "Lcom/yeminnaing/movieapplication/data/models/MovieModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTapMovie", "movieId", "", "setUpListeners", "setUpRecyclerView", "Companion", "app_debug"})
public final class MovieSearchActivity extends androidx.appcompat.app.AppCompatActivity implements com.flexath.themovieapp.delegates.MovieViewHolderDelegate {
    private com.yeminnaing.movieapplication.adapters.MovieAdapter mAdapter;
    private com.yeminnaing.movieapplication.data.models.MovieModel mMovieModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.yeminnaing.movieapplication.activities.MovieSearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public MovieSearchActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    public void onTapMovie(int movieId) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yeminnaing/movieapplication/activities/MovieSearchActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}