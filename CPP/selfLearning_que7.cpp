#include <iostream>
using namespace std;

namespace college
{
    class Student
    {
    private:
        int rollNo;
        string name;

    public:
        Student(void):rollNo(0),name(""){}

        void setRollNo(int rollNo)
        {
            this->rollNo = rollNo;
        }

        void setName(string name)
        {
            this->name = name;
        }

        int getRollNo()
        {
            return rollNo;
        }

        string getName()
        {
            return name;
        }
        void display()
        {
            cout << "Student Roll No: " << rollNo << endl;
            cout << "Student Name: " << name << endl;
        }
    };

    class Teacher
    {
    private:
        int id;
        string name;

    public:
        Teacher(void):id(0),name(""){}
        void setId(int id)
        {
            this->id = id;
        }

        void setName(string name)
        {
            this->name = name;
        }
        int getId()
        {
            return id;
        }

        string getName()
        {
            return name;
        }

        void display()
        {
            cout << "Teacher ID: " << id << endl;
            cout << "Teacher Name: " << name << endl;
        }
    };

}

int main()
{

    college::Student s1;
    college::Teacher t1;
    s1.setRollNo(102);
    s1.setName("siddharth");
    t1.setId(101);
    t1.setName("Yogesh");
    cout << "---------------Student Details--------------" << endl;
    s1.display();

    cout << "---------------Teacher Details--------------" << endl;
    t1.display();
    return 0;
}