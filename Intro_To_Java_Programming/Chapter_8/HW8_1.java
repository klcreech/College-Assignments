/*
 * Kerry Creech
 * COP2800 - Homework #8_1
 * 10/29/2021
 * This program creates a String Class with Methods called MyString and tests it  */
package hw8_1;

/**
 *
 * @author User
 */
public class HW8_1 {

    public static void main(String[] args) {
        MyString s = new MyString(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        s.printMyString();
        s.toUpperCase().printMyString();
        s.substring(2).printMyString();
   }
} // end of HW8_1 class


                //UML Class Diagram 
/********************************************************
*                     MyString                          *
*-------------------------------------------------------*
* -chars: char[]                                        *
* ---------------------------                           *
*                                                       *
* +MyString(chars: char[])                              *
*                                                       *
* +length(): int                                        *
* +charAt((index: int): char                            *
* +toUpperCase():MyString                               *
*                                                       *
* +substring(begin: int): MyString                      *
*                                                       *
*                                                       *
* +printMyString():void                                 *
********************************************************/

class MyString{ 
   private char[] chars;
   
   //Constructor
    
   public MyString(char[] newChars){
        chars = new char[newChars.length]; //(1)        
        System.arraycopy(newChars, 0, chars, 0, chars.length); //(2)    
   }
   
   // Methods
        
        /** Return length
     * @return  */
	public int length() {
		return chars.length;
	}
        
	/** Return the character at the specified index
     * @param index
     * @return  */
	public char charAt(int index) {
		return chars[index];
	}

	

        /** Return a new MyString of all upperCase characters */
	public MyString toUpperCase() {
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z')
				ch[i] = (char)(chars[i] - 32);
			else
				ch[i] = chars[i];
		}
		return new MyString(ch);
	}

	
	/** Returns substring of this string */
	
	/** Return a substring of string with specified begin*/
	public MyString substring(int begin) {
                int end = chars.length;
		char[] ch = new char[end -begin];
		for (int i = begin,j = 0; i < end; i++, j++) {
		 	ch[j] = chars[i];
		}
		return new MyString(ch); 
	}
        /** Displays the myString object in the output console */
         public void printMyString() {
                  System.out.println(chars);
                 
         }
        
    
  
    
}
