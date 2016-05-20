package com.kaffka.twitchapp.api_services;

import com.kaffka.twitchapp.models.TopGames;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TwitchApi {

    @GET("/kraken/games/top")
    Call<TopGames> getTopGames(@Query("limit") Integer limit, @Query("offset") Integer offset);

}
