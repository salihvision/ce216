public class Game {

    private String gameName;
    private String studioName;
    private String publisherName;
    private int releaseYear;
    private float hoursPlayed;
    private String gameInfo;
    private int SteamID;
    // TODO Cover pathi eklenmeli def path resim yok coverına çıkmalı
    
    public Game(String gameName, String studioName, String publisherName, int releaseYear, float hoursPlayed, String gameInfo, int SteamID){
        this.gameInfo=gameInfo;
        this.gameName=gameName;
        this.hoursPlayed=hoursPlayed;
        this.publisherName=publisherName;
        this.releaseYear=releaseYear;
        this.studioName=studioName;
        this.SteamID=SteamID;
    }

    public float getHoursPlayed() {
        return hoursPlayed;
    }
    public String getGameInfo() {
        return gameInfo;
    }
    public String getGameName() {
        return gameName;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getStudioName() {
        return studioName;
    }
    public int getSteamID(){
        return SteamID;
    }
}