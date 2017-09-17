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
        //Then
        Assert.assertEquals((double)0, getAveragePostsPerUserTest);
    }
}
