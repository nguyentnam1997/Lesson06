public class Bus extends Traffic{
    public static final int speed = 20;

    @Override
    public double timeTravel(double distance) {
        return distance / speed;
    }

    @Override
    public void print(double distance) {
        System.out.println("Thời gian đến nơi của xe buýt là: " + timeTravel(distance) + "h");
    }
}
