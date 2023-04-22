package com.yeminnaing.movieapplication.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"API_GET_ACTORS", "", "API_GET_CREDIT_BY_MOVIE", "API_GET_GENRES", "API_GET_MOVIES_BY_GENRE", "API_GET_MOVIE_DETAILS", "API_GET_NOW_PLAYING", "API_GET_POPULAR", "API_GET_TOP_RATED", "API_SEARCH_MOVIE", "BASE_URL", "IMAGE_BASE_URL", "MOVIE_API_KEY", "PARAM_API_KEY", "PARAM_GENRE_ID", "PARAM_PAGE", "PARAM_QUERY", "app_debug"})
public final class ApiConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w400/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_NOW_PLAYING = "/3/movie/now_playing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_POPULAR = "/3/movie/popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_TOP_RATED = "/3/movie/top_rated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_GENRES = "/3/genre/movie/list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_MOVIES_BY_GENRE = "/3/discover/movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_ACTORS = "/3/person/popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_MOVIE_DETAILS = "/3/movie/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_CREDIT_BY_MOVIE = "/3/movie/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SEARCH_MOVIE = "/3/search/movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_API_KEY = "ad1e17e27becb3abedf8eaccc61b8d5d";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_KEY = "api_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PAGE = "page";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_GENRE_ID = "with_genres";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_QUERY = "query";
}