package com.yeminnaing.movieapplication.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010\'\u001a\u00020\u0014H\u0002J\u0016\u0010(\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/yeminnaing/movieapplication/activities/MainActivity;", "Lcom/yeminnaing/movieapplication/activities/BaseActivity;", "Lcom/flexath/themovieapp/delegates/BannerViewHolderDelegate;", "Lcom/flexath/themovieapp/delegates/ShowCaseViewHolderDelegate;", "Lcom/flexath/themovieapp/delegates/MovieViewHolderDelegate;", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIView;", "Lcom/yeminnaing/movieapplication/mvi/states/MainState;", "()V", "mActorViewPod", "Lcom/flexath/themovieapp/viewpods/ActorListViewPod;", "mBannerAdapter", "Lcom/yeminnaing/movieapplication/adapters/BannerAdapter;", "mBestPopularMovieListViewPod", "Lcom/flexath/themovieapp/viewpods/MovieListViewPod;", "mMoviesByGenerViewPod", "mShowCaseAdapter", "Lcom/yeminnaing/movieapplication/adapters/ShowCaseAdapter;", "mViewModel", "Lcom/yeminnaing/movieapplication/mvi/viewmodels/MainViewModel;", "observeState", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onTapMovie", "movieId", "", "onTapMovieFromBanner", "onTapMovieFromShowCase", "render", "state", "setInitialIntent", "setUpBannerViewPager", "setUpGenreTabLayout", "genreList", "", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "setUpListeners", "setUpShowCaseRecyclerView", "setUpToolBar", "setUpViewModel", "setUpViewPodsInstances", "showError", "error", "", "app_debug"})
public final class MainActivity extends com.yeminnaing.movieapplication.activities.BaseActivity implements com.flexath.themovieapp.delegates.BannerViewHolderDelegate, com.flexath.themovieapp.delegates.ShowCaseViewHolderDelegate, com.flexath.themovieapp.delegates.MovieViewHolderDelegate, com.yeminnaing.movieapplication.mvi.mvibase.MVIView<com.yeminnaing.movieapplication.mvi.states.MainState> {
    private com.yeminnaing.movieapplication.adapters.BannerAdapter mBannerAdapter;
    private com.yeminnaing.movieapplication.adapters.ShowCaseAdapter mShowCaseAdapter;
    private com.flexath.themovieapp.viewpods.MovieListViewPod mBestPopularMovieListViewPod;
    private com.flexath.themovieapp.viewpods.MovieListViewPod mMoviesByGenerViewPod;
    private com.flexath.themovieapp.viewpods.ActorListViewPod mActorViewPod;
    private com.yeminnaing.movieapplication.mvi.viewmodels.MainViewModel mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViewModel() {
    }
    
    private final void setInitialIntent() {
    }
    
    private final void observeState() {
    }
    
    private final void setUpViewPodsInstances() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpGenreTabLayout(java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genreList) {
    }
    
    private final void setUpShowCaseRecyclerView() {
    }
    
    private final void setUpBannerViewPager() {
    }
    
    private final void setUpToolBar() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onTapMovieFromBanner(int movieId) {
    }
    
    @java.lang.Override()
    public void onTapMovieFromShowCase(int movieId) {
    }
    
    @java.lang.Override()
    public void onTapMovie(int movieId) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.mvi.states.MainState state) {
    }
}