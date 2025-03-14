import java.util.ArrayList;

public class Library {
    
    Sorting sorter = new Sorting();

    private ArrayList<Game> userLibrary;

    public ArrayList<Game> getUserLibrary() {
        return userLibrary;
    }

    public void addToLibrary(Game game){
        userLibrary.add(game);
    }

    public ArrayList<Game> mostPlayedList(){
        ArrayList<Game> userLibList = getUserLibrary();
        sorter.mostPlayedGames(userLibList);
        return userLibList;
    }
}