package com.yeminnaing.movieapplication.mvi.intents

import com.yeminnaing.movieapplication.mvi.mvibase.MVIIntent

sealed class MainIntent : MVIIntent {
    class LoadMoviesByGenreIntent(val genrePosition:Int) : MainIntent()
    object LoadAllHomePageData : MainIntent()
}