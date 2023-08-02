public class Airplane extends Traffic{
    private static final int speed = 80;
    public Airplane(int distance) {
        super(distance);
    }

    @Override
    public double timeTravel() {
        return (double) getDistance() / speed;
    }

    @Override
    public void print() {
        System.out.println("Thời gian đến nơi của máy bay là: " + timeTravel() + "h");
    }
}
