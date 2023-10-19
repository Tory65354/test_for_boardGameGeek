package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardGameId {

    @JsonProperty("objectid")
    private String objectId;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
}
