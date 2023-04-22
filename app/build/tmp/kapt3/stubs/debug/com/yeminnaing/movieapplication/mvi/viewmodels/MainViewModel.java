package com.yeminnaing.movieapplication.mvi.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/viewmodels/MainViewModel;", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIViewModel;", "Lcom/yeminnaing/movieapplication/mvi/states/MainState;", "Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent;", "Landroidx/lifecycle/ViewModel;", "state", "Landroidx/lifecycle/MutableLiveData;", "(Landroidx/lifecycle/MutableLiveData;)V", "mProcessor", "Lcom/yeminnaing/movieapplication/mvi/processors/MainProcessor;", "getState", "()Landroidx/lifecycle/MutableLiveData;", "setState", "processIntent", "", "intent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel implements com.yeminnaing.movieapplication.mvi.mvibase.MVIViewModel<com.yeminnaing.movieapplication.mvi.states.MainState, com.yeminnaing.movieapplication.mvi.intents.MainIntent> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.yeminnaing.movieapplication.mvi.states.MainState> state;
    private final com.yeminnaing.movieapplication.mvi.processors.MainProcessor mProcessor = null;
    
    public MainViewModel() {
        super();
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.yeminnaing.movieapplication.mvi.states.MainState> state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.yeminnaing.movieapplication.mvi.states.MainState> getState() {
        return null;
    }
    
    public void setState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.yeminnaing.movieapplication.mvi.states.MainState> p0) {
    }
    
    @java.lang.Override()
    public void processIntent(@org.jetbrains.annotations.NotNull()
    com.yeminnaing.movieapplication.mvi.intents.MainIntent intent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
}