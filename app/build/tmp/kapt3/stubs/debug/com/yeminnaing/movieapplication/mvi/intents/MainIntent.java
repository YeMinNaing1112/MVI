package com.yeminnaing.movieapplication.mvi.intents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent;", "Lcom/yeminnaing/movieapplication/mvi/mvibase/MVIIntent;", "()V", "LoadAllHomePageData", "LoadMoviesByGenreIntent", "Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent$LoadAllHomePageData;", "Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent$LoadMoviesByGenreIntent;", "app_debug"})
public abstract class MainIntent implements com.yeminnaing.movieapplication.mvi.mvibase.MVIIntent {
    
    private MainIntent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent$LoadMoviesByGenreIntent;", "Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent;", "genrePosition", "", "(I)V", "getGenrePosition", "()I", "app_debug"})
    public static final class LoadMoviesByGenreIntent extends com.yeminnaing.movieapplication.mvi.intents.MainIntent {
        private final int genrePosition = 0;
        
        public LoadMoviesByGenreIntent(int genrePosition) {
            super();
        }
        
        public final int getGenrePosition() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent$LoadAllHomePageData;", "Lcom/yeminnaing/movieapplication/mvi/intents/MainIntent;", "()V", "app_debug"})
    public static final class LoadAllHomePageData extends com.yeminnaing.movieapplication.mvi.intents.MainIntent {
        @org.jetbrains.annotations.NotNull()
        public static final com.yeminnaing.movieapplication.mvi.intents.MainIntent.LoadAllHomePageData INSTANCE = null;
        
        private LoadAllHomePageData() {
            super();
        }
    }
}