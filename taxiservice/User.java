package taxiservice;

public class User {

	private int userId;
	private boolean status;
	private int tripCount;
	private static int uid=0;
	
	class Wallet{
		private int balance;
		public void add(int amount){
			balance+=amount;
		}
		
		public void deduct(int amount){
			balance-=amount;
		}

		public Wallet(int balance) {
			super();
			this.balance = balance;
		}
		
		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Wallet [balance=" + balance + "]";
		}
		
		
		
	}
	
	private Wallet wallet;
	
	
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getTripCount() {
		return tripCount;
	}


	public void setTripCount(int tripCount) {
		this.tripCount = tripCount;
	}


	public Wallet getWallet() {
		return wallet;
	}


	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}


	public User() {
		super();
		userId=++uid;
		wallet=new Wallet(100);
		status=false;
		tripCount=0;
		
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", status=" + status + ", tripCount=" + tripCount + ", wallet=" + wallet
				+ "]";
	}


	public static void main(String[] args){
		User user = new User();
		System.out.println(user);
	}
	
	
}
