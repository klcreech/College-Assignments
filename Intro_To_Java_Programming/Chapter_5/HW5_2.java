/*
 * Kerry Creech
 * COP2800 - Homework #5_2
 * 9/28/2021
 * This program that prompts the user for the amount
 * of times to toss a coin. once the methos is called, it should generate
 * a random number in the range of 1 through 2. If the random number is 1,
 * the method returns a string “heads”. If the random number is 2, it returns “tails”.
 * It gives the user the times it tossed, how many heads
 * and how many tails then gives the option to continue.*/

package hw5_2;

import java.util.Scanner;

public class HW5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // continue loop
        int continueRunning = 1;
                
        while(continueRunning != 0){
        
        // Create a Scanner
	Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a binary string
        System.out.print("How many times do you want to toss the coin? ");
        int amt = input.nextInt();
        
        // Display the decimal equivalent
        System.out.println("In " + amt + " tosses, " + coinToss(amt));
        
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
    
     /** Method calculates random toss and prints message
     * @param amt
     * @return
     */
    public static String coinToss(int amt) {
        // Random number will return either 1 or 2
        int h = 0;
        int t = 0;
        
        
        for(int i=0;i<amt;i++){
            int tmp = (int) ( Math.random() * 2 + 1);
        
            if(tmp == 1){
            h += 1;
            }
            else if (tmp == 2){
            t += 1;
            }
            
        }
        
        String result = ("there were " + h + " heads and " + t + " tails.");        
        
        return result;

        }
        
               
	
    }
    

