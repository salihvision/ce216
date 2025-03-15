import java.util.ArrayList;
import java.util.Comparator;

public class Sorting
{
    public static ArrayList<Game> sort(ArrayList<Game> games, Comparator<Game> comparator)
    {
        ArrayList<Game> sortedList = new ArrayList<>(games);
        sortedList.sort(comparator);
        return sortedList;
    }

    public static ArrayList<Game> sort(ArrayList<Game> games, SortType sortType)
    {
        return sort(games, sortType.getComparator());
    }
}