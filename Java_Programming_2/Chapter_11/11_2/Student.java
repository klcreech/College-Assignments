/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 */
package exercise11_02;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  Student   			      *		
 *------------------------------------------------------------*
 * -STATUS:String                                             *
 *			                                      *
 *------------------------------------------------------------*
 * +Student(name:String, address:String, phoneNumber:String,  *
 * +toString(): String                                        *	
 *____________________________________________________________*/

public class Student extends Person {
    protected final String STATUS;

    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String STATUS) {
        this.STATUS = STATUS;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String STATUS) {
        super(name, address, phoneNumber, emailAddress);
        this.STATUS = STATUS;
    }


    @Override
    public String toString() {
        return "Student.class: { " +
                "Name= " + this.getName() +
                '}';
    }
}