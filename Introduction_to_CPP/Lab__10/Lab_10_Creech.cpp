//Name:Kerry Creech
//Date:4/18/2021
//Assignment Name: Lab 10 Assignment - Option 3
//Brief Description of Program: Displays a pyramid made of asterisks
// based on user input of rows.


#include <iostream>

using namespace std;

int main()
{
    unsigned long int i,o,p,a,n;

    cout<<"Print a pyramid using the * character:\n";
    cout<<"__________________________________________\n";
    cout<<"\n";

    cout<<"Input number of rows: ";
    cin>>n;

    for(i=1;i<=n;i++)
    {
        for(o=1;o<=n-i;o++)
        {
            cout<<" ";
        }

        for(p=1;p<=i;p++)
        {
            cout<<"*";
        }

        for(a=i-1;a>=1;a--)
        {
            cout<<"*";
        }

        cout<<"\n";
    }
return 0;
}
