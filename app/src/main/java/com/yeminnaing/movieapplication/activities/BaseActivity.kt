package com.yeminnaing.movieapplication.activities

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    abstract fun showError(error:String)
}