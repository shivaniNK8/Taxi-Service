package taxiservice;

public class Location {
    private int x;
    private int y;

    public Location(int xa, int ya) {
        this.x = xa;
        this.y = ya;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }
}