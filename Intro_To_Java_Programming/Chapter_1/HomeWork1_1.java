/*
 * Kerry Creech
 * COP2800 - Homework #1
 * 8/30/2021
 * This program calculates gratuity on a subtotal and provides total.
 */
package homework1_1;


import java.util.Scanner;
import java.text.DecimalFormat;

public class HomeWork1_1 {
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");  // Fix decimal issue to only 2 places
    
    public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);	// Create new Scanner object.

		// Prompt user to enter the subtotal and  gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calculate gratuity and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
                
		// Display results
		System.out.println("The gratuity is $" + df2.format(gratuity) +
			" and total is $" + total);
    }
    
}

