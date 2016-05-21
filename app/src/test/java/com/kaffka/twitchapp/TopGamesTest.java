package com.kaffka.twitchapp;

import com.kaffka.twitchapp.models.GameItem;
import com.kaffka.twitchapp.models.TopGames;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class TopGamesTest {

    @Test
    public void testImageUrlsGetters() {

        List<GameItem> l = new ArrayList<>();

        GameItem gameItem = new GameItem(null,100,200);
        l.add(gameItem);
        l.add(gameItem);

        TopGames top = new TopGames(1000, null, l);

        assertEquals(top.getTotal(), 1000);
        assertEquals(top.getGameItemList(), l);
        assertEquals(top.getLinks(), null);
    }
}
