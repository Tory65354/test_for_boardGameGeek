package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {

    @JsonProperty("numplayers")
    private int numPlayers;

    private String value;

    @JsonProperty("numvotes")
    private int numVotes;

    private int level;

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
