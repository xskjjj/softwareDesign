import java.util.Comparator;

public class ByTrick implements Comparator<Flight> {
    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.num_of_trick()- o2.num_of_trick();
    }
}
