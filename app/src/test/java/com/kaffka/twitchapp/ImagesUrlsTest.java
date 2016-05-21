package com.kaffka.twitchapp;

import com.kaffka.twitchapp.models.ImagesUrls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ImagesUrlsTest {

    @Test
    public void testImageUrlsGetters(){
        ImagesUrls imagesUrls = new ImagesUrls("large","medium","small","template");

        assertEquals(imagesUrls.getLarge(),"large");
        assertEquals(imagesUrls.getMedium(),"medium");
        assertEquals(imagesUrls.getSmall(),"small");
        assertEquals(imagesUrls.getTemplate(),"template");
    }
}
