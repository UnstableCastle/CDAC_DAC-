#include<iostream>
#include<string>

using namespace std;

class Account{
    private:
        double balance;
    
    public:

    Account(double balance){
        this->balance = balance;
    }

    void deposite(double amount){
        balance+=amount;
        cout<<"Amount "<<amount<<" added new balance = "<< balance <<"\n"<< endl;
    }

    void getBalance(){
        cout<<"balance = "<<balance<<endl;
    }

};
int main(){
    Account a1(5000.00);

    a1.deposite(100);

    a1.getBalance();
    return 0;
}