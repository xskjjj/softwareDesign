import java.util.ArrayList;


public class Pucker implements Trick{
    private ArrayList<DroneMove> pucker_move;
    private TrickName name=TrickName.PUCKER;
    private ArrayList<Direction>p_list;
    private RecordFormat format;

    public Pucker(RecordFormat pformat){
        ArrayList<DroneMove> pucker_move=new ArrayList<DroneMove>();
        ArrayList<Direction>p_list=new ArrayList<Direction>();
        DroneMove up1=new DroneMove(Direction.UP,Speed.LOW,2);
        DroneMove left1=new DroneMove(Direction.LEFT, Speed.MODERATE,1);
        DroneMove left2=new DroneMove(Direction.LEFT, Speed.MODERATE,1);
        DroneMove left3=new DroneMove(Direction.LEFT, Speed.MODERATE,1);
        DroneMove left4=new DroneMove(Direction.LEFT, Speed.MODERATE,1);
        DroneMove down=new DroneMove(Direction.DOWN,Speed.LOW,2);
        this.pucker_move=pucker_move;
        this.p_list=p_list;
        format=pformat;
        pucker_move.add(up1);
        pucker_move.add(left1);
        pucker_move.add(left2);
        pucker_move.add(left3);
        pucker_move.add(left4);
        pucker_move.add(down);
        p_list.add(Direction.UP);
        p_list.add(Direction.DOWN);
        p_list.add(Direction.LEFT);

    }

    @Override
    public void getTrick() {
        System.out.println(name+"---------------------------------");
        System.out.println("Recording: "+format);
        for (DroneMove droneMove : pucker_move) {
            System.out.println("Move" + droneMove.getDirection() + droneMove.getDistance() + "m at"
                    + droneMove.getSpeed() + "speed.");
        }
    }

    @Override
    public ArrayList<Direction> get_list() {
        return p_list;
    }

    @Override
    public int uniqueMove() {
        return 3;
    }

    @Override
    public TrickName getTrickname() {
        return name;
    }


}
