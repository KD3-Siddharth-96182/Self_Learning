#include<iostream>
using namespace std;

class BankAccount
{
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    void accept()
    {
        cout << "Enter Account Number: ";
        cin >> accountNumber;

        cout << "Enter Account Holder Name: ";
        cin >> accountHolderName;

        cout << "Enter Balance: ";
        cin >> balance;
    }


    void deposit(double amount)
    {
        if(amount < 0)
            throw amount;   

        balance += amount;
        cout << "Deposit successful\n";
    }


    void withdraw(double amount)
    {
        if(amount < 0)
            throw amount;  

        if(amount > balance)
            throw string("Error: Insufficient balance");  

        balance -= amount;
        cout << "Withdrawal successful\n";
    }

    void display()
    {
        cout << "\nAccount Details:\n";
        cout << "Account No: " << accountNumber << endl;
        cout << "Name: " << accountHolderName << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main()
{
    BankAccount acc;
    double amount;

    acc.accept();

    try
    {
        cout << "Enter deposit amount: ";
        cin >> amount;
        acc.deposit(amount);

        cout << "Enter withdraw amount: ";
        cin >> amount;
        acc.withdraw(amount);
    }
    catch(double amt)
    {
        cout << "Exception: Amount cannot be negative (" << amt << ")\n";
    }
    catch(string msg)
    {
        cout << msg << endl;
    }

    acc.display();

    return 0;
}