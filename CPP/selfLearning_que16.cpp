#include <iostream>
using namespace std;

class Student
{
private:
    int marks;

public:
    Student() : marks(0) {}

    void setMarks(int m)
    {
        if (m < 0)
            throw m;
        marks = m;
    }

    void display()
    {
        cout << "Marks: " << marks << endl;
    }
};

template <class T>
class SmartPtr
{
private:
    T *ptr;

public:
    SmartPtr(T *p = nullptr) : ptr(p) {}

    ~SmartPtr()
    {
        delete ptr;
    }

    T *operator->()
    {
        return ptr;
    }

    T &operator*()
    {
        return *ptr;
    }
};

int main()
{
    try
    {
        SmartPtr<Student> s(new Student);
        int m;
        cin >> m;
        s->setMarks(m);
        s->display();
    }
    catch (...)
    {
        cout << "invalid input" << endl;
    }
    return 0;
}