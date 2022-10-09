"""
Kerry Creech
Homework 5 – COP1000 
Module 5 Repetition Structures

"""
# Print Number 1 - 10 and its aquare

sqr = 0
prtsqr = 0
print("Number\tSquare\n******\t******")
for num in range(1,11):
    sqr = sqr+1
    prtsqr = num*sqr    
    print( " ",num,"     ",prtsqr)
