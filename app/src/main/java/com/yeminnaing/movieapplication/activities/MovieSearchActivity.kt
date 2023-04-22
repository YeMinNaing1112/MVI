package com.yeminnaing.movieapplication.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.flexath.themovieapp.R
import com.yeminnaing.movieapplication.adapters.MovieAdapter
import com.yeminnaing.movieapplication.data.models.MovieModel
import com.yeminnaing.movieapplication.data.models.MovieModelImpl
import com.flexath.themovieapp.delegates.MovieViewHolderDelegate
import com.jakewharton.rxbinding4.widget.textChanges
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_movie_search.*
import java.util.concurrent.TimeUnit

class MovieSearchActivity : AppCompatActivity(),MovieViewHolderDelegate {

    private lateinit var mAdapter: MovieAdapter
    private var mMovieModel: MovieModel = MovieModelImpl

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, MovieSearchActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search)

        setUpRecyclerView()
        setUpListeners()
    }

    private fun setUpListeners() {
        etSearch.textChanges()
            .debounce(500L,TimeUnit.MILLISECONDS)
            .flatMap {
                mMovieModel.searchMovie(it.toString())
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mAdapter.setData(it)
            },{
                Toast.makeText(this,it.localizedMessage,Toast.LENGTH_SHORT).show()
            })
        }

    private fun setUpRecyclerView() {
        mAdapter = MovieAdapter(this)
        rvMovies.adapter = mAdapter
        rvMovies.layoutManager = GridLayoutManager(this,2)
    }

    override fun onTapMovie(movieId: Int) {

    }
}