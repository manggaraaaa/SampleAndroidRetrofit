package com.muhammadaa.sampleappwithretrofit.api.service;

/**
 * Created by muhammadaa on 14/08/17.
 */

import com.muhammadaa.sampleappwithretrofit.api.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>>reposForUser(@Path("user") String user);
}
