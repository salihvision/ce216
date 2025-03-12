import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static ArrayList<Game> mostPlayedGames(ArrayList<Game> userLibrary){
        Collections.sort(userLibrary, new Comparator<Game>() {
            @Override
            public int compare(Game Game1, Game Game2) {
                return Float.compare(Game2.getHoursPlayed(), Game1.getHoursPlayed());
            }
        });
        return userLibrary ;
    }
}
