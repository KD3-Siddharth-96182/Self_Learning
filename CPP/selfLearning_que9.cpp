#include <iostream>
using namespace std;

class Person
{
private:
    string name;
    int age;

public:
    Person(void) : name(""), age(0) {}
    Person(string name, int age)
    {
        this->name = name;
        this->age = age;
    }
    void display()
    {
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
    }
    virtual void work() = 0;
};

class Student : public Person
{
private:
    float marks;

public:
    Student(string name, int age, float marks) : Person(name, age)
    {
        this->marks = marks;
    }

    void study()
    {
        cout << "Student is studying" << endl;
    }
    void work()
    {
        cout << "Student's work is studying" << endl;
    }
};

class Teacher : public Person
{
private:
    double salary;

public:
    Teacher(void) : salary(0) {}
    Teacher(string name, int age, double salary) : Person(name, age)
    {
        this->salary = salary;
    }
    void teach()
    {
        cout << "Teacher is teaching" << endl;
    }

    void work()
    {
        cout << "Teacher's work is teaching" << endl;
    }
};

int main()
{

    Person *p;

    Student s("Siddharth", 20, 85);
    Teacher t("Yogesh", 40, 500);

    p = &s;
    p->display();
    p->work();

    p = &t;
    p->display();
    p->work();

    return 0;
}