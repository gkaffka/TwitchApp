package com.kaffka.twitchapp;

import com.kaffka.twitchapp.models.Links;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LinksTest {

   @Test
    public void testLinkGetters(){
       Links links = new Links("self","next");

       assertEquals(links.getNext(),"next");
       assertEquals(links.getSelf(),"self");
   }
}
