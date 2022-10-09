'''
Write a program that displays the Roman numeral
version of a decimal number entered. The program
should prompt the user to enter a number from 1 to 10.
So, if the user enters a 9 then "IX" should be printed on the terminal.

NoteFrom Kerry: Since you said Decimal Number I had to evaluate what would
happen if someone put in a decimal like 1.15 and it would show I.IV which
could be interpeted as 1.4 instead of the correct number.
Also had to consider what would happen to the 0. So by stating decimal number
in the instructions I had to assume you meant Int instead of a Float.

'''


number = int(input("Enter a number between 1 and 10: "))

if number == 1:
    Print_Roman = "I"
    
elif number == 2:
    Print_Roman = "II"

elif number == 3:
    Print_Roman = "III"

elif number == 4:
    Print_Roman = "IV"

elif number == 5:
    Print_Roman = "V"

elif number == 6:
    Print_Roman = "VI"

elif number == 7:
    Print_Roman = "VII"

elif number == 8:
    Print_Roman = "VIII"

elif number == 9:
    Print_Roman = "IX"

elif number == 10:
    Print_Roman = "X"

if number < 1 or number > 10:
    print("Error: The number " +str(number)+ " is out of range.")
else: print(Print_Roman)
