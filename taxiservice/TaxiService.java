package taxiservice;

import java.util.ArrayList;
import taxiservice.Location;
import taxiservice.Taxi;

public class TaxiService {
    public void start(int num) {
    }

    public int request(int userId, Location loc) {
        return 0;
    }

    public int release(int userId, Location loc) {
        return 5;
    }

    public ArrayList<Taxi> getTaxis() {
        return new ArrayList<Taxi>();
    }
}