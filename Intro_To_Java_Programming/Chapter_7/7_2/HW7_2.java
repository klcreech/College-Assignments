/*
 * Kerry Creech
 * COP2800 - Homework #7_2
 * 10/21/2021
 * This is a program that shows the account id, inital balance, and end of month balance   */
package hw7_2;

public class HW7_2 {

     public static void main(String[] args) {
		// Create an Account object with an account
		// ID of 1002, and a balance of $10,000
		Account account = new Account(1002, 10000);

		

		// Display the Id, balance, and the end of month balance, 
		
		System.out.printf("Initial balance of account with ID " + account.getId() + " is $%.2f\n", account.getBalance());
		
                
                // Set Monthly Fee of $12.5
		account.setMonthlyFee(12.5);

		// Withdraw $2,000
		account.withdraw(2000);

		// Deposit $1,500
		account.deposit(1500);
                
		System.out.printf("End of month balance: $%.2f\n", account.calMonthlyBalance());
	}
}
