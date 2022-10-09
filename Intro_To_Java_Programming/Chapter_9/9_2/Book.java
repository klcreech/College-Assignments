/*
 * Kerry Creech
 * COP2800 - Homework #9_2
 * 11/3/2021
 * This is the class file for the Book Object with UML diagram   */

package hw9_2;

public class Book extends Product {
    
/****************************************************************************
*                                    Book                                           *
*---------------------------------------------------------------------------*
* -author: String                                                           *
*                                                                           *
*---------------------------------------------------------------------------*
* +Book()                                                                   *
* +Book(code: String, description: String, price: double, author: String)   *
* +setAuthor:(author: String): void                                         *
* +getAuthor(): String                                                      *
* +print(): void                                                            *
****************************************************************************/
    
        String author;	// author of book
	

	/** A no-arg constructor that creates a default book */
	Book() {
		author = "";		
	} 

	/** Arg constructor that creates a book 
	    with the specified data    */
	Book(String newCode, String newDescription, double newPrice, String newAuthor) {
		code = newCode;
		description = newDescription;
                price = newPrice;
                author = newAuthor;
                
	}

	/** Return the author */
	String getAuthor() {
		return author; 
	}

	 /** set the author
     * @param newAuthor */       
        public void setAuthor(String newAuthor)  {
            author = newAuthor;
            
        }        
              
        /** Override print() of Product Class
     * @return  */
      
        @Override
        public String print() {
		return super.print() + "\nAuthor: " + author;    
       }
}

