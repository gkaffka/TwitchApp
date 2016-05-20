package com.kaffka.twitchapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

final public class TopGames {
    @SerializedName("_total")
    final private int total;
    @SerializedName("_links")
    final private Links links;
    @SerializedName("top")
    final private List<GameItem> gameList;

    public TopGames(int total, Links links, List<GameItem> gameList) {
        this.total = total;
        this.links = links;
        this.gameList = gameList;
    }

    public int getTotal() {
        return total;
    }

    public Links getLinks() {
        return links;
    }

    public List<GameItem> getGameList() {
        return gameList;
    }
}
