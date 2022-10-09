/*
 * Kerry Creech
 * COP2800 - Homework #1_2
 * 8/30/2021
 * This program prompts user to enter the distance
 * to drive, the fuel efficiency of the car in miles
 * and the price per gallon.
 */
package homework1_2;


import java.util.Scanner;

public class HomeWork1_2 {
    
    	public static void main(String[] args) {
            
		Scanner input = new Scanner(System.in);
                
		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

		// Compute the cost of driving
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// Display result
		System.out.println("The cost of driving is $" + costOfDriving);
	}
    
}

