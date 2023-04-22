package com.yeminnaing.movieapplication.mvi.mvibase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\u000eH&\u00a2\u0006\u0002\u0010\u000fR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIViewModel;", "S", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIState;", "I", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIIntent;", "", "state", "Landroidx/lifecycle/MutableLiveData;", "getState", "()Landroidx/lifecycle/MutableLiveData;", "processIntent", "", "intent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIIntent;Landroidx/lifecycle/LifecycleOwner;)V", "app_debug"})
public abstract interface MVIViewModel<S extends com.yeminnaing.movieapplication.mvi.mvibase.MVIState, I extends com.yeminnaing.movieapplication.mvi.mvibase.MVIIntent> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<S> getState();
    
    public abstract void processIntent(@org.jetbrains.annotations.NotNull()
    I intent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner);
}