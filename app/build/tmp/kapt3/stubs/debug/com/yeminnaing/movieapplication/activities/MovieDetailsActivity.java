package com.yeminnaing.movieapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/yeminnaing/movieapplication/activities/MovieDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "actorsViewPod", "Lcom/flexath/themovieapp/viewpods/ActorListViewPod;", "creatorsViewPod", "mMovieModel", "Lcom/yeminnaing/movieapplication/data/models/MovieModel;", "bindData", "", "movie", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "bindGenre", "genreList", "", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestData", "movieId", "", "setUpListeners", "setUpViewPods", "Companion", "app_debug"})
public final class MovieDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.flexath.themovieapp.viewpods.ActorListViewPod actorsViewPod;
    private com.flexath.themovieapp.viewpods.ActorListViewPod creatorsViewPod;
    private final com.yeminnaing.movieapplication.data.models.MovieModel mMovieModel = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.yeminnaing.movieapplication.activities.MovieDetailsActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_MOVIE_ID = "EXTRA_MOVIE_ID";
    private java.util.HashMap _$_findViewCache;
    
    public MovieDetailsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestData(int movieId) {
    }
    
    private final void bindData(com.yeminnaing.movieapplication.data.vos.MovieVO movie) {
    }
    
    private final void bindGenre(com.yeminnaing.movieapplication.data.vos.MovieVO movie, java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genreList) {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpViewPods() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/yeminnaing/movieapplication/activities/MovieDetailsActivity$Companion;", "", "()V", "EXTRA_MOVIE_ID", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "movieId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int movieId) {
            return null;
        }
    }
}