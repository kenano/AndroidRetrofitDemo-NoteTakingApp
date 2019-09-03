package com.example.alexr.ideamanager.services;

import com.example.alexr.ideamanager.models.Idea;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface IdeaService {

    @GET("ideas")
//    Call<List<Idea>> getIdeas(@Query("owner") String owner);
    Call<List<Idea>> getIdeas(@QueryMap HashMap<String, String> filters);

    // The curly braces denote where id numbers are passed in the url.
    @GET("ideas/{id}")

    // define a interface which  will generate a obj that retrieve an Idea obj from remote.
    Call<Idea> getIdea(@Path("id") int id);



}
