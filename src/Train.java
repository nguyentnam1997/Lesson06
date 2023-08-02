public class Train extends Traffic {
    private static final int speed = 40;
    public Train(int distance) {
        super(distance);
    }

    @Override
    public double timeTravel() {
        return (double) getDistance() / speed;
    }

    @Override
    public void print() {
        System.out.println("Thời gian đến nơi của tàu hoả là: " + timeTravel() + "h");
    }
}
