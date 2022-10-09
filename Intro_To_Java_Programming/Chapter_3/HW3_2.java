/*
 * Kerry Creech
 * COP2800 - Homework #3_2
 * 9/14/2021
 * This program  prompts the user to enter a Social Security number
 * in the format DDD-DD-DDDD, where D is a digit and 
 * checks whether the input is valid. 
 */
package hw3_2;

import java.util.Scanner;

public class HW3_2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a SSN: ");
    
    // create social security number variable     
    String ssn= input.nextLine();
    
    boolean isValid = ssn.length() == 11 && 
    		ssn.charAt(0) <= '9' && ssn.charAt(0) >= '0' &&
        Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) && 
        ssn.charAt(3) == '-' && Character.isDigit(ssn.charAt(4)) && 
        Character.isDigit(ssn.charAt(5)) && ssn.charAt(6) == '-' && 
        Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && 
        Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10));

// if/else statement prompts user whether the social security number is valid. 

    if (isValid)
      System.out.println(ssn + " is a valid social security number");
    else
      System.out.println(ssn + " is an invalid social security number");
  }
}
