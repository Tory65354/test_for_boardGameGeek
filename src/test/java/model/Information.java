package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Information {

    @JsonProperty ("boardgames")
    private List<BoardGames> boardGames;

    public List<BoardGames> getBoardGames() {
        return boardGames;
    }

    public void setBoardGames(List<BoardGames> boardGames) {
        this.boardGames = boardGames;
    }
}
