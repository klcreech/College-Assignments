/*
 * Date Created: 11/29/2021
 * COP2800 - Homework #12
 * Author: Kerry Creech
 * This program uses inheritance features of OOP including method overriding, polymorphism, abstract classes and interfaces
 */
package personapp_hw12;

public class PersonApp_HW12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
{
        // creating 4 Person objects
        Person[] person = new Person[2];
  
        // creating a Faculty object
        person[0] = new Faculty();
  
        // setting the data members
        person[0].setFirstName("Frank");
        person[0].setLastName("Jones");
        person[0].setEmail("jonesf@college.edu");
        // type casting the person object to Faculty object to set Division
        // since it's a run-time process, hence type casting is necessary
        ((Faculty) person[0]).setDivision("Business, Industry and Technology");

        


        // Student object creation
        person[1] = new Student();

        person[1].setFirstName("John");
        person[1].setLastName("Doe");
        person[1].setEmail("johnDoe@gmail.com");
        ((Student)person[1]).setMajor("Accounting");

        

        // printing the Faculties
        System.out.println("FACULTY\n");
        printMultiple(person[0], 2);
        System.out.println();
        

        // printing the Students
        System.out.println("STUDENT\n");
        printMultiple(person[1], 3);
        System.out.println();
       
}
  
    /**
    * Method to print the details of a Person and its sub-class
    * @param person object
    */
    public static void print(Person p)
    {
        System.out.println(p.toString());
    }

    public static void printMultiple (Printable p, int count) {
        for (int i = 0; i < count; i++) p.printText ();
    }
}


