/*
 * Kerry Creech
 * COP2800 - Homework #9_2
 * 11/3/2021
 * This is the class file for the Product Object with UML diagram   */

package hw9_2;

public class Product {
    
/***************************************************************
*                            Product                           *
*--------------------------------------------------------------*
* -code: String                                                *
* -description: String                                         *
* -price: double                                               *
*                                                              *
*--------------------------------------------------------------*
* +Product()                                                   *
* +Product(code: String, description: String, price: double)   *
* +setCode:(code: String): void                                *
* +getCode(): String                                           *
* +setDescription(description: String): void                   *
* +getDescription(): String                                    *
* +setPrice(price: double): void                               *
* +getPrice(): double                                          *
* +print(): void                                               *
***************************************************************/
    
        String code;	// Product code
	String description;  // Product description
        double price;  // Product price

	/** A no-arg constructor that creates a default product */
	Product() {
		code = "";
		description = "";
                price = 0;
	} 

	/** Arg constructor that creates a Product 
	    with the specified data    */
	Product(String newCode, String newDescription, double newPrice) {
                    
		code = newCode;
		description = newDescription;
                price = newPrice;
                
	}

	/** Return the code*/
	String getCode() {
		return code; 
	}

	/** Return the description */
	String getDescription() {
		return description;
	}
        
        /** Return the price */
	double getPrice() {
		return price;
	}
        
        /** Set the code
     * @param newCode */
        public void setCode(String newCode)  {
            code = newCode;
            
        }
        /** Set the description
     * @param newDescription */
        public void setDescription(String newDescription)  {
            description = newDescription;
            
        }
        /** Set the price
     * @param newPrice */
        public void setPrice(double newPrice)  {
            price = newPrice;
            
        }
         
        /** Print The Product info
     * @return  */
      
        public String print() {
		return "\nProduct code: " + code + "\nProduct description: " + description +  "\nProduct price: $" + price;
        }
    
}
