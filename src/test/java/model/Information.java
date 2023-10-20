package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Information {

    @JsonProperty ("boardgames")
    private BoardGames boardGames;

    public BoardGames getBoardGames() {
        return boardGames;
    }

    public void setBoardGames(BoardGames boardGames) {
        this.boardGames = boardGames;
    }
}
