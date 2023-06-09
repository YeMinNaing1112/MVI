package com.flexath.themovieapp.network.dataagents

import android.os.AsyncTask
import com.yeminnaing.movieapplication.data.vos.ActorVO
import com.yeminnaing.movieapplication.data.vos.GenreVO
import com.yeminnaing.movieapplication.data.vos.MovieVO
import com.flexath.themovieapp.network.responses.MovieListResponse
import com.yeminnaing.movieapplication.utils.API_GET_NOW_PLAYING
import com.yeminnaing.movieapplication.utils.BASE_URL
import com.yeminnaing.movieapplication.utils.MOVIE_API_KEY
import com.google.gson.Gson
import com.yeminnaing.movieapplication.network.dataagents.MovieDataAgent
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit

object OkHttpDataAgentImpl : MovieDataAgent {

    override fun getNowPlayingMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        GetNowPlayingMovieOkHttpTask(mClient).execute()
    }

    override fun getPopularMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {

    }

    override fun getTopRatedMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {

    }

    override fun getGenres(onSuccess: (List<GenreVO>) -> Unit, onFailure: (String) -> Unit) {

    }

    override fun getMoviesByGenres(
        genreId: String,
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {

    }

    override fun getActors(onSuccess: (List<ActorVO>) -> Unit, onFailure: (String) -> Unit) {

    }

    override fun getMovieDetails(
        movieId: String,
        onSuccess: (MovieVO) -> Unit,
        onFailure: (String) -> Unit
    ) {

    }

    override fun getCreditByMovie(
        movieId: String,
        onSuccess: (Pair<List<ActorVO>, List<ActorVO>>) -> Unit,
        onFailure: (String) -> Unit
    ) {

    }

    private val mClient = OkHttpClient.Builder()
        .connectTimeout(15,TimeUnit.SECONDS)
        .readTimeout(15,TimeUnit.SECONDS)
        .writeTimeout(15,TimeUnit.SECONDS)
        .build()

    fun getExe() {
        GetNowPlayingMovieOkHttpTask(mClient).execute()
    }

    class GetNowPlayingMovieOkHttpTask(private val mOkHttpClient: OkHttpClient) : AsyncTask<Void,Void,MovieListResponse>() {
        @Deprecated("Deprecated in Java")
        override fun doInBackground(vararg p0: Void?): MovieListResponse? {
            val request = Request.Builder()
                .url("""$BASE_URL$API_GET_NOW_PLAYING?api_key=$MOVIE_API_KEY&language=en-US&page=1""")
                .build()

            try {
                val response = mOkHttpClient.newCall(request).execute()
                if(response.isSuccessful) {
                    response.body?.let {
                        val responseString = it.string()
                        return Gson().fromJson(responseString, MovieListResponse::class.java)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return null
        }

        @Deprecated("Deprecated in Java")
        override fun onPostExecute(result: MovieListResponse?) {
            super.onPostExecute(result)
        }

    }
}