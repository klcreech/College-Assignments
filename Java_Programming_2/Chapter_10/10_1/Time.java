/*
 * Kerry Creech
 * COP2805 - Homework #10_1
 * 1/14/2022
 * This program (The Time class) Design a class named Time. Then write a
 * program that creates three Time objects (using new Time(), new Time(555550000),
 * and new Time(5, 23, 55)) and displays their hour, minute, and second in the format
 * hour:minute:second.
*/

package exercise10_01;

/*_________________________UML DIAGRAM________________________
 *							      *
 * 			    Time    			      *		
 *------------------------------------------------------------*
 * -hour : long		(defaults are current time)	      *
 * -minute : long					      *			
 * -second : long					      *
 * -theTime: long					      *	
 *------------------------------------------------------------*
 * -Time(): (System.currentTime.Millis()) 		      *
 * -Time(long):   					      *	
 * -Time(hour:long,min:long,second:long)		      *	
 * +setTime():void					      *	
 * +getHour() : long					      *	
 * +getSec() : long	                                      *   
 * +getMin() : long					      *	
 *____________________________________________________________*/


public class Time {

    private long hour;
    private long min;
    private long second;

    public Time() {

        long theTime = System.currentTimeMillis();

        this.setTime(theTime);
    }

    public Time(long newTime) {

        this.setTime(newTime);

    }

    public Time(long newHour, long newMin, long newSec) {

        second = newSec;

        min = newMin;

        hour = newHour;

    }

    public void setTime(long elapsedTime) {

        hour = (((elapsedTime / 1000) / 60) / 60) % 24;

        second = (elapsedTime / 1000) % 60;

        min = ((elapsedTime / 1000) / 60) % 60;


    }

    public long getHour() {

        return hour;

    }

    public long getMin() {

        return min;
    }

    public long getSec() {

        return second;
    }


}
