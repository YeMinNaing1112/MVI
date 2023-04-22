package com.yeminnaing.movieapplication.persistence.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f2\u0006\u0010\t\u001a\u00020\nH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/yeminnaing/movieapplication/persistence/dao/MovieDao;", "", "deleteAllMovies", "", "getAllMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "getMovieById", "movieId", "", "getMovieByIdFlowable", "Lio/reactivex/rxjava3/core/Flowable;", "getMovieByIdOneTime", "getMoviesByType", "type", "", "getMoviesByTypeFlowable", "insertMovies", "movies", "insertSingleMovie", "movie", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO> movies);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSingleMovie(@org.jetbrains.annotations.Nullable()
    com.yeminnaing.movieapplication.data.vos.MovieVO movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getAllMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE id = :movieId")
    public abstract androidx.lifecycle.LiveData<com.yeminnaing.movieapplication.data.vos.MovieVO> getMovieById(int movieId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE id = :movieId")
    public abstract com.yeminnaing.movieapplication.data.vos.MovieVO getMovieByIdOneTime(int movieId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE type = :type")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getMoviesByType(@org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    @androidx.room.Query(value = "DELETE FROM movie_table")
    public abstract void deleteAllMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE id = :movieId")
    public abstract io.reactivex.rxjava3.core.Flowable<com.yeminnaing.movieapplication.data.vos.MovieVO> getMovieByIdFlowable(int movieId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE type = :type")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<com.yeminnaing.movieapplication.data.vos.MovieVO>> getMoviesByTypeFlowable(@org.jetbrains.annotations.NotNull()
    java.lang.String type);
}