/*
 * Name: Kerry Creech
 * Date: 10/9/2021
 * Assignment: Midterm Project 1
 * Program: calculates shipping cost based on zip.
 */
package midterm_project_1;



public class Midterm_Project_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Atest statement that calls the getUPSShipping method
        System.out.println("Shipping cosst to 32304 for package of 7.5 ibs is $" + getUPSShipping(7.5, 32304));
        
        
        
    }
    
    public static double getUPSShipping( double weight, int zipCode) {
        double shippingCost = 0;
        
        if (weight <= 5){
            shippingCost = 4.95;            
        }
        else if ( weight > 5 && weight <= 10){
            shippingCost = 7.95; 
        }
        else if ( weight > 10) {
            shippingCost = 10.95;
            
        }
        
        if (zipCode <= 50000) {
            shippingCost += 1.50;
        }
        return shippingCost;
    
    }


}

 
        
        
    
        
        
        
   
    

