package com.kodilla.testing.forum.statistics;

import java.util.HashMap;

public class ForumStatistics {
    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPosts;


    public ForumStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    public int getnumberOfUsers(){
        return numberOfUsers;
    }

    public int getnumberOfPosts(){
        return numberOfPosts;
    }

    public int getnumberOfComments(){
        return numberOfComments;
    }

    public double getAveragePostsPerUser(){
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser(){
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts(){
        return averageCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        HashMap<Integer, Double> resultStatisticsMap = new HashMap<Integer, Double>();
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.averagePostsPerUser = statistics.postsCount()/statistics.userNames().size();
        this.averageCommentsPerUser = statistics.postsCount()/statistics.userNames().size();
        if(statistics.postsCount()>0) {
            this.averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();
        }
        resultStatisticsMap.put(0, (double)numberOfUsers);
        resultStatisticsMap.put(1, (double)numberOfPosts);
        resultStatisticsMap.put(2, (double)numberOfComments);
        resultStatisticsMap.put(3, averagePostsPerUser);
        resultStatisticsMap.put(4, averageCommentsPerUser);
        resultStatisticsMap.put(5, averageCommentsPerPosts);

    }

}
