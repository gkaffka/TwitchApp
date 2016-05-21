package com.kaffka.twitchapp;

import android.content.Context;

public class Utils {
    public enum Keys {
        URL_LOGO,
        URL_BOX,
        TITLE,
        CHANNEL,
        VIEWER,
    }

    public static String getLogoUrl(String url, Context ctx){
        String width = String.valueOf((int)(64*getDensity(ctx)));
        String height = String.valueOf((int)(38*getDensity(ctx)));
        return url.replace("{width}",width).replace("{height}",height);
    }

    public static String getBoxUrl(String url, Context ctx){
        String width = String.valueOf((int)(152*getDensity(ctx)));
        String height = String.valueOf((int)(218*getDensity(ctx)));
        return url.replace("{width}",width).replace("{height}",height);
    }

    private static float getDensity(Context ctx){
        return  ctx.getResources().getDisplayMetrics().density;
    }
}
