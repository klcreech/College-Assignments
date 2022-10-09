//Name:Kerry Creech
//Date:3/28/2021
//Assignment Name: Lab 7 Assignment
//Brief Description of Program: This program takes
//the users FICO Score and Mortgage Rate and gives them the interest rate they qualify for.


#include <iostream>
#include <iomanip>

using namespace std;


int main ()
{

	//Variable declarations / initialization
	int cScore, mType;
	double fYear,tYear, iRate;

	fYear = 3.3;
	tYear = 4.1;


	//User Prompts and Input
	cout << "Thank you for using IRate.\n";
	cout << "This program will ask you for your credit score and preferred mortgage rate\n";
	cout << "then it will provide you the interest rate you qualify for.\n";
	cout << "\n";
	cout << "\n";
	cout << "\n";
	cout << "Please enter your credit score.\n";
	cin >> cScore;
    cout << "\n";
    cout << "What type of Mortgage do you prefer? 15 or 30 Year? \( Please enter 15 or 30 \)\n";
    cin >> mType;
    cout << "\n";
    cout << "\n";



	//Equations / Mathematical Expressions
	if (cScore >= 500 && cScore <= 579)
    {
        tYear += 4;
        fYear += 4;
    }
    else if (cScore >= 580 && cScore <= 619)
    {
        tYear += 2.25;
        fYear += 2.25;
    }
    else if (cScore >= 620 && cScore <= 659)
    {
        tYear += 1.5;
        fYear +=  1.5;
    }
    else if (cScore >= 660 && cScore <= 699)
    {
        tYear += 0.5;
        fYear +=  0.5;
    }
     else if (cScore >= 700 && cScore <= 759)
    {
        tYear += 0.25;
        fYear +=  0.25;
    }
     else if (cScore >= 700 && cScore <= 759)
    {
        tYear += 0;
        fYear +=  0;
    }

    if (mType == 30)
    {
        iRate = tYear;
    }
    else
    {
        iRate = fYear;
    }


    //results output


    cout << "Your Credit Score is: " << cScore << "\n";
    cout << "You prefer a " << mType << " year Mortgage.\n";
    cout << "\n";
    cout << "Based on the above information your interest rate will be " << iRate << "%.";
    cout << "\n";
    cout << "\n";




	//Goodbye display
    cout << "Thank you for using IRate." << endl;


	return 0;
}
