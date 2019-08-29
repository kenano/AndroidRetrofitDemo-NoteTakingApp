package com.example.alexr.ideamanager.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder  {

    private static final String URL = "http://10.0.2.2:9000";

    private static HttpLoggingInterceptor logger =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder okHttp = new OkHttpClient.Builder().addInterceptor(logger);


    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp.build());

    private static Retrofit retrofit = builder.build();

    // what does <S> S mean?
    //      This method should return an object S of type S. A class object is an argument for
    //      buildService. An object of that class should be returned.
    public static <S> S buildService(Class<S> serviceType) {
        return retrofit.create(serviceType);
    }
}
