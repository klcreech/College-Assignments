/*
 * Kerry Creech
 * COP2800 - Extra Credit #2 Problem 1
 * 9/18/2021
 * This program  prompts the user for numerator nd denominator and provides, 
 * output of proper or inproper fraction and mixed number.
 */
package extra_credit_2_problem_1;

import java.util.Scanner;

public class Extra_Credit_2_Problem_1 {

 
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt to enter numerator and denominator.
		System.out.print("Enter a numerator: ");
		int numer = input.nextInt();
		System.out.print("Enter a denominator: ");
		int denom = input.nextInt();
		

                // improper fraction check
		int imp_chk = numer % denom;                
                int chk;
                if (imp_chk == numer) chk = 1;
                else if (imp_chk == 0) chk = 2;
                else  chk = 3;
               
               
                System.out.print((numer) + "/" + (denom));
                switch(chk)
		  {
                    case 1: System.out.println(" is a proper fraction"); break;
                    case 2: System.out.println(" is an improper fraction and it can be reduced by " + (int)(numer) / (denom)); break;
                    case 3: System.out.println(" is an improper fraction and its mixed fraction is " + (int)(numer) / (denom) + " + " + (imp_chk) + "/" + (denom)); break;			
		  }     
       
              
	}
    
}
