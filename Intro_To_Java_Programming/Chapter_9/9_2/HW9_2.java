/*
 * Kerry Creech
 * COP2800 - Homework #9_2
 * 11/3/2021
 * This program provides specified data to a object then prints it
 + then sends specified data to subclass and overrifdes print data from the superclass*/

package hw9_2;

public class HW9_2 {

    public static void main(String[] args) {
		
		//Create Product object with Assign Data and Set it
		Product prod = new Product("html", "Crash course HTML", 19.99);		
                
                //Print data in specified format
		System.out.println(prod.print());   
            
		//Create Book object with Assign Data and Set it
		Book boo = new Book("java", "Introduction to Java", 59.99, "Daniel Liang");
		                
                //Print data in specified format and overide superclass
		System.out.println(boo.print());
                
		//Create Software object with assign data and set it
		Software soft = new Software("jdk", "Java Development Kit", 29.99, "1.8.0");
		
                //Print data in specified format and overide superclass
		System.out.println(soft.print());
		
	}
    
}
