"""
Kerry Creech
Homework 6 – COP1000 
Module 6 List, Dictionaries, Tuples

"""

totList = []

sun = float(input("Enter sales total for Sunday:"))
totList.insert(0, sun)

mon = float(input("Enter sales total for Monday:"))
totList.insert(1, mon)

tue = float(input("Enter sales total for Tuesday:"))
totList.insert(2, tue)

wed = float(input("Enter sales total for Wednesday:"))
totList.insert(3, wed)

thu = float(input("Enter sales total for Thursday:"))
totList.insert(4, thu)

fri = float(input("Enter sales total for Friday:"))
totList.insert(5, fri)

sat = float(input("Enter sales total for Saturday:"))
totList.insert(5, sat)

i = 0
tot = float(0)
for x in totList:
    tot = tot + totList[i]
    i = i+1
print(" Your total sales for the week is: ", tot)    
                 
