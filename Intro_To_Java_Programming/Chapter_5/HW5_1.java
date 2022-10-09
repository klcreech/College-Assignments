/*
 * Kerry Creech
 * COP2800 - Homework #5_1
 * 9/28/2021
 * This program parses a binary number as a string
 * into a decimal integer. 
 * The method header is: public static int binaryToDecimal(String binaryString). 
 * The program prompts the user to enter a binary string and displays the
 * corresponding decimal integer value. The program then ask if the
 * user wants to continue with another binary string. If the user enters “y”,
 * the program will start a new conversion. Otherwise, it’ll stop. */

package hw5_1;

import java.util.Scanner;

public class HW5_1 {

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
         // Create a Scanner
	Scanner input = new Scanner(System.in);
        
        // continue loop
        int continueRunning = 1;
                
        while(continueRunning != 0){

            // Prompt the user to enter a binary string
            System.out.print("Enter a binary number string: ");
            String binaryString = input.next();

            // Display the decimal equivalent
            System.out.println("The decimal vaue is " + binaryToDecimal(binaryString));
            
            //Prompt user to continue
            System.out.println("Continue? (y/n)");                    
            String choice = input.next();
            
             if (choice.equals("y")){
                 continueRunning = 1;
             }
             else{
                 System.out.println("Good Bye!"); 
                 System.exit(0);
             }
        }
    }
    
    /** Method parses a binary number as 
     * a string into a decimal integer
     * @param binaryString
     * @return
     */
    public static int binaryToDecimal(String binaryString) {
        double k=0;
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)== '1'){
                 k=k+ Math.pow(2,binaryString.length()-1-i);
            }

        }
        
        return (int) k;       
	
    }
    
    
}
  

