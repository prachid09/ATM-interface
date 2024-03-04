package atmproj;

import java.util.Scanner;

//main class where user can access functionalities he needs

public class Main {
	public static void main(String[] args) {
	    Atm atm = new Atm();

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter your User ID: ");
	    int userID = sc.nextInt();

	    System.out.println("Enter your PIN: ");
	    int userPIN = sc.nextInt();
	    
	    //functionalities included in interface
	    atm.authenticateUser(userID, userPIN);
	    if (atm.getCurrentUser() != null) {
	        int choice;
	        do {
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Exit");
	            System.out.println("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    atm.checkBalance();
	                    break;
	                case 2:
	                    System.out.println("Enter amount to withdraw: ");
	                    double withdrawAmount = sc.nextDouble();
	                    atm.withdrawMoney(withdrawAmount);
	                    break;
	                case 3:
	                    System.out.println("Enter amount to deposit: ");
	                    double depositAmount = sc.nextDouble();
	                    atm.depositMoney(depositAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 4);
	    }
	}

}
