package com.example.rakoappli;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static final String BASE_URL="https://newsapi.org/v2/";
    private static Api apiClient;
    private static Retrofit retrofit;

    private Api() {
        retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    }
    public static synchronized  Api getInstance(){
        if (apiClient== null) {
            apiClient = new Api();
        }
        return apiClient;
    }

        public ApiInterface getApi() {
            return retrofit.create(ApiInterface.class);

    }
}
