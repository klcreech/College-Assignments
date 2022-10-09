//Name:Kerry Creech
//Date:2/26/2021
//Assignment Name: Module 7 Assignment
//Brief Description of Program: This program takes
//FirstName, Last Name, Monthly car loan payment,
//Auto insurance cost, monthly gas cost, and maintenance
//cost as input and processes it to display the calculated monthly cost of owning the vehicle.

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;


int main ()
{

	//Variable declarations / initialization
	string fName, lName;
	double monLoan, monIns, monGas, monMain, totMon, totAnn;


	//User Prompts and Input
	cout << "Thank you for using AutoCal.\n";
	cout << "\n";
	cout << "This program will provide you with\n";
	cout << "the total monthly and annual cost of your vehicle.\n";
	cout << "\n";
	cout << "\n";
	cout << "Please answer the following questions.\n";
	cout << "\n";
	cout << "What is you first name?\n";
    cin >> fName;
    cout << "\n";
    cout << "What is you last name?\n";
    cin >> lName;
    cout << "\n";
    cout << "What is your monthly auto loan payment?\n";
    cin >> monLoan;
    cout << "\n";
    cout << "What is your monthly auto insurance payment?\n";
    cin >> monIns;
    cout << "\n";
    cout << "What is your estimated monthly gas cost?\n";
    cin >> monGas;
    cout << "\n";
    cout << "What is your estimated monthly maintenance cost (oil, cleaning, service, repairs)?\n";
    cin >> monMain;


	//Equations / Mathematical Expressions
    totMon = monLoan + monIns + monGas + monMain;
    totAnn = totMon * 12; // Monthly cost multiply by 12 months for Annual

	//Output display
    cout << "\n";
    cout << "\n";
    cout << "\n";
    cout << setprecision(2) << fixed;
    cout << "Name" << left << setw(41) << ":"; //setw could only be used against the colon because different names have different lengths
    cout << fName << " " << lName << endl;
    cout << "Monthly Loan Payment: " << right << setw(24) << "$"<< monLoan << endl;
    cout << "Monthly Insurance Cost: " << right << setw(22) << "$"<< monIns << endl;
    cout << "Estimated Monthly Gas: " << right << setw(23) << "$"<< monGas << endl;
    cout << "Estimated Monthly Miscellaneous Cost: " << right << setw(8) << "$"<< monMain << endl;
    cout << "\n";
    cout << "\n";
    cout << "Total Monthly Cost: " << right << setw(26) << "$"<<totMon << endl;
    cout << "Total Annual Cost: " << right << setw(27) << "$"<<totAnn;
    cout << "\n";
    cout << "\n";
    cout << "\n";
    cout << "Thank you " << fName << " for using AutoCal!" << endl;


	return 0;
}
