package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Rating {

    @JsonProperty ("usersrated")
    public int usersRated;

    public double average;

    @JsonProperty("bayesaverage")
    public double bayesAverage;

    public List<Rank> ranks;

    public double stddev;
    public int median;
    public int owned;
    public int trading;
    public int wanting;
    public int wishing;

    @JsonProperty("numcomments")
    public int numComments;

    @JsonProperty("numweights")
    public int numWeights;

    @JsonProperty("averageweight")
    public int averageWeight;

    public int getUsersRated() {
        return usersRated;
    }

    public void setUsersRated(int usersRated) {
        this.usersRated = usersRated;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getBayesAverage() {
        return bayesAverage;
    }

    public void setBayesAverage(double bayesAverage) {
        this.bayesAverage = bayesAverage;
    }

    public List<Rank> getRanks() {
        return ranks;
    }

    public void setRanks(List<Rank> ranks) {
        this.ranks = ranks;
    }

    public double getStddev() {
        return stddev;
    }

    public void setStddev(double stddev) {
        this.stddev = stddev;
    }

    public int getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    public int getOwned() {
        return owned;
    }

    public void setOwned(int owned) {
        this.owned = owned;
    }

    public int getTrading() {
        return trading;
    }

    public void setTrading(int trading) {
        this.trading = trading;
    }

    public int getWanting() {
        return wanting;
    }

    public void setWanting(int wanting) {
        this.wanting = wanting;
    }

    public int getWishing() {
        return wishing;
    }

    public void setWishing(int wishing) {
        this.wishing = wishing;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public int getNumWeights() {
        return numWeights;
    }

    public void setNumWeights(int numWeights) {
        this.numWeights = numWeights;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(int averageWeight) {
        this.averageWeight = averageWeight;
    }
}
