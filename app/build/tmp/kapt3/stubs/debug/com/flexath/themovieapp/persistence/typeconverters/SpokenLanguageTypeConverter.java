package com.flexath.themovieapp.persistence.typeconverters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/flexath/themovieapp/persistence/typeconverters/SpokenLanguageTypeConverter;", "", "()V", "toSpokenLanguages", "", "Lcom/yeminnaing/movieapplication/data/vos/SpokenLanguageVO;", "jsonString", "", "toString", "spokenLanguages", "app_debug"})
public final class SpokenLanguageTypeConverter {
    
    public SpokenLanguageTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> spokenLanguages) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> toSpokenLanguages(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString) {
        return null;
    }
}