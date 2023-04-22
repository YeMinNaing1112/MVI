package com.flexath.themovieapp

import android.app.Application
import com.yeminnaing.movieapplication.data.models.MovieModelImpl

class MovieApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}