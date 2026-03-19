#include <iostream>
#include <cstring>
using namespace std;

class Employee{
protected:
string name;
int id;


public:
Employee(){
cout<<"default constructor ....emp"<<endl;
name = "DEFAULT";
id = 0 ;
}

Employee(int i , string n){
cout<<"para constructor ....emp"<<endl;
this->name = n;
this->id = i;

}

virtual~Employee(){
cout<<"distructor constructor ....emp"<<endl;

}

virtual int calSal() = 0;

virtual void displaydetails(){};

};

class FullTime : public Employee{
protected : 
int mon_sal;
public:
FullTime()
{
  cout<<"default constructor...fulltime "<<endl;

}
~FullTime()
{
  cout<<"destructor full time"<<endl;

}

FullTime(int i , string n,int s) : Employee(i,n)
{

cout<<"para constructor ....full time"<<endl;

  mon_sal = s;

}

int calSal(){
    return mon_sal;
    
}

void displaydetails(){
    cout<<"\n";   
    cout<<"employee details.."<<endl;
    cout<<"name = "<<name<<endl;
    cout<<"ID = "<<id<<endl;
    cout<<"Salary = "<<calSal();
    cout<<"\n";
}

};

class PartTime : public Employee{
protected:
int workhrs;
int sal_hrs;

public:
PartTime(){
    cout<<"default constructor .......part time"<<endl;
}

PartTime(int i , string n,int hr,int sh) : Employee(i,n){
workhrs = hr;
sal_hrs =sh;

}

~PartTime(){
cout<<"destructor ... partime"<<endl;

}

int calSal(){
int sal;
sal = workhrs *sal_hrs;

    return sal;
}

void displaydetails(){
    cout<<"\n";
    cout<<"employee details.."<<endl;
    cout<<"name = "<<name<<endl;
    cout<<"ID = "<<id<<endl;
    cout<<"Salary = "<<calSal();
    cout<<"\n";
}

};

int main(){

Employee* emp1 = new FullTime(101, "abc",50000);
Employee* emp2 = new PartTime(102, "efg", 40, 20);



emp1->displaydetails();
emp2->displaydetails();

 delete emp1;
 delete emp2;
}