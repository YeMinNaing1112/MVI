package com.yeminnaing.movieapplication.mvi.mvibase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIView;", "S", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIState;", "", "render", "", "state", "(Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIState;)V", "app_debug"})
public abstract interface MVIView<S extends com.yeminnaing.movieapplication.mvi.mvibase.MVIState> {
    
    public abstract void render(@org.jetbrains.annotations.NotNull()
    S state);
}