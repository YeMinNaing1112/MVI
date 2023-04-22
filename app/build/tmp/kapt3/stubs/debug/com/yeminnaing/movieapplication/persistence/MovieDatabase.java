package com.yeminnaing.movieapplication.persistence;

import java.lang.System;

@androidx.room.Database(entities = {com.yeminnaing.movieapplication.data.vos.MovieVO.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yeminnaing/movieapplication/persistence/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/yeminnaing/movieapplication/persistence/dao/MovieDao;", "Companion", "app_debug"})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.yeminnaing.movieapplication.persistence.MovieDatabase.Companion Companion = null;
    private static com.yeminnaing.movieapplication.persistence.MovieDatabase movieDatabase;
    private static final java.lang.String dbName = "MovieDB";
    
    public MovieDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.yeminnaing.movieapplication.persistence.dao.MovieDao movieDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/yeminnaing/movieapplication/persistence/MovieDatabase$Companion;", "", "()V", "dbName", "", "movieDatabase", "Lcom/yeminnaing/movieapplication/persistence/MovieDatabase;", "getDBInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.yeminnaing.movieapplication.persistence.MovieDatabase getDBInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}