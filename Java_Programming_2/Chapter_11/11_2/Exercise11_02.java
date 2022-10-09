/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 * This program consist of Designing a class named Person
 * and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee.
 * A person has a name, address, phone number, and 
 * email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant.
 * An employee has an office, salary, and date hired.
 * Use the MyDate class defined in Programming Exercise
 * 10.14 to create an object for date hired.
 * A faculty member has office hours and a rank.
 * A staff member has a title. Override the toString
 * method in each class to display the class name and the person’s
 * name. Draw the UML diagram for the classes and implement them.
 * Write a test program that creates a Person, Student, Employee, 
 *Faculty, and Staff, and invokes their toString() methods.
*/
package exercise11_02;

import exercise10_14.MyDate;

public class Exercise11_02 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Garry Barryman");
		Student student = new Student(Student.SENIOR);
		student.setName("Jingle PB&J");
		Employee employee = new Employee("Delray Beach,FL", 45_750.00, new MyDate());
		employee.setName("Sarah Stodenbyer");
		Faculty faculty = new Faculty(new double[]{9.0, 5.0}, 5);
		faculty.setName("Milly Millyman");
		Staff staff = new Staff("Boston,MA", 750_000.00, new MyDate(), "CEO");
		staff.setName("Madonna Firehat");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}