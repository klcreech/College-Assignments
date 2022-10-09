/*
 * Kerry Creech
 * COP2800 - Homework #6_2
 * 10/5/2021
 * This program prompts the user to enter ten numbers, 
 * invokes a max value method to return the maximum value, and
 * displays the maximum value  */

package hw6_2;

import java.util.Scanner;

public class HW6_2 {  
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                Scanner input = new Scanner(System.in); // Create a Scanner
                
                // continue loop
                int continueRunning = 1;
                
                while(continueRunning != 0){
                    
                
		double[] numbers = new double[10]; // Create array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers fo the array, seperated by spaces: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Display the maximum value
		System.out.println("The maximum element of the array is: " + max(numbers));
                
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
        
     /** Method max returns the largest element in an array of double values
     * @param array
     * @return  */
    public static double max(double[] array) {
		double max = array[0];	// The maximum value
		for (double i: array) {
			if (i > max)
				max = i;
		}
		return max;
    }
    
}
