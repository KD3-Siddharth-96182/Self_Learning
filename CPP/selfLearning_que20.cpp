#include <iostream>
#include <memory>
using namespace std;

class Demo
{
public:
    Demo() { cout << "Constructor\n"; }
    ~Demo() { cout << "Destructor\n"; }
    void show() { cout << "Hello\n"; }
};

int main()
{
    unique_ptr<Demo> p1(new Demo());
    p1->show();

    unique_ptr<Demo> p2 = move(p1);
    if (!p1)
        cout << "p1 is null\n";
    p2->show();

    shared_ptr<Demo> sp1(new Demo());
    shared_ptr<Demo> sp2 = sp1;
    cout << sp1.use_count() << endl;

    weak_ptr<Demo> wp = sp1;
    if (auto temp = wp.lock())
        temp->show();

    return 0;
}