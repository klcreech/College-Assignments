/*
 * Kerry Creech
 * COP2805 - Homework #11_2
 * 1/21/2022
 */
package exercise11_02;
import exercise10_14.MyDate;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  Faculty    			      *		
 *------------------------------------------------------------*
 * -officeHours:double                                        *
 * -rank:int                                                  *
 *			                                      *
 *------------------------------------------------------------*
 * +Faculty(officeHours:Double, rank:int)                     *
 * +getRank():int                                             *
 * +setRank(rank:int)                                         *
 * +getOfficeHours():double                                   *
 * +setOfficeHours(officeHours:double)                        *
 * +toString(): String          			      *	
 *____________________________________________________________*/

public class Faculty extends Employee {

    private double[] officeHours;
    private int rank;

    

    public Faculty(double[] officeHours, int rank) {
        super("Philadelphia,PA", 90_000.00, new MyDate());
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public Faculty setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public double[] getOfficeHours() {
        return officeHours;
    }

    public Faculty setOfficeHours(double[] officeHours) {
        this.officeHours = officeHours;
        return this;
    }

    @Override
    public String toString() {
        return "Faculty.class:{ " +
                "Name = " + this.getName() +
                " }";
    }

}
