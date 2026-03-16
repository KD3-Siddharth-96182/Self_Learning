#include <iostream>
using namespace std;

class Students
{
private:
    int rollNo;
    int marks;

public:
    Students(void) : rollNo(0), marks(0) {}
    Students(int rollNo, int marks) : rollNo(rollNo), marks(marks) {}
    int getMarks(){
        return marks;
    }
    void accept()
    {
        cout << "Roll : ";
        cin >> rollNo;
        cout << "Marks : ";
        cin >> marks;
    }
    void printRecord(void)
    {
        cout << "Roll : " << rollNo<<"|" <<"Marks : "<<marks<<endl;
    }
};

int main()
{
    int n;
    cout << "enter number of students";
    cin >> n;
    Students *arr = new Students[n];

    for (int i = 0; i < n; i++)
    {
        arr[i].accept();
    }
    cout << "------------students record---------------" << endl;
    for (int i = 0; i < n; i++)
    {
        arr[i].printRecord();
    }
    int highest=arr[0].getMarks();
    for (int i = 0; i < n; i++)
    {
        if(arr[i].getMarks()> highest){
            highest=arr[i].getMarks();
        }
       
    }
   cout<<"highest mark is : "<<highest<<endl;

    delete[] arr;
    arr = NULL;

    return 0;
}
