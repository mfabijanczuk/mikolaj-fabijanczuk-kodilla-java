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
        ForumStatistics forumStatistics = new ForumStatistics();

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
        ForumStatistics forumStatistics = new ForumStatistics();

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
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(10/2, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(0/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(0/1000, getAverageCommentsPerPostsTest, 0);
    }

    @Test
    public void testIfMoreCommentsThenPosts(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("user1");
        userNames.add("user2");
        int postsNumber = 2;
        int commentsNumber = 6;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(2/2, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(6/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(6/2, getAverageCommentsPerPostsTest, 0);
        Assert.assertTrue(forumStatistics.getnumberOfComments() > forumStatistics.getnumberOfPosts());
    }

    @Test
    public void testIfMorePostsThenComments(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        userNames.add("user1");
        userNames.add("user2");
        int postsNumber = 6;
        int commentsNumber = 3;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(6/2, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(3/2, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(3/6, getAverageCommentsPerPostsTest, 0);
        Assert.assertTrue(forumStatistics.getnumberOfComments() < forumStatistics.getnumberOfPosts());
    }

    @Test
    public void testIf0Users(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int postsNumber = 8;
        int commentsNumber = 2;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(0, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(2/8, getAverageCommentsPerPostsTest, 0);
    }

    @Test
    public void testIf100Users(){
        //Given
        Statistics statisticsMock   =   mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i=0; i < 100; i++){
            userNames.add("user"+i);
        }
        int postsNumber = 12;
        int commentsNumber = 4;
        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double getAveragePostsPerUserTest = forumStatistics.getAveragePostsPerUser();
        double getAverageCommentsPerUserTest = forumStatistics.getAverageCommentsPerUser();
        double getAverageCommentsPerPostsTest = forumStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(12/100, getAveragePostsPerUserTest, 0);
        Assert.assertEquals(4/100, getAverageCommentsPerUserTest, 0);
        Assert.assertEquals(4/12, getAverageCommentsPerPostsTest, 0);
    }
}
