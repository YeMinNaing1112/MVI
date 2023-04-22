package com.yeminnaing.movieapplication.data.vos;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.flexath.themovieapp.persistence.typeconverters.GenreListTypeConverter.class, com.flexath.themovieapp.persistence.typeconverters.CollectionTypeConverter.class, com.flexath.themovieapp.persistence.typeconverters.ProductionCompanyTypeConverter.class, com.flexath.themovieapp.persistence.typeconverters.ProductionCountryTypeConverter.class, com.flexath.themovieapp.persistence.typeconverters.SpokenLanguageTypeConverter.class, com.yeminnaing.movieapplication.persistence.typeconverters.GenreIdsTypeConverter.class})
@androidx.room.Entity(tableName = "movie_table")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00b1\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0007\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0007\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0007\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010(J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010@J\u0010\u0010Z\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010RJ\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010j\u001a\u00020\bH\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010@J\u00ee\u0002\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00072\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00072\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00072\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010pJ\u0013\u0010q\u001a\u00020\u00032\b\u0010r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010s\u001a\u00020\u0005J\u0006\u0010t\u001a\u00020\u0005J\u0006\u0010u\u001a\u00020vJ\t\u0010w\u001a\u00020\bH\u00d6\u0001J\t\u0010x\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00104R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00104R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010-R \u0010\'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010-\"\u0004\bM\u0010NR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\bO\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010A\u001a\u0004\bP\u0010@R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010S\u001a\u0004\bQ\u0010R\u00a8\u0006y"}, d2 = {"Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "", "adult", "", "backDropPath", "", "genreIds", "", "", "belongToCollection", "Lcom/yeminnaing/movieapplication/data/vos/CollectionVO;", "id", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "releaseDate", "title", "video", "voteAverage", "voteCount", "status", "tagline", "revenue", "runtime", "productionCompanies", "Lcom/yeminnaing/movieapplication/data/vos/ProductionCompanyVO;", "productionCountries", "Lcom/yeminnaing/movieapplication/data/vos/ProductionCountryVO;", "homepage", "imdbId", "budget", "", "genres", "Lcom/yeminnaing/movieapplication/data/vos/GenreVO;", "spokenLanguages", "Lcom/yeminnaing/movieapplication/data/vos/SpokenLanguageVO;", "type", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/yeminnaing/movieapplication/data/vos/CollectionVO;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAdult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackDropPath", "()Ljava/lang/String;", "getBelongToCollection", "()Lcom/yeminnaing/movieapplication/data/vos/CollectionVO;", "getBudget", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGenreIds", "()Ljava/util/List;", "getGenres", "getHomepage", "getId", "()I", "setId", "(I)V", "getImdbId", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath", "getProductionCompanies", "getProductionCountries", "getReleaseDate", "getRevenue", "getRuntime", "getSpokenLanguages", "getStatus", "getTagline", "getTitle", "getType", "setType", "(Ljava/lang/String;)V", "getVideo", "getVoteAverage", "getVoteCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/yeminnaing/movieapplication/data/vos/CollectionVO;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/yeminnaing/movieapplication/data/vos/MovieVO;", "equals", "other", "getGenreAsCommaSeparatedString", "getProductionCountriesAsCommaSeparatedString", "getRatingBaseOnFiveStars", "", "hashCode", "toString", "app_debug"})
public final class MovieVO {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "adult")
    @com.google.gson.annotations.SerializedName(value = "adult")
    private final java.lang.Boolean adult = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "backdrop_path")
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private final java.lang.String backDropPath = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "genre_ids")
    @com.google.gson.annotations.SerializedName(value = "genre_ids")
    private final java.util.List<java.lang.Integer> genreIds = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "belongs_to_collection")
    @com.google.gson.annotations.SerializedName(value = "belongs_to_collection")
    private final com.yeminnaing.movieapplication.data.vos.CollectionVO belongToCollection = null;
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "original_language")
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private final java.lang.String originalLanguage = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "original_title")
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "overview")
    @com.google.gson.annotations.SerializedName(value = "overview")
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "popularity")
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "poster_path")
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "release_date")
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "title")
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "video")
    @com.google.gson.annotations.SerializedName(value = "video")
    private final java.lang.Boolean video = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vote_average")
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private final java.lang.Double voteAverage = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vote_count")
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private final java.lang.Integer voteCount = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "status")
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tagline")
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "revenue")
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private final java.lang.String revenue = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "runtime")
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private final java.lang.String runtime = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "production_companies")
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO> productionCompanies = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "production_countries")
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCountryVO> productionCountries = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "homepage")
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "imdb_id")
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private final java.lang.String imdbId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "budget")
    @com.google.gson.annotations.SerializedName(value = "budget")
    private final java.lang.Long budget = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "genres")
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "spoken_languages")
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private final java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> spokenLanguages = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "type")
    private java.lang.String type;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yeminnaing.movieapplication.data.vos.MovieVO copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backDropPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.Nullable()
    com.yeminnaing.movieapplication.data.vos.CollectionVO belongToCollection, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String revenue, @org.jetbrains.annotations.Nullable()
    java.lang.String runtime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCountryVO> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Long budget, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.lang.String type) {
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
    
    public MovieVO(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backDropPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.Nullable()
    com.yeminnaing.movieapplication.data.vos.CollectionVO belongToCollection, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.String revenue, @org.jetbrains.annotations.Nullable()
    java.lang.String runtime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCountryVO> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Long budget, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> genres, @org.jetbrains.annotations.Nullable()
    java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.lang.String type) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackDropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getGenreIds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yeminnaing.movieapplication.data.vos.CollectionVO component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yeminnaing.movieapplication.data.vos.CollectionVO getBelongToCollection() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRevenue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRuntime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCompanyVO> getProductionCompanies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCountryVO> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.ProductionCountryVO> getProductionCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBudget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.GenreVO> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.yeminnaing.movieapplication.data.vos.SpokenLanguageVO> getSpokenLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final float getRatingBaseOnFiveStars() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenreAsCommaSeparatedString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductionCountriesAsCommaSeparatedString() {
        return null;
    }
}