/*
 * Kerry Creech
 * COP2800 - Homework #9_1
 * 11/3/2021
 * This is the class file for GeometricObject with UML diagram   */

package hw9_1;

/************************************
* GeometricObject                   *
*-----------------------------------*
* -color: String                    *
* -filled: boolean                  *
*     *
*-----------------------------------*
* +GeometricObject()                *
* +GeometricObject(color: String,   *
* +filled: boolean)                 *
* +getColor(): String               *
* +setColor(color: Stirng): void    *
* +isFilled(): boolean              *
* +setFilled(filled: boolean): void *
* +getDateCreated(): java.util.Date *
* +toString(): String               *
************************************/

// Implement GeometricObject class
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	
	/** Construct a default geometric object */
	public GeometricObject() {
		
	}

	/** Construct a geometric object with the specified color
	  * and filled value */
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
		its getter method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	
}
