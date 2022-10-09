/*
 * Kerry Creech
 * COP2800 - Homework #7_1
 * 10/21/2021
 * This is the class file for the rhombus with UML diagram   */

package hw7_1;

                            //UML Class Diagram                     
/************************************************************************
*                                 Rhombus                               *  
* ----------------------------------------------------------------------*  
* side: double                                                          *
* diagonal1: double                                                     *
* diagonal2: double                                                     *
************************************************************************* 
* +Rhombus()                                                            *  
* +Rhombus(newSide: double, newDiagonal1: double, newDiagonal2: double) *
*                                                                       *
* +getArea(): double                                                    *
* +getPerimeter(): double                                               *
************************************************************************/

public class Rhombus {
    
        double side;	// side of rhombus
	double diagonal1;  // diaganol 1 of rhombus
        double diagonal2;  // diaganol 2 of rhombus

	/** A no-arg constructor that creates a default rectangle */
	Rhombus() {
		side = 1;
		diagonal1 = Math.sqrt(2);
                diagonal2 = Math.sqrt(2);
	} 

	/** A constructor that creates a rhombus 
	    with the specified side and two diagonals    */
	Rhombus(double newSide, double newDiagonal1, double newDiagonal2) {
		side = newSide;
		diagonal1 = newDiagonal1;
                diagonal2 = newDiagonal2;
                
	}

	/** Return the area of this rhombus */
	double getArea() {
		return Math.round(((diagonal1 * diagonal2)/2) * 100) / 100; 
	}

	/** Return the perimeter of this rhombus */
	double getPerimeter() {
		return 4 * side;
	}
    
}
