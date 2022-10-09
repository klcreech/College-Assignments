/*
 * Kerry Creech
 * COP2800 - Homework #11
 * 11/12/2021
 * This is the class file for the Person Object with UML diagram   */

package personapp;


/***************************************************************
*                            Person                            *
*--------------------------------------------------------------*
* -firstName: String                                           *
* -lastName: String                                            *
* -email: String                                               *
*                                                              *
*--------------------------------------------------------------*
* +Person()                                                    *
* +Person(firstName: String, lastName: String, email: String)  *
* +setFirstName:(firstNname: String): void                     *
* +getFirstName(): String                                      *
* +setLastName(lastName: String): void                         *
* +getLastName(): String                                       *
* +setEmail(email: String): void                               *
* +getEmail(): String                                          *
* +toString(): String                                          *
***************************************************************/

public class Person {
        
        // private instance variables
        private String firstName;
        private String lastName;
        private String email;
        
        // no-arg constructor
        public Person()
        {
                firstName = "Unknown";
                lastName = "Unknown";
                email = "Unknown";
        }

        // getter-setters
        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getEmail() {
                return email;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public void setEmail(String email) {
                this.email = email;
        }
        
        // toString method to return a Person details as String
        public String toString()
        {
                return "Name: " + firstName + " " + lastName + "\n" + 
                                "Email: " + email;
        }

}
