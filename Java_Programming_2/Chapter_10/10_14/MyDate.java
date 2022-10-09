/*
 * Kerry Creech
 * COP2805 - Homework #10_14
 * 1/21/2022
 * Write a test program that creates two MyDate objects (using new MyDate() and new
 * MyDate(34355555133101L)) and displays their year, month, and day.
 * (Hint: The first two constructors will extract the year, month, and day from
 * the elapsed time. For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18. You may use the
 * GregorianCalendar class discussed in Programming Exercise 9.5 to simplify coding.)
 */
package exercise10_14;

import java.util.GregorianCalendar;

/*______________________UML DIAGRAM___________________________
 *							      *
 * 			  MyDate    			      *		
 *------------------------------------------------------------*
 * -day : int	                                              *
 * -year:int 					              *			
 *------------------------------------------------------------*
 * +MyDate()                             		      *
 * +MyDate(int, int,int)          			      *	
 * +MyDate(long)                          		      *	
 * setDate(long):void  					      *	
 *____________________________________________________________*/


public class MyDate {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public void setDate(long elapsedTime) {
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public MyDate setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public MyDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getDay() {
        return day;
    }

    public MyDate setDay(int day) {
        this.day = day;
        return this;
    }
}
