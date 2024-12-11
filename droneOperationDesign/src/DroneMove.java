public class DroneMove {
    private Direction direction;
    private Speed speed;
    private int distance;

    public DroneMove(Direction pdirection,Speed pspeed,int pdistance){
        direction=pdirection;
        speed=pspeed;
        distance=pdistance;
    }
    public Direction getDirection(){
        return direction;
    }

    public Speed getSpeed(){
        return speed;
    }

    public int getDistance(){
        return distance;
    }
}
