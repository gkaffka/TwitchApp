package com.kaffka.twitchapp.api_services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TwitchService {

    public static TwitchApi createTwitchService() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.twitch.tv");

        return builder.build().create(TwitchApi.class);
    }
}
