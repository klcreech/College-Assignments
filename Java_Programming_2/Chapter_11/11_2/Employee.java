/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 */
package exercise11_02;

import exercise10_14.MyDate;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  Employee    			      *		
 *------------------------------------------------------------*
 * -office: String	                                      *
 * -salary: double                                            *
 * -myDate:dateHired                                          *
 *			                                      *
 *------------------------------------------------------------*
 * +Employee(office:String, salary:double, dateHired:MyDate)  *
 * +getoffice():String                                        *
 * +setOffice(office:String)                                  *
 * +getSalary():double                                        *
 * +setSalary(salary:double)                                  *
 * +getDateHired():MyDate                                     *
 * +setDateHired(dateHired:MyDate)                            *
 * +toString(): String          			      *	
 *____________________________________________________________*/

public class Employee extends Person {

    private String office;
    private double salary;
    private MyDate dateHired;


    public Employee(String office, double salary, MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public Employee setOffice(String office) {
        this.office = office;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public Employee setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
        return this;
    }

    @Override
    public String toString() {
        return "Employee.class: { " +
                "Name= " + this.getName() +
                '}';
    }

}
