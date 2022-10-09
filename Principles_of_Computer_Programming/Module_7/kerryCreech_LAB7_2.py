"""
Kerry Creech
Homework 7 – COP1000 
Module 7 Functions
"""
def calc(k):
    m = k * 0.6214

    return m



numberK = int(input("Enter the amount of kilometers: "))

print(" The kilometers you entered is equal to", round(calc(numberK), 2), "miles.")
