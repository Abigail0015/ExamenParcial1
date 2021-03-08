package com.oop.exam.model;


import java.util.List;

public class Movie
{
    String title;
    int year;
    String director;
    private  List <Platform>platforms;
    private List<String> actors;
    String Synopsis;
    private List<Review> reviews;

    public Movie(String title,int year,String director;)
    {
        this.title = title;
        this.year = year;
        this.director = director;
    }


    public void addReview(Review review)
    {
        this.reviews.add(review);
    }


    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public String getDirector()
    {
        return director;
    }


    public void setActors(List<String> actors)
    {
        this.actors = actors;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public void setSynopsis(String synopsis)
    {
        Synopsis = synopsis;
    }

    public List<String> getActors()
    {
        return actors;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }
}
