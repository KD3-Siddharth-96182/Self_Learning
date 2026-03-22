#include<iostream>
using namespace std;

class Product
{
protected:
    string title;
    double price;

public:
    virtual void accept()
    {
        cout << "Enter Title: ";
        cin >> title;
        cout << "Enter Price: ";
        cin >> price;
    }

    virtual void display()
    {
        cout << "Title: " << title << endl;
        cout << "Price: " << price << endl;
    }

    virtual ~Product() {}
};


class Book : public Product
{
private:
    int pages;

public:
    void accept()
    {
        Product::accept();
        cout << "Enter Pages: ";
        cin >> pages;
    }

    void displayPages()
    {
        cout << "Pages: " << pages << endl;
    }
};


class Tape : public Product
{
private:
    int playtime;

public:
    void accept()
    {
        Product::accept();
        cout << "Enter Playtime: ";
        cin >> playtime;
    }

    void displayPlaytime()
    {
        cout << "Playtime: " << playtime << endl;
    }
};


int main()
{
    int choice;
    Product* arr[5];

    for(int i = 0; i < 5; i++)
    {
        cout << "1. Book, 2. Tape, Enter choice: ";
        cin >> choice;

        switch(choice)
        {
        case 1:
            arr[i] = new Book();
            arr[i]->accept();
            break;

        case 2:
            arr[i] = new Tape();
            arr[i]->accept();
            break;

        default:
            cout << "Invalid choice\n";
            i--; 
        }
    }

    cout << "\n--- Display Pages / Playtime ---\n";
    for(int i = 0; i < 5; i++)
    {
        Book* b = dynamic_cast<Book*>(arr[i]);
        if(b != NULL)
        {
            b->displayPages();
        }

        Tape* t = dynamic_cast<Tape*>(arr[i]);
        if(t != NULL)
        {
            t->displayPlaytime();
        }
    }

    for(int i = 0; i < 5; i++)
    {
        delete arr[i];
    }

    return 0;
}