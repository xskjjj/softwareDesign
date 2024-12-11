import java.util.Comparator;

public class ByNumUniqueMove implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.total_unique_move() - o2.total_unique_move();
    }
}
