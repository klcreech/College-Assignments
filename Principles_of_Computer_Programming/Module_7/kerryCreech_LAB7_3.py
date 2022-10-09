"""
Kerry Creech
Homework 7 – COP1000 
Module 7 Functions
"""

def calc():
    
    ly = (3*10**8) / 1609.34

    mly = 31536000 * ly

    return mly



print(" A ball travelling at the speed of light travels", round(calc(), 3), "miles in a year.")
