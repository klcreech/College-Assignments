"""
Kerry Creech
Homework 6 – COP1000 
Module 6 List, Dictionaries, Tuples
"""
dict1 = {1:10, 2:20}
dict2 = {3:30, 4:40}
dict3 = {5:50, 6:60}

i = 1
value = 0
newdict= {}   

while i < len(dict2) + len(dict3) + len(dict1) + 1:
    value = value + 10
    newdict[i] = value
    i = i + 1
    
print(newdict)    
                 

   
                 
