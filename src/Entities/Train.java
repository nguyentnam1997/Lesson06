package Entities;

public class Train extends Traffic {
    public static final int speed = 40;
    @Override
    public double timeTravel(double distance) {
        return distance / speed;
    }

    @Override
    public void print(double distance) {
        System.out.println("Thời gian đến nơi của tàu hoả là: " + timeTravel(distance) + "h");
    }
}
