package com.yeminnaing.movieapplication.mvi.mvibase

interface MVIView<S: MVIState> {
    fun render(state:S)
}