import java.util.ArrayList;

public class TakeOff implements Trick{
    private ArrayList<DroneMove> takeoff_move;
    private TrickName name=TrickName.TAKEOFF;
    private ArrayList<Direction>t_list;
    private RecordFormat format;


    public TakeOff(RecordFormat pformat){
        ArrayList<DroneMove> takeoff_move=new ArrayList<DroneMove>();
        ArrayList<Direction> t_list=new ArrayList<Direction>();
        this.takeoff_move=takeoff_move;
        this.t_list=t_list;
        format=pformat;
        DroneMove up1=new DroneMove(Direction.UP,Speed.LOW,2);
        DroneMove up2=new DroneMove(Direction.UP, Speed.MODERATE,2);

        takeoff_move.add(up1);
        takeoff_move.add(up2);
        t_list.add(Direction.UP);


    }



    @Override
    public void getTrick() {
        System.out.println(name+"-------------------------------");
        System.out.println("Recording: "+format);
        for (DroneMove droneMove : takeoff_move) {
            System.out.println("Move" + droneMove.getDirection() + droneMove.getDistance() + "m at"
                    + droneMove.getSpeed() + "speed.");
        }
    }

    public RecordFormat getFormat(){return format;}

    @Override
    public ArrayList<Direction> get_list() {
        return t_list;
    }

    @Override
    public int uniqueMove() {
        return 2;
    }

    @Override
    public TrickName getTrickname() {
        return name;
    }


}
