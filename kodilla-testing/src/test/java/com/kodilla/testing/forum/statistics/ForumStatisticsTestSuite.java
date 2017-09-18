package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {
    @Test
    public void testIfZeroPosts(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("user1");
        userNames.add("user2");
        int postsNumber = 0;
        int commentsNumber = 10;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPosts = forumStatistics.getAverageCommentsPerPosts();


        //Then
        Assert.assertEquals(0, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(10/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(0, getAverageCommentsPerPosts, 0);
    }

    @Test
    public void testIf1000Posts(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("user1");
        userNames.add("user2");
        int postsNumber = 1000;
        int commentsNumber = 10;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(1000/2, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(10/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(10/1000, getAverageCommentsPerPostsTest, 0);
    }

    @Test
    public void testIf0Comments(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("user1");
        userNames.add("user2");
        int postsNumber = 10;
        int commentsNumber = 0;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(10/2, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(0/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(0/1000, getAverageCommentsPerPostsTest, 0);

    }
}
