package taxiservice;

import taxiservice.Location;
import taxiservice.Taxi;

public class Car extends Taxi{
       
    
    private String carID;

    

    public String getCarID() {
        return carID;
    }  
    
    public Car(Location loc,boolean isBusy,String carID) {
        
        this.isBusy=isBusy;
        this.carID=carID;
        this.setLocation(loc);
    }
    
    
}
