package atmproj;

public class Atm {

    private User currentUser;
    // check if username and password is valid
    public void authenticateUser(int userID, int userPIN) {
        // Check user credentials against stored data
        // (Replace with database or other storage mechanism)
        if (userID == 1234 && userPIN == 5678) {
            currentUser = new User(userID, userPIN, 10000.00); // Replace with actual balance
            System.out.println("Authentication successful. Welcome!");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }
   
    //Function to check user's account balance
    public void checkBalance() {
        if (currentUser != null) {
            System.out.println("Your current balance is: $" + currentUser.getAccountBalance());
        } else {
            System.out.println("Please authenticate first.");
        }
    }

    public void withdrawMoney(double amount) {   //function to withdraw money
        if (currentUser != null) {
            if (amount > currentUser.getAccountBalance()) {       //check whether user has sufficient finds to withdraw money
                System.out.println("Insufficient funds. Your current balance is: $" + currentUser.getAccountBalance());
            } else {
                currentUser.setAccountBalance(currentUser.getAccountBalance() - amount);
                System.out.println("Withdrawal successful. Please collect your cash.");
            }
        } else {
            System.out.println("Please authenticate first.");
        }
    }

    public void depositMoney(double amount) {  //function to deposit money
        if (currentUser != null) {
            currentUser.setAccountBalance(currentUser.getAccountBalance() + amount);
            System.out.println("Deposit successful. Your new balance is: $" + currentUser.getAccountBalance());
        } else {
            System.out.println("Please authenticate first.");
        }
    }

	public Object getCurrentUser() {
		return 1;
	}
}

