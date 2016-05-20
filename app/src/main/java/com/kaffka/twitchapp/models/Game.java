package com.kaffka.twitchapp.models;

import com.google.gson.annotations.SerializedName;

final public class Game {
    final private String name;
    final private ImagesUrls box;
    final private ImagesUrls logo;
    @SerializedName("_id")
    final private String id;
    @SerializedName("giantbomb_id")
    final private String giantBombId;

    public Game(String name, ImagesUrls box, ImagesUrls logo, String id, String giantBombId) {
        this.name = name;
        this.box = box;
        this.logo = logo;
        this.id = id;
        this.giantBombId = giantBombId;
    }

    public String getName() {
        return name;
    }

    public ImagesUrls getBox() {
        return box;
    }

    public ImagesUrls getLogo() {
        return logo;
    }

    public String getId() {
        return id;
    }

    public String getGiantBombId() {
        return giantBombId;
    }
}
