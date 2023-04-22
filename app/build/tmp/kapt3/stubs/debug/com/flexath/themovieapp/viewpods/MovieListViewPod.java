package com.flexath.themovieapp.viewpods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0014\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bJ\b\u0010\u0014\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/flexath/themovieapp/viewpods/MovieListViewPod;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDelegate", "Lcom/flexath/themovieapp/delegates/MovieViewHolderDelegate;", "mMovieAdapter", "Lcom/yeminnaing/movieapplication/adapters/MovieAdapter;", "onFinishInflate", "", "setDelegate", "delegate", "setNewData", "movieList", "", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "setUpMovieListViewPod", "setUpMovieRecyclerView", "app_debug"})
public final class MovieListViewPod extends android.widget.FrameLayout {
    private com.yeminnaing.movieapplication.adapters.MovieAdapter mMovieAdapter;
    private com.flexath.themovieapp.delegates.MovieViewHolderDelegate mDelegate;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public MovieListViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MovieListViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void setUpMovieListViewPod(@org.jetbrains.annotations.NotNull()
    com.flexath.themovieapp.delegates.MovieViewHolderDelegate delegate) {
    }
    
    private final void setDelegate(com.flexath.themovieapp.delegates.MovieViewHolderDelegate delegate) {
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> movieList) {
    }
    
    private final void setUpMovieRecyclerView() {
    }
}