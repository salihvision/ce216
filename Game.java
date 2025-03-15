public class Game
{
    private String gameName;
    private String developerName;
    private String publisherName;
    private int releaseYear;
    private float hoursPlayed;
    private String gameInfo;
    private int SteamID;
    private int publicRating;
    // TODO Cover pathi eklenmeli def path resim yok coverına çıkmalı
    
    public Game(String gameName, String developerName, String publisherName, int releaseYear, float hoursPlayed, String gameInfo, int SteamID, int publicRating)
    {
        this.gameInfo=gameInfo;
        this.gameName=gameName;
        this.hoursPlayed=hoursPlayed;     //ADD ADJUSTER METHOD
        this.publisherName=publisherName;
        this.releaseYear=releaseYear;
        this.developerName=developerName;
        this.SteamID=SteamID;
        this.publicRating=publicRating;   //ADD ADJUSTER METHOD
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
    public String getDeveloperName() {
        return developerName;
    }
    public int getSteamID(){
        return SteamID;
    }
    public int getPublicRating() { return publicRating; }
}