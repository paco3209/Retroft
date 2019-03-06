package com.example.francisco.retroft;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubCliente {


     @GET("/users/{user}/repos")
     Call<List<GitHubRepo>> getrepos(@Path("user") String user);
}
