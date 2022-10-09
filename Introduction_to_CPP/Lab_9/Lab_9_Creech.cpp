//Name:Kerry Creech
//Date:4/11/2021
//Assignment Name: Lab 9 Assignment
//Brief Description of Program: This program takes
//numbers and sums then using do/while loops.


#include <iostream>
#include <cmath>

using namespace std;


int main ()
{

	//Variable declarations / initialization
	int numAmt, i, newNum, newTot;
	char nxtSumChoice;

	numAmt = 0;
	i = 1;
	newNum = 0;
	newTot = 0;
	nxtSumChoice = 'Y';


	//User Prompts and Input
	    cout << "\tThank you for using SumCal!\n";
	    cout << "\n";
	    cout << "\tSumCal will sum up all the numbers you provide.";
	    cout << "\n";
	    cout << "\n";




        while (nxtSumChoice == 'Y')
        {
          cout << "\n\tPlease enter the numbers you would like to enter: ";
          cin >> numAmt;

          if ( numAmt > 0) // Validation
          {
            cout << "\tThanks! You may now entr the numbers for summation:\n";
            cout << "\n";

            do
            {
                cout << "\tEnter Number " << i << ":";
                cin >> newNum;
                cout << "\t\t\t\tTOTAL SUM: " << newNum + newTot << "\n";
                newTot += newNum;
                i++;
          }while (i <= numAmt);

        }
        else
        {

            cout << "\tRestart program and enter a number greater than Zero....\n";
            return 0;
        }

        if (i > 0)//Reset
        {
            numAmt = 0;
	        i = 1;
	        newNum = 0;
	        newTot = 0;
        }
          cout << "\nWould you like to find the sum of a new set of numbers?\n";
          cout << "\nEnter 'Y' for Yes or any other letter for No: ";
          cin >> nxtSumChoice;

        }
        // Exit Meseege
         cout << "\n\n\Thank you for using SumCal - GoodBye!\n\n ";


    return 0;
 }

