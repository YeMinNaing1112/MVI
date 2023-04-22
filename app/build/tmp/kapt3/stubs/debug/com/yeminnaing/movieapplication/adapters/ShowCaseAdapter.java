package com.yeminnaing.movieapplication.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/yeminnaing/movieapplication/adapters/ShowCaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/flexath/themovieapp/viewholders/ShowCaseViewHolder;", "mDelegate", "Lcom/flexath/themovieapp/delegates/ShowCaseViewHolderDelegate;", "(Lcom/flexath/themovieapp/delegates/ShowCaseViewHolderDelegate;)V", "mMovieList", "", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNewData", "movieList", "app_debug"})
public final class ShowCaseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flexath.themovieapp.viewholders.ShowCaseViewHolder> {
    private final com.flexath.themovieapp.delegates.ShowCaseViewHolderDelegate mDelegate = null;
    private java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> mMovieList;
    
    public ShowCaseAdapter(@org.jetbrains.annotations.NotNull()
    com.flexath.themovieapp.delegates.ShowCaseViewHolderDelegate mDelegate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.flexath.themovieapp.viewholders.ShowCaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.flexath.themovieapp.viewholders.ShowCaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> movieList) {
    }
}