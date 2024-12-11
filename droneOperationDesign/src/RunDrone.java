import java.util.ArrayList;

public class RunDrone {
    public static void main(String[] args) {
        // TODO: illustrate your implementations here

        TakeOff test1=new TakeOff(RecordFormat.INACTIVATED);
        Pucker test2=new Pucker(RecordFormat.FLV);
        LeftRight test3=new LeftRight(RecordFormat.MOV);
        ArrayList<Trick>flight_sequnce=new ArrayList<Trick>();
        Flight f_01=new Flight("FLIGHT1",flight_sequnce);
        f_01.addtrick(test1);
        f_01.addtrick(test2);
        f_01.addtrick(test3);
        f_01.total_unique_direction();

        TakeOff obj1=new TakeOff(RecordFormat.WMV);
        Pucker obj2=new Pucker(RecordFormat.MP4);
        ArrayList<Trick>flight_sequnce1=new ArrayList<Trick>();
        Flight f_02=new Flight("FLIGHT2",flight_sequnce1);
        f_02.addtrick(obj1);
        f_02.addtrick(obj2);
        f_02.total_unique_direction();



        TakeOff t1=new TakeOff(RecordFormat.INACTIVATED);
        LeftRight l1=new LeftRight(RecordFormat.MKV);
        ArrayList<Trick>flight_sequnce2=new ArrayList<Trick>();
        Flight f_03=new Flight("FLIGHT3",flight_sequnce2);
        f_03.addtrick(t1);
        f_03.addtrick(l1);
        f_03.total_unique_direction();


        ArrayList<Flight> flight_list=new ArrayList<>();
        Drone drone1=new Drone("DoneDemo",flight_list);
        drone1.addFlight(f_01);
        drone1.addFlight(f_02);
        drone1.addFlight(f_03);
        drone1.execute();

    }
}
