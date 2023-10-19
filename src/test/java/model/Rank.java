package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rank {

    public String type;
    public int id;
    public String name;

    @JsonProperty("friendlyname")
    public String friendlyName;

    public int value;

    @JsonProperty("bayesaverage")
    public double bayesAverage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getBayesAverage() {
        return bayesAverage;
    }

    public void setBayesAverage(double bayesAverage) {
        this.bayesAverage = bayesAverage;
    }
}
