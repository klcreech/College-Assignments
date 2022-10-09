/*
 * Kerry Creech
 * COP2800 - Homework #12
 * 11/29s/2021
 * This is the class file for the Student Object with UML diagram   */

package personapp_hw12;


/**************************************************************************
*                            Student                                      *
*-------------------------------------------------------------------------*
* -major: String                                                          *
*                                                                         *
*-------------------------------------------------------------------------*
* +Student()                                                              *
* +setMajor:(major: String): void                                         *
* +getMajor(): String                                                     *
* +toString(): String                                                     *
* +printText(): String                                                    *
**************************************************************************/

public class Student extends Person{
  
    // private instance variable to
    // store major of a Student
    private String major;

    // no-arg constructir
    public Student()
    {
        super(); // calling parent class constructor
        major = "NA";
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
        return super.toString() + "\n" + "Major: " + major + "\n";
    }

    public void printText () {
        System.out.println (toString());
    }

}
