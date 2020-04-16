package com.example.rakoappli;

import com.example.rakoappli.Model.Resume;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("top-headlines")
    Call<Resume> getHeadlines(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<Resume> getSpecificData(
            @Query("q") String query,
            @Query("apiKey") String apiKey
    );



}
