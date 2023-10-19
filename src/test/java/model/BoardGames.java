package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BoardGames {

    @JsonProperty ("termsofuse")
    private String termsOfUse;

    @JsonProperty ("boardgame")
    private List<BoardGame> boardGame;

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public List<BoardGame> getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(List<BoardGame> boardGame) {
        this.boardGame = boardGame;
    }
}
