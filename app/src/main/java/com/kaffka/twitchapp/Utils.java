package com.kaffka.twitchapp;

import android.content.Context;

public class Utils {
    public enum Keys {
        URL_LOGO,
        TITLE,
        CHANNEL,
        VIEWER,
    }

    public static String getLogoUrl(String url, Context ctx){
        String width = String.valueOf((int)(320*getDensity(ctx)));
        String height = String.valueOf((int)(191*getDensity(ctx)));
        return url.replace("{width}",width).replace("{height}",height);
    }

    public static String getBoxUrl(String url, Context ctx){
        String width = String.valueOf((int)(160*getDensity(ctx)));
        String height = String.valueOf((int)(229*getDensity(ctx)));
        return url.replace("{width}",width).replace("{height}",height);
    }

    private static float getDensity(Context ctx){
        return  ctx.getResources().getDisplayMetrics().density;
    }
}
