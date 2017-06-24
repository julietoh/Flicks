package com.example.joh.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by joh on 6/21/17.
 */
@Parcel
public class Movie {

    // values from API
    String title;
    String overview;
    String posterPath; // only the path
    String backdropPath;
    Double voteAverage;

    public Movie() {}

    public Double getVoteAverage() {
        return voteAverage;
    }

    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {

        return overview;
    }

    public String getPosterPath() {

        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
