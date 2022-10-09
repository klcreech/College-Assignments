/*
 * Kerry Creech
 * COP2800 - Homework #11
 * 11/12/2021
 * This is the class file for the Student Object with UML diagram   */

package personapp;

/**************************************************************************
*                            Student                                      *
*-------------------------------------------------------------------------*
* -major: String                                                          *
*                                                                         *
*-------------------------------------------------------------------------*
* +Student()                                                              *
* +Student(fname: String, lname: String, email: String, major: String)    *
* +setMajor:(major: String): void                                         *
* +getMajor(): String                                                     *
* +toString(): String                                                     *
**************************************************************************/

public class Student extends Person{
        
        // private instance variable to
        // store major of a Student
        private String major;
        
        // no-arg constructir
        public Student()
        {
                super(); // calling parent class constructor
                major = "Unknown";
        }

        // getter and setter for major
        public String getMajor() {
                return major;
        }

        public void setMajor(String major) {
                this.major = major;
        }
        
        // overridden toString() method
        @Override public String toString()
        {
                return super.toString() + "\n" + "Major: " + major;
        }
        

}