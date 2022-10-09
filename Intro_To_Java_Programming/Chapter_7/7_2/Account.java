/*
 * Kerry Creech
 * COP2800 - Homework #7_2
 * 10/21/2021
 * This is the class file for the Account program with UML diagram   */
package hw7_2;

                //UML Class Diagram 
/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -monthlyFee: double                                   *
* -balance: double                                      *
* ---------------------------                           *
*                                                       *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
*                                                       *
* +getId(): int                                         *
* +setId((int id): void                                 *
* +getMonthlyFee(): double                              *
* +setMonthlyFee (monthlyFee: double): void             *
* +getBalance(): double                                 *
* +setBalance(balance: double): void                    *
* +calMonthlyBalance(): double                          *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

// Implement the Account class

public class Account {
	// Data fields
	private int id;
        private static double monthlyFee;
	private static double balance;
       
	

	// Constructors
	/** Creates a default account */
	Account() {
		id = 0;
		balance = 0;
		monthlyFee = 0;
		
                
		 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
                
	}

	// Mutator methods
	/** Set id
     * @param newId */
	public void setId(int newId) {
		id = newId;
	}

	/** Set balance
     * @param newBalance */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	/** Set monthyFee
     * @param newMonthlyFee */
	public void setMonthlyFee(double newMonthlyFee) {
		monthlyFee = newMonthlyFee;
	}

	// Accessor methods
	/** Return id
     * @return  */
	public int getId() {
		return id;
	}

	/** Return balance
     * @return  */
	public double getBalance() {
		return balance;
	}

	/** Return monthlyFee
     * @return  */
	public double getMonthlyFee() {
		return monthlyFee;
	}

	
	
	// Methods
	/** Return monthly balance
     * @return  */
	public double calMonthlyBalance() {
		return balance - monthlyFee;
                
	}

	/** Decrease balance by amount
     * @param amount */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/** Increase balance by amount
     * @param amount */
	public void deposit(double amount) {
		balance += amount;
	}
}
