import java.util.ArrayList;


public class Flight implements Movement{
    private ArrayList<Trick>flight_sequnce=new ArrayList<>();
    private String flight_name;

    public Flight(String pflight_name,ArrayList<Trick> pflight_sequnce){
        flight_name=pflight_name;
        flight_sequnce.addAll(pflight_sequnce);
    }

    public String getFlight_name(){
        return flight_name;
    }
    public void addtrick(Trick trick){
        flight_sequnce.add(trick);
    }

    public int num_of_trick(){return flight_sequnce.size();}
    public int total_unique_move(){
        ArrayList<Trick> uniquetricklist=new ArrayList<>();
        ArrayList<TrickName> namelist=new ArrayList<>();
        int total=0;
        for (int j=0;j<flight_sequnce.size();j++) {
            if(!(namelist.contains(flight_sequnce.get(j).getTrickname()))){
                namelist.add(flight_sequnce.get(j).getTrickname());
                uniquetricklist.add(flight_sequnce.get(j));
            }
        }
        for(int i=0;i<uniquetricklist.size();i++){
            total+=uniquetricklist.get(i).uniqueMove();
        }
        return total;
    }
    public int total_unique_direction(){
        ArrayList<Direction> count=new ArrayList<Direction>();
        try {
            for (int j=0;j<flight_sequnce.size();j++) {
                for(int i=0;i<flight_sequnce.get(j).get_list().size();i++){
                    if(!(count.contains(flight_sequnce.get(j).get_list().get(i)))){
                        count.add(flight_sequnce.get(j).get_list().get(i));
                    }


                }
            }
            System.out.println("Total unique direction number for "+flight_name+" is: "+count.size());
            return count.size();
        }catch (NullPointerException e){
            System.out.println("null");
        }
        return count.size();

    }

    @Override
    public void execute() {
        for (Trick trick : flight_sequnce) {
            trick.getTrick();
        }
    }
}




