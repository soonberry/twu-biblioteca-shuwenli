package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-3-3.
 */
public class Movie extends Goods {
    String director;
    String rating;

    public Movie(String name,String yearPublished,String director, String rating) {
        this.name=name;
        this.yearPublished=yearPublished;
        this.director = director;
        if (Integer.valueOf(rating)<0||Integer.valueOf(rating)>10||!rating.equals("unrated"))
            System.out.println("Please input the right rating!");
        else this.rating = rating;
    }

    @Override
    public String toString(){
        return name+","+yearPublished+","+director+","+rating;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }
}
