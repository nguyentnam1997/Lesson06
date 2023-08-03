public class Airplane extends Traffic{
    public static final int speed = 80;

    @Override
    public double timeTravel(double distance) {
        return distance / speed;
    }

    @Override
    public void print(double distance) {
        System.out.println("Thời gian đến nơi của máy bay là: " + timeTravel(distance) + "h");
    }
}
