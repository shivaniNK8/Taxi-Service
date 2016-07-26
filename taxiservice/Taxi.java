package taxiservice;

import taxiservice.Location;

public class Taxi {
    private Location loc;
    boolean isBusy;

    
    Location getLocation() {
        return this.loc;
    }

    public void setLocation(Location loc) {
        this.loc = loc;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }
    
    

    boolean isBusy() {
        return this.isBusy;
    }
}