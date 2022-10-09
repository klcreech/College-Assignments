/*
 * Kerry Creech
 * COP2800 - Homework #7_1
 * 10/21/2021
 * This program prompts display the area and perimeter of a rhombus
 * with default values and specified values   */

package hw7_1;


public class HW7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		// Create a Rectangle with side 5 and diagonal1 6 and diagonal2 8
		Rhombus rhombus1 = new Rhombus(5, 6, 8);

		// Create a Rectangle with default values
		Rhombus rhombus2 = new Rhombus();

		// Display the width, height, area, and perimeter of rhombus1
		System.out.println("\n The area of the first rhombus is " + rhombus1.getArea());
		System.out.println("\n The perimeter of this rhombus is " + rhombus1.getPerimeter());
		

		// Display the width, height, area, and perimeter of rhombus2
		System.out.println("\n The area of the second rhombus is " + rhombus2.getArea());
		System.out.println("\n The perimeter of this rhombus is " + rhombus2.getPerimeter());
	}
    
    
}
    

