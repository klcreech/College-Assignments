/*
 * Kerry Creech
 * COP2800 - Homework #8_2
 * 10/29/2021
 * This program ask the user for a specific account ID then 
 * provides balance info and the ability to withdraw and add funds  */
package hw8_2;


import java.util.Scanner;
public class HW8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create ten accounts in an array
		Account[] accounts = new Account[10];

		// Initialize accounts with balance
		initialBalance(accounts);
		
		// Once the system starts, it will not stop
		do {
                    
                     
                // continue loop
                int continueRunning = 1;
                
                while(continueRunning != 0){
			// Prompt user to enter an id
			System.out.print("Enter an ID between 0 and 9, 999 to quit gane: ");
			int id = input.nextInt();
                        
                        if (id == 999) {	// Exit Check
			System.out.println("Game over, Good Bye!"); 
                           System.exit(0);
                        }
                        else if (isValidID(id, accounts)) {
				int choice;
				do {	
					// Get user choice
					choice = displayMainMenu(input);
					if (isTransaction(choice)) {
							executeTransaction(choice, accounts, id, input);
					}
				} while (choice != 4); // If 4 exit main menu
			}
                        
                }
			// Once you exit, the system will prompt for an id again
		} while (true); 
	}

	/** Initialize accounts with balance of 100
     * @param a */
	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
		}
	}

	/** Return true if choice is a transaction
     * @param choice
     * @return  */
	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}

	/** Return true if ID is valid
     * @param id
     * @param a
     * @return  */
	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	/** Display main menu
     * @param input
     * @return  */
	public static int displayMainMenu(Scanner input) {
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		return input.nextInt();
	}

	/** Execute a Transaction
     * @param c
     * @param a
     * @param id
     * @param input */
	public static void executeTransaction(
		int c, Account[] a, int id, Scanner input) {
		switch (c) {
			case 1: // Viewing the current balance
					  System.out.println("The balance is " + a[id].getBalance());
					  break;
			case 2: // Withdraw money
					  System.out.print("Enter an amount to withdraw: "); 
					  a[id].withdraw(input.nextDouble());
					  break;
			case 3: // Deposit money
					  System.out.print("Enter an amount to deposit: "); 
					  a[id].deposit(input.nextDouble());
		}
        
    }
    
}
