package com.yeminnaing.movieapplication.mvi.viewmodels

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yeminnaing.movieapplication.mvi.intents.MainIntent
import com.yeminnaing.movieapplication.mvi.mvibase.MVIViewModel
import com.yeminnaing.movieapplication.mvi.processors.MainProcessor
import com.yeminnaing.movieapplication.mvi.states.MainState

class MainViewModel(override var state: MutableLiveData<MainState> = MutableLiveData(MainState.idle())) :
    MVIViewModel<MainState, MainIntent>, ViewModel() {

    private val mProcessor = MainProcessor

    override fun processIntent(intent: MainIntent, lifecycleOwner: LifecycleOwner) {
        when(intent) {
//            Load Home Page Data
            MainIntent.LoadAllHomePageData -> {
                state.value?.let {
                    mProcessor.loadAllHomePageData(
                        previousState = it
                    ).observe(lifecycleOwner) { newState ->
                        state.postValue(newState)
                        if(newState.moviesByGenre.isEmpty()) {
                            processIntent(MainIntent.LoadMoviesByGenreIntent(0),lifecycleOwner)
                        }
                    }
                }
            }
           //Load Move by Genre
            is MainIntent.LoadMoviesByGenreIntent -> {
                state.value?.let {
                    val genreId = it.genres.getOrNull(intent.genrePosition)?.id ?: 0
                    mProcessor.loadMoviesByGenre(
                        previousState = it,
                        genreId = genreId
                    ).observe(lifecycleOwner,state::postValue)
                }
            }
        }
    }
}