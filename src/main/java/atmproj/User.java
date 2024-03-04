package atmproj;

public class User {
    private int userID;
    private int userPIN;
    private double accountBalance;

    public User(int userID, int userPIN, double accountBalance) {
        this.userID = userID;
        this.userPIN = userPIN;
        this.accountBalance = accountBalance;
    }
    
    //getter and setters used for i/p and 0/p
    
    public int getUserId()
    {
    	return userID;
    }
    public int getUserPin()
    {
    	return userPIN;
    }


	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double d) {
		this.accountBalance=d;
	}

}
