"""
Kerry Creech
Homework 4 – COP1000 
Module 4 Boolean Logic

"""

Rec_Length_1 = int(input("Enter length of Rectangle 1: "))
Rec_Width_1 = int(input("Enter width of Rectangle 1: "))
Rec_Length_2 = int(input("Enter length of Rectangle 2: "))
Rec_Width_2 = int(input("Enter width of Rectangle 2: "))

Area_Rec_1 = Rec_Length_1 * Rec_Width_1
Area_Rec_2 = Rec_Length_2 * Rec_Width_2

if Area_Rec_1 > Area_Rec_2:
    Print_Ans = "The area of Rectangle 1 is greater than Rectangle 2 "
    
elif Area_Rec_1 < Area_Rec_2:
    Print_Ans = "The area of Rectangle 2 is greater than Rectangle 1"

elif Area_Rec_1 == Area_Rec_2:
    Print_Ans = "The area of both Rectangles are the same"
    
print(Print_Ans)
