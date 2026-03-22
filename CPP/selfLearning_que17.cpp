#include <iostream>
#include <fstream>
using namespace std;

class Student
{
private:
    int id;
    char name[50];
    double marks;

public:
    void accept()
    {
        cin >> id;
        cin >> name;
        cin >> marks;
    }

    void display()
    {
        cout << id << " " << name << " " << marks << endl;
    }

    void writeToFile()
    {
        ofstream fout("student.dat", ios::binary | ios::app);
        fout.write((char *)this, sizeof(*this));
        fout.close();
    }

    void readFromFile()
    {
        ifstream fin("student.dat", ios::binary);
        while (fin.read((char *)this, sizeof(*this)))
        {
            display();
        }
        fin.close();
    }
};

int main()
{
    Student s;
    int choice;

    do
    {
        cin >> choice;
        if (choice == 1)
        {
            s.accept();
            s.writeToFile();
        }
        else if (choice == 2)
        {
            s.readFromFile();
        }
    } while (choice != 0);

    return 0;
}