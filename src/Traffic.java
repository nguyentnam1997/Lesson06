public abstract class Traffic {
    private int distance;
    public Traffic(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public abstract double timeTravel();

    public abstract void print();
}
