package com.flexath.themovieapp.network.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/flexath/themovieapp/network/responses/GetCreditsByMovieResponse;", "", "id", "", "cast", "", "Lcom/yeminnaing/movieapplication/data/vos/ActorVO;", "crew", "(ILjava/util/List;Ljava/util/List;)V", "getCast", "()Ljava/util/List;", "getCrew", "getId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class GetCreditsByMovieResponse {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cast")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> cast = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "crew")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> crew = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.flexath.themovieapp.network.responses.GetCreditsByMovieResponse copy(int id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> cast, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> crew) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GetCreditsByMovieResponse(int id, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> cast, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> crew) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> getCast() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ActorVO> getCrew() {
        return null;
    }
}