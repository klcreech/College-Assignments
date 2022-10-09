/*
 * Kerry Creech
 * COP2800 - Homework #3_1
 * 9/14/2021
 * This program  prompts the user to enter a letter and displays
 * its corresponding number. 
 */
package hw3_1;

import java.util.Scanner;

public class HW3_1 {

  
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a letter
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);

		// Display its corresponding number
		int number = 0;
		if (Character.isLetter(ch))
		{
			if (ch >= 'W')
				number = 9;
			else if (ch >= 'T')
				number = 8;
			else if (ch >= 'P')
				number = 7;
			else if (ch >= 'M')
				number = 6;
			else if (ch >= 'J')
				number = 5;
			else if (ch >= 'G')
				number = 4;
			else if (ch >= 'D')
				number = 3;
			else if (ch >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(ch + " is an invalid input: Not an alphabetic letter.");
	}
    
}
