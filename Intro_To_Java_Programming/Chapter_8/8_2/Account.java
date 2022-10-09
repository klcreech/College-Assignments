/*
 * Kerry Creech
 * COP2800 - Homework #8_2
 * 10/29/2021
 * This is the class file for the Account program with UML diagram   */
package hw8_2;

/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

// Implement the Account class
import java.util.Date;

public class Account {
	// Data fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Constructors
	/** Creates a default account */
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
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

	/** Set annualInterestRate
     * @param newAnnualInterestRate */
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
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

	/** Return annualInterestRate
     * @return  */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Return dateCreated
     * @return  */
	public String getDateCreated() {
		return dateCreated.toString();
	}

	/** Return monthly interest rate
     * @return  */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	/** Return monthly interest
     * @return  */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
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
