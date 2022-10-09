// A simple C++ program by: Kerry Creech
// This program takes two separate variable inputs from the user and gives a calculation based on the data provided.
// The instructions are from question 8 on Lab 4.
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int stuNum, pasNum;
    double perc, percCalc;

    cout << "How many students are in the course? ";
    cin >> stuNum;
    cout <<  "\n";
    cout << "How many students have passing grades? ";
    cin >> pasNum;
    cout <<  "\n";
    perc = static_cast<double>(pasNum) / stuNum;
    percCalc = perc * 100;
    cout <<  "\n";
    cout <<  "\n";
    cout << "Total number of students in the course is: "  << stuNum <<  "\n";
    cout <<  "\n";
    cout << "Total number of students that passed the course is: "  << pasNum <<  "\n";
    cout <<  "\n";
    cout << "The percentage of students that have passed the course is "  << fixed << setprecision(1) << percCalc << "%" << "\n";

    return 0;
}

