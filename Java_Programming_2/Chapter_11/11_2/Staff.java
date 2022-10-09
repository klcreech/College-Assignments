/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 */
package exercise11_02;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  Staff   			      *		
 *------------------------------------------------------------*
 * -title:String                                              *
 *			                                      *
 *------------------------------------------------------------*
 * +Staff(office:String, salary:double, title:String)         *
 * +toString(): String                                        *
 * +getTitle:String                                           *
 * +settitle(title:String)                                    *
 * +toString(): String                                        *	
 *____________________________________________________________*/

import exercise10_14.MyDate;

/**
 * A staff member has a title.
 * Override the toString method in each class to display the class name and the person’s
 * name.
 */

public class Staff extends Employee {

    private String title;

    public Staff(String office, double salary, MyDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Staff setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "Staff.class: { " +
                "Name= " + getName()  +
                '}';
    }
}
