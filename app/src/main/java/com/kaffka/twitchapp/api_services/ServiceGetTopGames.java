package com.kaffka.twitchapp.api_services;

import com.kaffka.twitchapp.models.TopGames;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceGetTopGames {

    public void start() {
        TwitchService.createTwitchService().getTopGames(null, null).enqueue(new Callback<TopGames>() {
            @Override
            public void onResponse(Call<TopGames> call, Response<TopGames> response) {

            }

            @Override
            public void onFailure(Call<TopGames> call, Throwable t) {

            }
        });
    }
}
