package com.example.movietv;

public class Movie {

    private String mTitle;

    private String mId;

    private String mRating;

    private String mReleaseDate;

    private String mPosterUrl;

    public Movie(String title, String id, String rating, String releaseDate, String posterUrl){
        mTitle = title;
        mId = id;
        mRating = rating;
        mReleaseDate = releaseDate;
        mPosterUrl = posterUrl;
    }

    public void setTitle(String text) { mTitle = text; }

    public void setId(String text) { mId = text; }

    public void setRating(String text) { mRating = text; }

    public void setReleaseDate(String text) { mReleaseDate = text; }

    public void setPosterUrl(String text) { mPosterUrl = text; }

    public String getTitle() { return mTitle; }

    public String getId() { return mId; }

    public String getRating() { return mRating; }

    public String getReleaseDate() { return mReleaseDate; }

    public String getPosterUrl() { return mPosterUrl; }

}
