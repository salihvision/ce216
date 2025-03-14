import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {

    public static ArrayList<Game> mostPlayedGames(ArrayList<Game> userLibrary){
        ArrayList<Game> sortedList = new ArrayList<>(userLibrary);
        sortedList.sort(Comparator.comparing(Game::getHoursPlayed).reversed());
        return sortedList;
    }
    
    public static ArrayList<Game> leastPlayedGames(ArrayList<Game> userLibrary){
        ArrayList<Game> sortedList = new ArrayList<>(userLibrary);
        sortedList.sort(Comparator.comparing(Game::getHoursPlayed));
        return sortedList;
    }

    public static ArrayList<Game> sortByGameNameAsc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getGameName));
        return sortedList;
    }

    public static ArrayList<Game> sortByGameNameDesc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getGameName).reversed());
        return sortedList;
    }

    public static ArrayList<Game> sortByStudioNameAsc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getStudioName));
        return sortedList;
    }

    public static ArrayList<Game> sortByStudioNameDesc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getStudioName).reversed());
        return sortedList;
    }

    public static ArrayList<Game> sortBySteamIDAsc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparingInt(Game::getSteamID));
        return sortedList;
    }

    public static ArrayList<Game> sortBySteamIDDesc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparingInt(Game::getSteamID).reversed());
        return sortedList;
    }

    public static ArrayList<Game> sortByReleaseYearAsc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparingInt(Game::getReleaseYear));
        return sortedList;
    }

    public static ArrayList<Game> sortByReleaseYearDesc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparingInt(Game::getReleaseYear).reversed());
        return sortedList;
    }

    public static ArrayList<Game> sortByPublisherNameAsc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getPublisherName));
        return sortedList;
    }

    public static ArrayList<Game> sortByPublisherNameDesc(ArrayList<Game> games) {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(Comparator.comparing(Game::getPublisherName).reversed());
        return sortedList;
    }
}
