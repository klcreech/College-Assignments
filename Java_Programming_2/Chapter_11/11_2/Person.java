/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 */
package exercise11_02;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  Person   			      *		
 *------------------------------------------------------------*
 * -name:String                                               *
 * -address:String                                            *
 * -phoneNumber:String                                        *
 * -emailAddress:String                                       *
 *			                                      *
 *------------------------------------------------------------*
 * +Person(name:String, address:String, phoneNumber:String)   *
 * +getName():String                                          *
 * +setName(name:String)                                      *
 * +getAddress():String                                       *
 * +setAaddress(address:String)                               *
 * +getPhoneNumber():String                                   *
 * +setPhoneNumber(PhoneNumbers:String)                       *
 * +getEmailAddress(): String                                 *
 * +setEmailAddress(emailAddress:String)                      *
 * +toString(): String          			      *	
 *____________________________________________________________*/

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person() {}

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }


    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Person setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        return "Person.class: { " +
                "Name= " + name +
                " }";
    }


}

