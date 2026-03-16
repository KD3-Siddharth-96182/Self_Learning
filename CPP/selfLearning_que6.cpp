#include <iostream>
using namespace std;

class BankAccount
{
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    BankAccount(void) : accountNumber(0), accountHolderName(""), balance(0) {}
    BankAccount(int accountNumber, string accountHolderName, double balance) : accountNumber(accountNumber), accountHolderName(accountHolderName), balance(balance) {}

    void deposit(double dep)
    {
        balance+=dep;
    }
    void withdraw(double dep)
    {
        balance-=dep;
    }
    void displayBalance()
    {

        cout<<"Your name is:"<<this->accountHolderName<<endl;
        cout<<"Your Acc number is:"<<this->accountNumber<<endl;
        cout<<"Your Acc balance is:"<<this->balance<<endl;
    }
};

int main()
{

    BankAccount account(1298,"siddharth rukadikar",10000);

    // account.deposit(2000);
    account.withdraw(4000);
    account.displayBalance();

    return 0;
}