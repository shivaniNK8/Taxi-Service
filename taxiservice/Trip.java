package taxiservice;

public class Trip {
	private int tripId;
	private static int tid=0;
	private User user;
	private double startTime;
	private double endTime;
	private int amount;
	private Taxi taxi;
	
	

	public Trip(User user,double startTime) {
		super();
		this.user = user;
		tripId=++tid;
		this.startTime=startTime;
		this.amount=0;
	}
	
	public void calculateAmount(){
		
		amount=(int)(endTime-startTime)*6;
		
	}
	
	


	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", user=" + user + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", amount=" + amount + "]";
	}
	

	
	
	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	

	public int getAmount() {
		return amount;
	}


	public static void main(String[] args) {
		User user1=new User();
		Trip trip=new Trip(user1, 10.0);
		trip.setEndTime(20.00);
		
		trip.calculateAmount();
		System.out.println(trip);
		System.out.println("Amount:"+trip.getAmount());
		

	}

}
