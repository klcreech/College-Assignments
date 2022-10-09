Day_Of_Week = int(input("Enter a number between 1 and 7: "))

if Day_Of_Week == 1:
    Print_Day = "Sunday"
    
elif Day_Of_Week == 2:
    Print_Day = "Monday"

elif Day_Of_Week == 3:
    Print_Day = "Tuesday"

elif Day_Of_Week == 4:
    Print_Day = "Wednesday"

elif Day_Of_Week == 5:
    Print_Day = "Thursday"

elif Day_Of_Week == 6:
    Print_Day = "Friday"

elif Day_Of_Week == 7:
    Print_Day = "Saturday"

if Day_Of_Week < 1 or Day_Of_Week > 7:
    print("Error: The number " +str(Day_Of_Week)+ " is out of range.")
else: print(Print_Day)

