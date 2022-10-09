/*
 * Kerry Creech
 * COP2800 - Extra Credit #2 Problem 2
 * 9/18/2021
 * This program  prompts the user for a floating point number and provides, 
 * output number of places before the decimal.
 */
package extra_credit_2_problem_2;

import java.util.Scanner;

public class Extra_Credit_2_Problem_2 {

 
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt to enter numerator and denominator.
		System.out.print("Enter a floating point number: ");
		double z = input.nextDouble();
                System.out.println("The number of digits before the decial point " + z + " is " + ((int)Math.log10(z)+ 1));
            
	}
    
}