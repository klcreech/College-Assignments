/*
 * Kerry Creech
 * COP2800 - Homework #12
 * 11/29/2021
 * This is the class file for the Faculty Object with UML diagram   */

package personapp_hw12;


/**************************************************************************
*                            Faculty                                      *
*-------------------------------------------------------------------------*
* -division: String                                                       *
*                                                                         *
*-------------------------------------------------------------------------*
* +Faculty()                                                              *
* +setDivision:(division: String): void                                   *
* +getDivision(): String                                                  *
* +toString(): String                                                     *
* +printText(): String                                                    *
**************************************************************************/

public class Faculty extends Person {
  
    // private instance variable to store the
    // division of the Faculty
    private String division;

    // no-arg constructor
    public Faculty()
    {
        super(); // calling parent class constructor
        division = "NA";// initialize the division with NA
    }

    // getter - setter
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    // overridden toString() method
    @Override public String toString()
    {
        return super.toString() + "\n" + "Division: " + division + "\n";
    }

    public void printText () {
        System.out.println (toString());
    }

}


