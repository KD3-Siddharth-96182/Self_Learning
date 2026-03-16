#include<iostream>
using namespace std;


void swapByValue(int num1, int num2){
    int temp=num1;
    num1=num2;
    num2=temp;
}

void swapByReference(int &x, int &y){
    int temp=x;
    x=y;
    y=temp;
}


int main()
{
    int num1=10, num2=20;

    cout << "Before swapByValue: "; 
    cout << num1<<" "<<num2<<endl; 

    swapByValue(num1,num2);

    cout << "After swapByValue: "; 
    cout << num1<<" "<<num2<<endl;
    
    
    cout << "Before swapByReference: "; 
    cout << num1<<" "<<num2<<endl; 

    swapByReference(num1,num2);

    cout << "After swapByReference: "; 
    cout << num1<<" "<<num2<<endl;

    return 0;
}