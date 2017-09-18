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
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if(statistics.userNames().size() > 0) {
            this.averagePostsPerUser = statistics.postsCount() / statistics.userNames().size();
            this.averageCommentsPerUser = statistics.postsCount() / statistics.userNames().size();
        }else{
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        }
        if(statistics.postsCount() > 0) {
            this.averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();
        }else{
            this.averageCommentsPerPosts = 0;
        }
    }
}
