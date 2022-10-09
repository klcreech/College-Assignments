/*
 * Kerry Creech
 * COP2800 - Homework #4_1
 * 9/21/2021
 * This program prompts user for an unspecified number 
 * of integers, determines how many positive and negative
 * value have been read, and computes the total and average
 * of the input values (not counting zeros). The program
 * stops reading the inputs when it encounters the first zero
 * in the input list. The programs displays the average as a
 * floating point number. Once done with an input list, the program
 * ask if the user wants to continue with another list and response
 * accordingly to the user’s choice. */

package hw4_1;

import java.util.Scanner;

public class HW4_1 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);            
                
                // continue loop
                int continueRunning = 1;
                
                while(continueRunning != 0){
                    
                
                int positives = 0; 	// Count the number of positive numbers
		int negatives = 0; 	// Count the number of negative numbers
		int count = 0;			// Count all numbers
		double total = 0;		// Accumulate a totol    
         

		// Promopt the user to enter an integer or 0 to exit
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {	// Test for sentinel value
			System.out.println("No numbers are entered except 0");
                        
                        System.out.println("Continue? (y/n)");                    
			String choice = input.next();
                        if (choice.equals("y")){
                            continueRunning = 1;
                        }
                        else{
                           System.out.println("Good Bye!"); 
                           System.exit(0);
                        }
		}
                
                else 
                {

		while (number != 0) {// Test for sentinel value
			if (number > 0)
				positives++;	// Increase positives
			else
				negatives++;	// Increase negatives
			total += number;	// Accumulate total
			count++;				// Increase the count
			number = input.nextInt();
		}

		// Calculate the average
		double average = total / count;

		// Display results
		System.out.println(
			"The number of positive is " + positives +
			"\nThe number of negatives is " + negatives +
			"\nThe total is total " + String.format("%.0f", total) +
			"\nThe average is " + average);
                
                   System.out.println("Continue? (y/n)");                    
			String choice = input.next();
                        if (choice.equals("y")){
                            continueRunning = 1;
                        }
                        else{
                           System.out.println("Good Bye!");
                           System.exit(0);
                        }                
                
                }
		
                } 
    }
    
}
