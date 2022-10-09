/*
 * Kerry Creech
 * COP2800 - Homework #11
 * 11/12/2021
 * This is the class file for the Faculty Object with UML diagram   */

package personapp;

/**************************************************************************
*                            Faculty                                      *
*-------------------------------------------------------------------------*
* -division: String                                                       *
*                                                                         *
*-------------------------------------------------------------------------*
* +Faculty()                                                              *
* +Faculty(fname: String, lname: String, email: String, division: String) *
* +setDivision:(division: String): void                                   *
* +getDivision(): String                                                  *
* +toString(): String                                                     *
**************************************************************************/

public class Faculty extends Person {
        
        // private instance variable to store the
        // division of the Faculty
        private String division;
        
        // no-arg constructor
        public Faculty()
        {
                super(); // calling parent class constructor
                division = "Unknown";// initialize the division with Unknown
        }

        // get - set
        public String getDivision() {
                return division;
        }

        public void setDivision(String division) {
                this.division = division;
        }
        
        // overridden toString() method
        @Override public String toString()
        {
                return super.toString() + "\n" + "Division: " + division;
        }

}

