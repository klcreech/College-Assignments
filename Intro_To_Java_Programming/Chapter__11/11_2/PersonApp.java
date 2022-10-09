/*
Date Created: 11/12/2021
Author: Kerry Creech

This program uses inheritance features of OOP including method overriding and polymorphism

input(s)

Frank Jones
jonesf@college.edu
Business, Industry and Technology

Jane Smith
smithj@college.edu
Math and Science

John Doe
doej@college.edu
Accounting

Sara King
kings@college.edu
Information Technology

Output:

FACULTY

Name: Frank Jones
Email: jonesf@college.edu
Division: Business, Industry and Technology

Name: Jane Smith
Email: smithj@college.edu
Division: Math and Science

STUDENT

Name: John Doe
Email: doej@college.edu
Major: Accounting

Name: Sara King
Email: kings@college.edu
Major: Information Technology  */

package personapp;


public class PersonApp {

  
    public static void main(String[] args)
        {
                // 4 Person objects
                Person[] person = new Person[4];
                
                // Faculty object
                person[0] = new Faculty();
                
                // data members
                person[0].setFirstName("Frank");
                person[0].setLastName("Jones");
                person[0].setEmail("jonesf@college.edu");
                
                // type casting the person object to Faculty object to set Division
              
                ((Faculty) person[0]).setDivision("Business, Industry and Technology");
                
                person[1] = new Faculty();
                
                person[1].setFirstName("Jane");
                person[1].setLastName("Smith");
                person[1].setEmail("smithj@college.edu");
                ((Faculty) person[1]).setDivision("Math and Science");
                
                
                // Student object creation
                person[2] = new Student();
                
                person[2].setFirstName("John");
                person[2].setLastName("Doe");
                person[2].setEmail("doej@college.edu");
                ((Student)person[2]).setMajor("Accounting");
                
                person[3] = new Student();
                
                person[3].setFirstName("Sara");
                person[3].setLastName("King");
                person[3].setEmail("kings@college.edu");
                ((Student)person[3]).setMajor("Information Technology");
                
                // printing the Faculties
                System.out.println("FACULTY\n");
                print(person[0]);
                System.out.println();
                print(person[1]);
                System.out.println();
                
                // printing the Students
                System.out.println("STUDENT\n");
                print(person[2]);
                System.out.println();
                print(person[3]);
                System.out.println();
        }
        
        /**
         *Print the details of a Person and its sub-class via method
     * @param p
         */
        public static void print(Person p)
        {
                System.out.println(p.toString());
        }
        
/**
3. Yes the output was predicted correctly. 

During the program process I was trying to create an argument constructor 
to make PersonApp Main easier, but I had to change tit to comply with directions.

4. Code has been named correctly, commented and structured properly

5. When thinking on how I constructed this, writing the output down without the help
   of the instructor helped me to critically hammer out a solution that helped me to retain
   alot of strategies.I did find alot of trial and error when setting the arrays to send to
   the print method. I also found that if the directions were not followed exactly you could
   construct the arrays incorrectly.**/
    
}