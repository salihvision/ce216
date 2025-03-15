import java.util.ArrayList;

public class Library
{
    private ArrayList<Game> userLibrary = new ArrayList<>();

    public ArrayList<Game> getUserLibrary() {
        return userLibrary;
    }

    public void addToLibrary(Game game){
        userLibrary.add(game);
    }

    public ArrayList<Game> getSortedLibrary(SortType sortType)
    {
        return Sorting.sort(userLibrary, sortType);
    }

    public ArrayList<Game> mostPlayedList()
    {
        return getSortedLibrary(SortType.PLAY_TIME_DESC);
    }
    public ArrayList<Game> leastPlayedList()
    {
        return getSortedLibrary(SortType.PLAY_TIME_ASC);
    }
    public ArrayList<Game> alphabeticAZList()
    {
        return getSortedLibrary(SortType.GAME_NAME_ASC);
    }
    public ArrayList<Game> alphabeticZAList()
    {
        return getSortedLibrary(SortType.GAME_NAME_DESC);
    }
    public ArrayList<Game> newReleaseList()
    {
        return getSortedLibrary(SortType.RELEASE_YEAR_DESC);
    }
    public ArrayList<Game> oldReleaseList()
    {
        return getSortedLibrary(SortType.RELEASE_YEAR_ASC);
    }
    public ArrayList<Game> highRatingList()
    {
        return getSortedLibrary(SortType.PUBLIC_RATING_DESC);
    }
    public ArrayList<Game> lowRatingList()
    {
        return getSortedLibrary(SortType.PUBLIC_RATING_ASC);
    }
}