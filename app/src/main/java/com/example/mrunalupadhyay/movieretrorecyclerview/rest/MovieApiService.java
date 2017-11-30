package com.example.mrunalupadhyay.movieretrorecyclerview.rest;

import com.example.mrunalupadhyay.movieretrorecyclerview.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mrunal.upadhyay on 11/29/17.
 */

public interface MovieApiService {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

}
