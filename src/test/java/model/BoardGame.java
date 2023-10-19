package model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BoardGame {

    @JsonProperty ("objectid")
    private int objectId;

    @JsonProperty ("yearpublished")
    private int yearPublished;

    @JsonProperty ("minplayers")
    private int minPlayers;

    @JsonProperty ("maxplayers")
    private int maxPlayers;

    @JsonProperty ("playingTime")
    private double playingTime;

    @JsonProperty ("minplaytime")
    private double minPlayTime;

    @JsonProperty ("maxplaytime")
    private double maxPlayTime;

    private int age;
    private List<Names> name;
    private String description;
    private String thumbnail;
    private String image;

   @JsonProperty ("boardgamepublisher")
    private List<BoardGameId> boardGamePublisher;

   @JsonProperty ("cardset")
   private List<BoardGameId>  cardSet;

   @JsonProperty ("boardgamefamily")
   private List<BoardGameId>  boardGameFamily;

   @JsonProperty("boardgamedesigner")
   private List<BoardGameId>  boardGameDesigner;

   @JsonProperty("boardgameversion")
   private List<BoardGameId>  boardGameVersion;

   @JsonProperty("boardgamepodcastepisode")
   private List<BoardGameId>  boardGamePodcastEpisode;

   @JsonProperty("boardgamecategory")
   private List<BoardGameId>  boardGameCategory;

   @JsonProperty ("boardgameeditor")
   private List<BoardGameId>  boardGameEditor;

   @JsonProperty("boardgameartist")
   private List<BoardGameId>  boardGameArtist;

   @JsonProperty ("boardgamegraphicdesigner")
   private List<BoardGameId>  boardGameGraphicDesigner;

   @JsonProperty("boardgameexpansion")
   private List<BoardGameId>  boardGameExpansion;

   @JsonProperty("boardgamemechanic")
   private List<BoardGameId>  boardGameMechanic;

   private List<Poll> poll;

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public double getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

    public double getMinPlayTime() {
        return minPlayTime;
    }

    public void setMinPlayTime(double minPlayTime) {
        this.minPlayTime = minPlayTime;
    }

    public double getMaxPlayTime() {
        return maxPlayTime;
    }

    public void setMaxPlayTime(double maxPlayTime) {
        this.maxPlayTime = maxPlayTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Names> getName() {
        return name;
    }

    public void setName(List<Names> name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<BoardGameId> getBoardGamePublisher() {
        return boardGamePublisher;
    }

    public void setBoardGamePublisher(List<BoardGameId> boardGamePublisher) {
        this.boardGamePublisher = boardGamePublisher;
    }

    public List<BoardGameId> getCardSet() {
        return cardSet;
    }

    public void setCardSet(List<BoardGameId> cardSet) {
        this.cardSet = cardSet;
    }

    public List<BoardGameId> getBoardGameFamily() {
        return boardGameFamily;
    }

    public void setBoardGameFamily(List<BoardGameId> boardGameFamily) {
        this.boardGameFamily = boardGameFamily;
    }

    public List<BoardGameId> getBoardGameDesigner() {
        return boardGameDesigner;
    }

    public void setBoardGameDesigner(List<BoardGameId> boardGameDesigner) {
        this.boardGameDesigner = boardGameDesigner;
    }

    public List<BoardGameId> getBoardGameVersion() {
        return boardGameVersion;
    }

    public void setBoardGameVersion(List<BoardGameId> boardGameVersion) {
        this.boardGameVersion = boardGameVersion;
    }

    public List<BoardGameId> getBoardGamePodcastEpisode() {
        return boardGamePodcastEpisode;
    }

    public void setBoardGamePodcastEpisode(List<BoardGameId> boardGamePodcastEpisode) {
        this.boardGamePodcastEpisode = boardGamePodcastEpisode;
    }

    public List<BoardGameId> getBoardGameCategory() {
        return boardGameCategory;
    }

    public void setBoardGameCategory(List<BoardGameId> boardGameCategory) {
        this.boardGameCategory = boardGameCategory;
    }

    public List<BoardGameId> getBoardGameEditor() {
        return boardGameEditor;
    }

    public void setBoardGameEditor(List<BoardGameId> boardGameEditor) {
        this.boardGameEditor = boardGameEditor;
    }

    public List<BoardGameId> getBoardGameArtist() {
        return boardGameArtist;
    }

    public void setBoardGameArtist(List<BoardGameId> boardGameArtist) {
        this.boardGameArtist = boardGameArtist;
    }

    public List<BoardGameId> getBoardGameGraphicDesigner() {
        return boardGameGraphicDesigner;
    }

    public void setBoardGameGraphicDesigner(List<BoardGameId> boardGameGraphicDesigner) {
        this.boardGameGraphicDesigner = boardGameGraphicDesigner;
    }

    public List<BoardGameId> getBoardGameExpansion() {
        return boardGameExpansion;
    }

    public void setBoardGameExpansion(List<BoardGameId> boardGameExpansion) {
        this.boardGameExpansion = boardGameExpansion;
    }

    public List<BoardGameId> getBoardGameMechanic() {
        return boardGameMechanic;
    }

    public void setBoardGameMechanic(List<BoardGameId> boardGameMechanic) {
        this.boardGameMechanic = boardGameMechanic;
    }

    public List<Poll> getPoll() {
        return poll;
    }

    public void setPoll(List<Poll> poll) {
        this.poll = poll;
    }
}
