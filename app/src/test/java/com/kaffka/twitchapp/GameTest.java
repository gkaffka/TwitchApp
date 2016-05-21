package com.kaffka.twitchapp;

import com.kaffka.twitchapp.models.Game;
import com.kaffka.twitchapp.models.ImagesUrls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GameTest {

   @Test
    public void testGameGetters(){
       ImagesUrls imagesUrls = new ImagesUrls("large","medium","small","template");
       Game game = new Game("gameName",imagesUrls,imagesUrls,"id","giantBomb");

       assertEquals(game.getName(),"gameName");
       assertEquals(game.getId(),"id");
       assertEquals(game.getGiantBombId(),"giantBomb");
       assertEquals(game.getLogo(),imagesUrls);
       assertEquals(game.getBox(),imagesUrls);
   }
}
