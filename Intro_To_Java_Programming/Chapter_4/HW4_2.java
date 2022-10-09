/*
 * Kerry Creech
 * COP2800 - Homework #4_1
 * 9/21/2021
 * This program prompts user  a menu so they
 * can enter 1, 2, 3, or 4 for choosing an addition,
* subtraction, multiplication, or division test. After
* a test is finished, the menu is redisplayed. the user
* may choose another test or enter 5 to exit the system.
* Each test generates two random single-digit numbers to
* form a question for addition, subtraction, multiplication, or division.  */


package hw4_2;

import java.util.Random;
import java.util.Scanner;


public class HW4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        
        Random rand = new Random();
        
        // Generate random integers in range 1 to 9
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        
        // Print random integers
        System.out.print("Main Menu " + "\r\n" +
			"1: Addition " + "\r\n" + 
                        "2: Subtraction " + "\r\n" + 
                        "3: Multiplication " + "\r\n" +
                        "4: Division " + "\r\n" + 
                        "5: Exit " + "\r\n");
        
        
        // continue loop
       int continueRunning = 1;
                
       while(continueRunning != 0){
        
                        System.out.println("Enter a choice: ");
                        int choice = input.nextInt();
                        
            switch (choice)
		{
			case 1 : // Computes Addition
                            
                            System.out.println("What is " + rand_int1 + " + " + rand_int2 + "?" );
                            int Aans = input.nextInt();
                            
                            int Achk = (rand_int1 + rand_int2);
                            
                            if (Aans == Achk) {
                                System.out.println("Correct!");
                            }
                            else {
                               System.out.println("Your answer is wrong. The correct answer is " + Achk); 
                            }
			     
                         break;
                             
                        case 2 : // Computes Subtraction
                            
                            if (rand_int1 < rand_int2) {
                                int temp = rand_int1;
                                rand_int1 = rand_int2;
                                rand_int2 = temp;
                            }
                                                          
                            System.out.println("What is " + rand_int1 + " - " + rand_int2 + "?" );
                            int Sans = input.nextInt();
                            int Schk = ( rand_int1 - rand_int2); 
                            
                            if (Sans == Schk) {
                                System.out.println("Correct!");
                            }
                            else {
                               System.out.println("Your answer is wrong. The correct answer is " + Schk); 
                            }
			     break;
                             
                        case 3 : // Computes Multiplication
                            
                                                                                      
                            System.out.println("What is " + rand_int1 + " * " + rand_int2 + "?" );
                            int Mans = input.nextInt();
                            int Mchk = ( rand_int1 * rand_int2); 
                            
                            if (Mans == Mchk) {
                                System.out.println("Correct!");
                            }
                            else {
                               System.out.println("Your answer is wrong. The correct answer is " + Mchk); 
                            }
			     break;
                             
                        case 4 : // Computes Division
                            
                            if (rand_int2 == 0){
                                rand_int2++;
                            }
                                                          
                            System.out.println("What is " + rand_int1 + " / " + rand_int2 + "?" + " (To two decimal places)" );
                            String Dans = input.next();
                            //int Dans = input.nextInt();
                            double Dchk = (rand_int1 + 0.0) / (rand_int2 + 0.0);
                            
                            String result = String.format("%.2f", Dchk);
                            
                            //Convert to string for compare
                            
                            if (Dans.equals(result)) {
                                System.out.println("Correct!");
                            }
                            else {
                               System.out.println("Your answer is wrong. The correct answer is " + result); 
                            }
			     break;
                             
                        case 5: 
                            
                            System.out.println("Good Bye!");
                            System.exit(0);
                                                
			                                               
		
		}
            
             System.out.println("Continue? (y/n)");                    
			String Nchoice = input.next();
                        if (Nchoice.equals("y")){
                            continueRunning = 1;
                        }
                        else{
                           System.out.println("Good Bye!"); 
                           System.exit(0);
                        }
            }               
    }
    
}
