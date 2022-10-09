"""
Kerry Creech
Homework 5 – COP1000 
Module 5 Repetition Structures

"""
# create budget, add expenses, see if over budget
budget = input("Enter your budget number: ")
expsum = 0.0
expense = 0.0

while True:
    
    expense = input("Enter an expense number or click enter to stop: ")

    if expense != "":
        number = float(budget)
        expsum = expsum + float(expense)
        bres = float(budget) - expsum
        print("\nCurrent expenses are:", expsum)
       
    else:
        break
        
    
if bres < 0:
    result = print("You are over budget")
    print("Your current expenses are:", expsum, "\nYour Budget Balance is:", bres)
    
else:
    result = print("You are under budget")           
    print("Your current expenses are:", expsum, "\nYour budget balance is:", bres)

                    
