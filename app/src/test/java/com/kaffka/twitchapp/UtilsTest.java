package com.kaffka.twitchapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void testGetLogoUrl() throws Exception {
        assertEquals(Utils.getLogoUrl("{width}", 2f), "128");
        assertEquals(Utils.getLogoUrl("{height}", 2f), "76");
    }

    @Test
    public void testGetBoxUrl() throws Exception {
        assertEquals(Utils.getBoxUrl("{width}", 2f), "304");
        assertEquals(Utils.getBoxUrl("{height}", 2f), "436");
    }

}