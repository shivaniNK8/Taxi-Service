package taxiservice;

import java.util.ArrayList;
import java.util.List;

public class TaxiService extends TaxiFleet{
	private List<Trip> tripList; 	
	
	
	public TaxiService() {
		super();
		tripList=new ArrayList<Trip>();
	}
	
	public int allot(User user,Location loc, Trip trip){
		if(user.getWallet().getBalance()<5)
		{
			return -1;
		}
		int tStatus=request(user.getUserId(), loc);
		
		int count=user.getTripCount();	
		if(tStatus==0)		//Change value
		{
			
			user.setTripCount(++count);
			user.setStatus(true);
			List<Taxi> tList=getTaxis();
			tList.add(new Taxi());
			trip.setTaxi(tList.get(0));		//Location logic to select nearest taxi
			trip.getTaxi().setIsBusy(true);
			if(user.getTripCount()==5)
			{
				user.setTripCount(0);
				
				user.getWallet().add(50);
			}
		}
		else
		{
			user.getWallet().deduct(10);
		}
		
		return 0;		//Fix status codes
	}
	
	public void deallot(User user, Location loc, Trip trip){
		
		trip.calculateAmount();
		user.getWallet().deduct(trip.getAmount());
		trip.getTaxi().setIsBusy(false);
		System.out.println("Trip Amount:"+ trip.getAmount());
	}
	
	public static void main(String[] args) {
		TaxiService tservice=new TaxiService();
		User user = new User();
		Location loc=new Location(50, 50);
		Trip trip=new Trip(user, 10.00);
		trip.setEndTime(20.00);
	//	trip.calculateAmount();
		tservice.allot(user, loc,trip);
		tservice.deallot(user, loc, trip);
	/*	tservice.allot(user, loc,trip);
		tservice.allot(user, loc,trip);
		tservice.allot(user, loc,trip);
		tservice.allot(user, loc,trip);*/
		//System.out.println(user);
		System.out.println(trip);
		

	}
}
