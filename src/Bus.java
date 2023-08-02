public class Bus extends Traffic{
    private static final int speed = 20;

    public Bus(int distance) {
        super(distance);
    }

    @Override
    public double timeTravel() {
        return (double) getDistance() / speed;
    }

    @Override
    public void print() {
        System.out.println("Thời gian đến nơi của xe buýt là: " + timeTravel() + "h");
    }
}
