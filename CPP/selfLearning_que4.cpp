#include<iostream>
using namespace std;

class Laptop{
    private:
        int brandId;
        double price;
    public:
        Laptop(void): brandId(1), price(50000) {
            cout<<"Laptop Constructor Called"<<endl;
        }
        ~Laptop(void){
            cout<<"Laptop Destructor Called"<<endl;
        }
        void display(){
            cout<<"Brand Id is: "<<brandId<<endl;
            cout<<"Price is: "<<price<<endl;
        }

};

int main(){

    Laptop *laptopPtr=new Laptop();
    laptopPtr->display();
    delete laptopPtr;
    laptopPtr=NULL;
    return 0;
}