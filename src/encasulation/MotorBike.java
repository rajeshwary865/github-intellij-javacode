package encasulation;

public class MotorBike {
    private int speed;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int Speed) {
        if(speed>0)
            this.speed = speed;
    }
    void start() {
        System.out.println("Bike Started");
    }

}
