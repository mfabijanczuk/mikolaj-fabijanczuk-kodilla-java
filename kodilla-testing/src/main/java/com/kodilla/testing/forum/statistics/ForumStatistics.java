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


    public ForumStatistics(){
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
        this.statistics = statistics;
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if(numberOfUsers > 0) {
            this.averagePostsPerUser = (double)(statistics.postsCount() / statistics.userNames().size());
            this.averageCommentsPerUser = (double)(statistics.commentsCount() / statistics.userNames().size());
        }else{
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        }
        if(numberOfPosts > 0) {
            this.averageCommentsPerPosts = (double)(statistics.commentsCount() / statistics.postsCount());
        }else{
            this.averageCommentsPerPosts = 0;
        }
    }
}
