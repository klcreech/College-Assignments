/*
 * Kerry Creech
 * COP2800 - Homework #11_1
 * 11/19/2021
 * This program uses exception try / cacth to do exception handling. */

package hw11_1;

import java.util.*; // import staement for scanner class.
public class HW11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // creates an object of scanner class.
  
        while (true) {
            System.out.print("Enter a binary number: ");
            String input = in.next(); // takes input from console.
            System.out.println(input); // prints the user input.
  
            int val = 0; // variable for storing output result.
            
            //exception try/catch
            try {
            val = Integer.parseInt(input, 2); // converts the binary to decimal.
            System.out.println("The decimal value for "+ input +" is "+ val);
            } 
            
            catch (NumberFormatException e) {
            System.out.println(input + " is not a binary number");
            }
            char ch; // variable to store y or n.
            System.out.print("Continue? (y/n) ");
            ch=in.next().charAt(0); // takes input from the user.
            System.out.println(ch); // prints the input.
            if(ch=='y') // if user wants to continue for more inputs.
            continue;
            // if user doesn't want to continue for more inputs;
            else if(ch=='n'){
            System.out.println("Good bye!");
            break;
            }
        }
   }
}
    
    

