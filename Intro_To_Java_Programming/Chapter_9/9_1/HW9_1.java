/*
 * Kerry Creech
 * COP2800 - Homework #9_1
 * 11/5/2021
 * This program prompts display the area, perimeter, color of a Rhombus and
 * and whether it is filled usig the geometric object class and toSting method */

package hw9_1;

import java.util.Scanner;

public class HW9_1 {
 
  public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three variables of the Rhombus
		System.out.print("Enter side and two diagonals of a Rhombus: ");
		double side = input.nextDouble();		
		double diagonal1 = input.nextDouble();		
		double diagonal2 = input.nextDouble();

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the Rhombus is filled
		System.out.print("Enter a Boolean value to indicae if the Rhombus is filled: ");
		boolean filled = input.nextBoolean();

		// Create triangle object with user input
		Rhombus Rhombus = new Rhombus(side, diagonal1, diagonal2);
		Rhombus.setColor(color);
		Rhombus.setFilled(filled);

		System.out.println(Rhombus.toString());
		System.out.println("Area: " + Rhombus.getArea());
		System.out.println("Perimeter: " + Rhombus.getPerimeter());
		System.out.println("Color: " + Rhombus.getColor());
		System.out.println("Filled: " + (Rhombus.isFilled() ? "" : " False ") 
			+ "True");
	}
    
    
}