package com.kodilla.testing.forum.statistics;

import java.util.HashMap;

public class ForumStatistics {
    Statistics statistics;


    public ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public int getnumberOfUsers(){
        int numberOfUsers = statistics.userNames().size();
        return numberOfUsers;
    }

    public int getnumberOfPosts(){
        int numberOfPosts = statistics.postsCount();
        return numberOfPosts;
    }

    public int getnumberOfComments(){
        int numberOfComments = statistics.commentsCount();
        return numberOfComments;
    }

    public double getAveragePostsPerUser(){
        double averagePostsPerUser = statistics.postsCount()/statistics.userNames().size();
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser(){
        double averageCommentsPerUser = statistics.postsCount()/statistics.userNames().size();
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts(){
        double averageCommentsPerPosts = statistics.commentsCount()/statistics.postsCount();
        return averageCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        HashMap<Integer, Double> resultStatisticsMap = new HashMap<Integer, Double>();
        int numberOfUsers = statistics.userNames().size();
        int numberOfPosts = statistics.postsCount();
        int numberOfComments = statistics.commentsCount();
        double averagePostsPerUser = statistics.postsCount()/statistics.userNames().size();
        double averageCommentsPerUser = statistics.postsCount()/statistics.userNames().size();
        double averageCommentsPerPosts = statistics.commentsCount()/statistics.postsCount();

        resultStatisticsMap.put(0, (double)numberOfUsers);
        resultStatisticsMap.put(1, (double)numberOfPosts);
        resultStatisticsMap.put(2, (double)numberOfComments);
        resultStatisticsMap.put(3, averagePostsPerUser);
        resultStatisticsMap.put(4, averageCommentsPerUser);
        resultStatisticsMap.put(5, averageCommentsPerPosts);

    }

}
