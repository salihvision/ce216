import java.util.Comparator;

public enum SortType
{
    PLAY_TIME_ASC(Comparator.comparing(Game::getHoursPlayed)),
    PLAY_TIME_DESC(Comparator.comparing(Game::getHoursPlayed).reversed()),

    GAME_NAME_ASC(Comparator.comparing(Game::getGameName, String.CASE_INSENSITIVE_ORDER)),
    GAME_NAME_DESC(Comparator.comparing(Game::getGameName, String.CASE_INSENSITIVE_ORDER).reversed()),

    STUDIO_NAME_ASC(Comparator.comparing(Game::getDeveloperName, String.CASE_INSENSITIVE_ORDER)), //BÖYLE Mİ OLMALI EMİN DEĞİLİM? BENCE STUDIO/PUBLISHER AYNI OLAN OYUNLARI GRUPLAMALIYIZ
    STUDIO_NAME_DESC(Comparator.comparing(Game::getDeveloperName, String.CASE_INSENSITIVE_ORDER).reversed()),

    PUBLISHER_NAME_ASC(Comparator.comparing(Game::getPublisherName, String.CASE_INSENSITIVE_ORDER)),
    PUBLISHER_NAME_DESC(Comparator.comparing(Game::getPublisherName, String.CASE_INSENSITIVE_ORDER).reversed()),

    RELEASE_YEAR_ASC(Comparator.comparingInt(Game::getReleaseYear)),
    RELEASE_YEAR_DESC(Comparator.comparingInt(Game::getReleaseYear).reversed()),

    PUBLIC_RATING_ASC(Comparator.comparingInt(Game::getPublicRating)),
    PUBLIC_RATING_DESC(Comparator.comparingInt(Game::getPublicRating).reversed());  //IF GOING TO UPDATE, ADJUST THE ";" POSITION

    //ADD GENRE,TYPE SORTING (MORE LIKE GROUPING INSTEAD OF SORT??)

    private final Comparator<Game> comparator;

    SortType(Comparator<Game> comparator)
    {
        this.comparator = comparator;
    }

    public Comparator<Game> getComparator()
    {
        return comparator;
    }
}
