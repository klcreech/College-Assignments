/*Kerry Creech

Lab 3 Assignment

This program will hold the prices of five items in five variables.
It will then display each items price, subtotal, sale, sales tax
and total. This program will assign 7& to the sales tax. The purpose
of this program is t put into practical application what we have learned
up to this point in the class*/


#include <iostream>
#include <iomanip>

using namespace std;

int main()

{
    double Salmon = 15.95;
    double Coffee = 24.95;
    double Cheese = 6.95;
    double Soda = 12.95;
    double Butter = 3.95;

    double subtotal = Salmon + Coffee + Cheese + Soda + Butter;
    const double TAXRATE = .07; //Current Tax rate for State of Florida Leon County
    double tax = subtotal * TAXRATE;
    int taxnum = TAXRATE * 100;
    double total = subtotal + tax;

		cout << "Sales Receipt" << endl;
		cout << "\n";
		cout << "Salmon - Price:\t $" << Salmon << "\n";
		cout << "Coffee - Price:\t $" << Coffee << "\n";
		cout << "Cheese - Price:\t $" << Cheese << "\n";
		cout << "Soda   - Price:\t $" << Soda << "\n";
		cout << "Butter - Price:\t $" << Butter << "\n";
		cout << "\n";
		cout << "Sales Tax:\t %" << taxnum << "\n";
		cout << "\n";
		cout << "\n";
		cout << "Subtotal:\t $" << fixed << setprecision(2) << subtotal << endl;
		cout << "\n";
		cout << "Total Sales Tax: $"  << fixed << setprecision(2) << tax << endl;
		cout << "\n";
		cout << "Total Cost:\t $" << fixed << setprecision(2) << total << endl;


	    return 0; // return a zero indicating success!

}

