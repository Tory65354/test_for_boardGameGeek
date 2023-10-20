package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Statistics {

    public int page;

    @JsonProperty("ratings")
    public List<Rating> ratings;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
