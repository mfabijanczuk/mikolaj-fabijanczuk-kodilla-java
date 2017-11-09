package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mikolaj = new Millenials("Mikołaj");
        User justyna = new YGeneration("Justyna");
        User goska = new ZGeneration("Gośka");

        //When
        String mikolajPublisher = mikolaj.sharePost();
        System.out.println("Mikołaj add: " + mikolajPublisher);
        String justynaPublisher = justyna.sharePost();
        System.out.println("Justyna add: " + justynaPublisher);
        String goskaPublisher = goska.sharePost();
        System.out.println("Gośka add: " + goskaPublisher);

        //Then
        Assert.assertEquals("Twitter post", mikolajPublisher);
        Assert.assertEquals("Facebook post", justynaPublisher);
        Assert.assertEquals("Snapchat post", goskaPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mikolaj = new Millenials("Mikołaj");
        //When
        String mikolajPublisher = mikolaj.sharePost();
        System.out.println("Mikołaj add: " + mikolajPublisher);
        mikolaj.setSocialPublisher(new FacebookPublisher());
        mikolajPublisher = mikolaj.sharePost();
        System.out.println("Mikołaj add: " + mikolajPublisher);
        //Then
        Assert.assertEquals("Facebook post", mikolajPublisher);
    }
}
