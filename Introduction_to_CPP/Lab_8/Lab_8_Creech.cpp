//Name:Kerry Creech
//Date:4/2/2021
//Assignment Name: Lab 8 Assignment
//Brief Description of Program: This program takes
//measurements for any triangle, rectangle or circle and provides the area.


#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;


int main ()
{

	//Variable declarations / initialization
	int choice;
	double radC, areaC, areaR, areaT, lengthR, widthR, baseT, heightT;


	const int AREA_CIRCLE = 1,
	          AREA_RECTANGLE = 2,
	          AREA_TRIANGLE = 3,
	          QUIT = 4,
	          MIN_CHOICE = 1,
	          MAX_CHOICE = 4;


	//User Prompts and Input
	    cout << "Thank you for using GeoCal!\n";
	    cout << "\n";
	    cout << "GeoCal will calculate the area for any circle, rectangle or triangle\n";
	    cout << "that you provide measurements to.";
	    cout << "\n";
	    cout << "\n";

        cout << "Geometry Calculator\n";
        cout << "\t1.Calculate the Area of a Circle\n";
	    cout << "\t2.Calculate the Area of a Rectangle\n";
	    cout << "\t3.Calculate the Area of a Triangle\n";
        cout << "\t4.Quit\n";
	    cout << "Enter your choice (1-4): ";
        cin >> choice;

    //Validation #1

    if (choice >= MIN_CHOICE && choice <= MAX_CHOICE)
    {


         //Equations / Mathematical Expressions /Switch Statement


            switch (choice)
            {
                case AREA_CIRCLE:
                    cout << "What is the radius of the circle: " ;
                    cin >> radC;

                    // Validation #2
                    if (radC < 0)
                    {
                         cout << "Invalid entry!\n";
                         cout << "Radius must be a non-negative number; run program again.";
                    }
                    else
                    {
                        areaC = M_PI * pow(radC, 2);
                        cout << "The area of the circle is: " << areaC;
                    }
                break;

                case AREA_RECTANGLE:
                    cout << "What is the length of the rectangle: ";
                    cin >> lengthR;
                    cout << "What is the width of the rectangle: ";
                    cin >> widthR;

                    // Validation #3
                     if (lengthR < 0 || widthR < 0)
                    {
                         cout << "Invalid entry!\n";
                         cout << "Length and Width must be a non-negative number; run program again.";
                    }
                    else
                    {
                        areaR = lengthR * widthR;
                        cout << "The area of the rectangle is: " << areaR;
                    }
                break;

                case AREA_TRIANGLE:
                    cout << "What is the base of the triangle: ";
                    cin >> baseT;
                    cout << "What is the height of the triangle: ";
                    cin >> heightT;

                    //Validation #4
                    if (baseT < 0 || heightT < 0)
                    {
                         cout << "Invalid entry!\n";
                         cout << "Base and Height must be a non-negative number; run program again.";
                    }
                    else
                    {
                        areaT = 0.5 * baseT * heightT;
                        cout << "The area of the triangle is: " << areaT;
                    }

                break;

                case QUIT:
                    cout << "\n";
                    cout << "Goodbye";
                break;

            }

    }
    else
    {
        cout << "\n";
        cout << "\n";
        cout << "That is an invalid entry. Run the program\n";
        cout << "again and enter a range of " << MIN_CHOICE << " through " << MAX_CHOICE << ".\n";

    }

    return 0;
 }

