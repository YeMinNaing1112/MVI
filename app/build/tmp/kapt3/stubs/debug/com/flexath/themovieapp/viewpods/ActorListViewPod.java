package com.flexath.themovieapp.viewpods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0014\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/flexath/themovieapp/viewpods/ActorListViewPod;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mActorAdapter", "Lcom/yeminnaing/movieapplication/adapters/ActorAdapter;", "getMActorAdapter", "()Lcom/yeminnaing/movieapplication/adapters/ActorAdapter;", "setMActorAdapter", "(Lcom/yeminnaing/movieapplication/adapters/ActorAdapter;)V", "onFinishInflate", "", "setNewData", "actorList", "", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "setUpActorRecyclerView", "setUpActorViewPod", "backgroundColorReference", "", "titleText", "", "moreTitleText", "app_debug"})
public final class ActorListViewPod extends android.widget.RelativeLayout {
    public com.yeminnaing.movieapplication.adapters.ActorAdapter mActorAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public ActorListViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ActorListViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yeminnaing.movieapplication.adapters.ActorAdapter getMActorAdapter() {
        return null;
    }
    
    public final void setMActorAdapter(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.adapters.ActorAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void setUpActorViewPod(int backgroundColorReference, @org.jetbrains.annotations.NotNull()
    java.lang.String titleText, @org.jetbrains.annotations.NotNull()
    java.lang.String moreTitleText) {
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> actorList) {
    }
    
    private final void setUpActorRecyclerView() {
    }
}