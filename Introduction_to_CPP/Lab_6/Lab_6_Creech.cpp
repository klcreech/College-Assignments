//Name:Kerry Creech
//Date:3/14/2021
//Assignment Name: Module 8 Assignment
//Brief Description of Program: This program takes
//The area of a 2 rectangles is calculated and compared for greatest area.


#include <iostream>
#include <iomanip>

using namespace std;


int main ()
{

	//Variable declarations / initialization
	int rLength1, rWidth1, rLength2, rWidth2, area1, area2;


	//User Prompts and Input
	cout << "Thank you for using RecCompare.\n";
	cout << "This program will ask you for he length and width of two rectangles\n";
	cout << "then compare both of them to tell you which one has the greatest area.\n";
	cout << "\n";
	cout << "\n";
	cout << "\n";
	cout << "Please answer the following questions.\n";
	cout << "\n";
	cout << "What is th length of first rectangle?\n";
    cin >> rLength1;
    cout << "\n";
    cout << "What is the width of the first rectangle?\n";
    cin >> rWidth1;
    cout << "\n";
    cout << "What is the length of the second rectangle?\n";
    cin >> rLength2;
    cout << "\n";
    cout << "What is the width of the second rectangle?\n";
    cin >> rWidth2;
    cout << "\n";
    cout << "\n";



	//Equations / Mathematical Expressions
    area1 = rLength1 * rWidth1;
    area2 = rLength2 * rWidth2;


    //If/Else Statement with output display

    if (area1 > area2) {
        cout << "Rectangle one has an area of: " << area1 << "\n";
        cout << "Rectangle two has an area of: " << area2 << "\n";
        cout << "\n";
        cout << "Rectangle one has the greater area.";
        cout << "\n";
        cout << "\n";
    }

    else {

        if (area1 == area2) {
            cout << "Both rectangles have equivalent areas.";
            cout << "\n";
            cout << "\n";

        }
        else {
        cout << "Rectangle one has an area of: " << area1 << "\n";
        cout << "Rectangle 2 has an area of: " << area2 << "\n";
        cout << "\n";
        cout << "Rectangle two has the greater area.\n";
        cout << "\n";
        cout << "\n";
        }
    }



	//Goodbye display
    cout << "Thank you for using RecCompare." << endl;


	return 0;
}
