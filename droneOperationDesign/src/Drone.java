import java.util.ArrayList;


public class Drone implements Movement {
    private ArrayList<Flight> fights=new ArrayList<>();
    final private String name;

    /**
     * Constructor
     * @param name of the drone
     */
    public Drone(String pname,ArrayList<Flight> pfights) {
        name = pname;
        fights.addAll(pfights);
    }

    /**
     * Name getter
     * @return drone name
     */
    public String getName() {
        return name;
    }
    public void addFlight(Flight flightname){
        fights.add(flightname);
    }
    public void compare_trick(){
        fights.sort(new ByTrick());
        System.out.println("Trick sort result:");
        for (Flight fight : fights) System.out.println(fight.getFlight_name());
    }
    public void compare_uniquemove(){
        fights.sort(new ByNumUniqueMove());
        System.out.println("Unique move sort result:");
        for (Flight fight : fights) System.out.println(fight.getFlight_name());
    }

    @Override
    public void execute() {
       System.out.println(name);
        for (Flight fight : fights) {
            System.out.println(fight.getFlight_name());
            fight.execute();
            System.out.println("----------------------------------------------------------------");
        }
        compare_trick();
        compare_uniquemove();
    }
}
