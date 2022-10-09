/*
 * Kerry Creech
 * COP2800 - Homework #6_1
 * 10/5/2021
 * Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number.  */

package hw6_1;

import java.util.Scanner;

public class HW6_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);     
            // continue loop
            int continueRunning = 1;
                
            while(continueRunning != 0){
        
                int[] counts = new int[10]; // Array of ten integers

		// Store the counts of 100 random numbers
		for (int i = 1; i <= 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("This program generates 100 random integers\r\n" + 
                        "between 0 and 9 and displays the count for each number");
		for (int i = 0; i < counts.length; i++) {
			System.out.println(" Number of " + i + "s: " + counts[i]);
		}
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
