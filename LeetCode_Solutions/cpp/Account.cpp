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

void witdraw(double amt){
    if(balance<amt){
        cout<<"low balance !";
        return;
    }

    balance -=amt;
    cout<<"Witdraw amount = "<<amt<<" new balance = "<<balance;

}


};
int main(){
    Account a1(5000.00);

    a1.deposite(100);

    a1.getBalance();

    a1.witdraw(52000);
  

Account* ptr = new Account(5000.00);

    // 2. Call methods using the arrow operator
    ptr->getBalance();

    delete ptr;
  return 0;
}