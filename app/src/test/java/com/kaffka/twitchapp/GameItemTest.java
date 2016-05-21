package com.kaffka.twitchapp;

import com.kaffka.twitchapp.models.GameItem;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GameItemTest {

    @Test
    public void testGameItemGetters(){

        GameItem gameItem = new GameItem(null,100,200);

        assertEquals(gameItem.getChannels(),200);
        assertEquals(gameItem.getViewers(),100);
        assertEquals(gameItem.getGame(),null);
    }
}
