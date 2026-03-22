#include<iostream>
using namespace std;

namespace college
{

    class InvalidMarksException
    {
    public:
        void showError()
        {
            cout << "Error: Marks cannot be negative!" << endl;
        }
    };

    class Student
    {
    private:
        int rollNo;
        string name;
        int marks;

    public:
        void accept()
        {
            cout << "Enter Roll No: ";
            cin >> rollNo;

            cout << "Enter Name: ";
            cin >> name;

            cout << "Enter Marks: ";
            cin >> marks;

            if(marks < 0)
                throw InvalidMarksException();  
        }

        void display()
        {
            cout << "\nStudent Details:\n";
            cout << "Roll No: " << rollNo << endl;
            cout << "Name: " << name << endl;
            cout << "Marks: " << marks << endl;
        }
    };

    class Teacher
    {
    private:
        int id;
        string name;

    public:
        void accept()
        {
            cout << "Enter Teacher ID: ";
            cin >> id;

            cout << "Enter Name: ";
            cin >> name;
        }

        void display()
        {
            cout << "\nTeacher Details:\n";
            cout << "ID: " << id << endl;
            cout << "Name: " << name << endl;
        }
    };
}


int main()
{
    try
    {
        college::Student s;
        s.accept();
        s.display();

        college::Teacher t;
        t.accept();
        t.display();
    }
    catch(college::InvalidMarksException e)
    {
        e.showError();   
    }

    return 0;
}