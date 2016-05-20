package com.kaffka.twitchapp.models;

final public class ImagesUrls {
    final private String large;
    final private String medium;
    final private String small;
    final private String template;

    public ImagesUrls(String large, String medium, String small, String template) {
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.template = template;
    }

    public String getLarge() {
        return large;
    }

    public String getMedium() {
        return medium;
    }

    public String getSmall() {
        return small;
    }

    public String getTemplate() {
        return template;
    }
}
