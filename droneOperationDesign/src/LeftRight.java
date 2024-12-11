import java.util.ArrayList;
import java.util.HashMap;

public class LeftRight implements Trick{

    private ArrayList<DroneMove> leftright_move;
    private TrickName name=TrickName.LEFTRIGHT;
    private ArrayList<Direction>l_list;
    private RecordFormat formats;


    public LeftRight(RecordFormat pformats){
        ArrayList<DroneMove> leftright_move=new ArrayList<DroneMove>();
        this.leftright_move=leftright_move;
        formats=pformats;
        DroneMove up1=new DroneMove(Direction.UP,Speed.LOW,1);
        DroneMove left1=new DroneMove(Direction.LEFT, Speed.MODERATE,2);
        DroneMove right1=new DroneMove(Direction.RIGHT, Speed.MODERATE,2);
        DroneMove left2=new DroneMove(Direction.LEFT, Speed.MODERATE,2);
        DroneMove right2=new DroneMove(Direction.RIGHT, Speed.MODERATE,2);
        DroneMove down=new DroneMove(Direction.DOWN,Speed.LOW,1);
        leftright_move.add(up1);
        leftright_move.add(left1);
        leftright_move.add(right1);
        leftright_move.add(left2);
        leftright_move.add(right2);
        leftright_move.add(down);
        ArrayList<Direction>l_list=new ArrayList<Direction>();
        this.l_list=l_list;
        l_list.add(Direction.UP);
        l_list.add(Direction.DOWN);
        l_list.add(Direction.LEFT);
        l_list.add(Direction.RIGHT);
    }

    @Override
    public void getTrick() {
        System.out.println(name+"--------------------------------");
        System.out.println("Recording: "+formats);
        for (DroneMove droneMove : leftright_move) {
            System.out.println("Move" + droneMove.getDirection() + droneMove.getDistance() + "m at"
                    + droneMove.getSpeed() + "speed.");
        }
    }


    public RecordFormat getFormats(){return formats;}

    @Override
    public ArrayList<Direction> get_list() {
        return l_list;
    }

    @Override
    public int uniqueMove() {
        return 4;
    }

    @Override
    public TrickName getTrickname() {
        return name;
    }
}
