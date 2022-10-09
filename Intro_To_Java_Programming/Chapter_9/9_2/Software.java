/*
 * Kerry Creech
 * COP2800 - Homework #9_2
 * 11/3/2021
 * This is the class file for the Software Object with UML diagram   */

package hw9_2;

public class Software extends Product {
    
/****************************************************************************
*                                    Software                                          *
*---------------------------------------------------------------------------*
* -version: String                                                           *
*                                                                           *
*---------------------------------------------------------------------------*
* +Software()                                                                   *
* +Software(code: String, description: String, price: double, version: String)   *
* +setVersion:(author: String): void                                         *
* +getVersion(): String                                                      *
* +print(): void                                                            *
****************************************************************************/
    
        String version;	// version of software
	

	/** A no-arg constructor that creates a default Software version */
	Software() {
		version = "";		
	} 

	/** A constructor that creates a rhombus 
	    with the specified data    */
	Software(String newCode, String newDescription, double newPrice, String newVersion) {
		code = newCode;
		description = newDescription;
                price = newPrice;
                version = newVersion;
                
	}

	/** Return the version */
	String getVersion() {
		return version; 
	}

	/** Set the version
     * @param newVersion */       
        public void setVersion(String newVersion)  {
            version = newVersion;
            
        }        
              
        /** Override print() of Product class
     * @return  */
      
        @Override
        public String print() {
		return super.print() + "\nVersion: " + version;    
       }
}
