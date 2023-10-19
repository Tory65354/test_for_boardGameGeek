package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Names {

    @JsonProperty ("sortindex")
    private int sortIndex;

    @JsonProperty("primary")
    private boolean primary;

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
