package com.oop.exam.model;


public class Review
{
    User user;
    MovieScore score;
    String review;

    public Review(User user, MovieScore score, String review)
    {
        this.user = user;
        this.score = score;
        this.review = review;
    }

    public User getUser()
    {
        return user;
    }

    public String getReview() {
        return review;
    }
    public MovieScore getScore()
    {
        return score;
    }

    public boolean isEmpty()
    {
        if (review != null)
        {
            return (true);
        }
        else {
            return (false);
        }
    }
}
