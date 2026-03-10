#include<iostream>
using namespace std;

class Emp{
protected:
string name;
int id;
float sal;

public:

Emp(){
    cout<<"default con emp\n";
    name = "ABC";
    id = 0;
    sal = 5000;
}

Emp(string n , int i , float s){
    cout<<"para con emp\n";
    name = n;
    id = i;
    sal = s;
}

virtual ~Emp(){
    cout<<"dest emp \n";
}

virtual float cal_sal() = 0;

};

class Manager : public Emp{
    
protected: 
int allowance;

public:

Manager(){
cout<<"default of manager \n";
allowance = 0;
}

Manager(string n , int i , float s,int a):Emp(n,i,s){
cout<<"para of manager \n";
allowance = a;
}

~Manager(){
cout<<"des of manager \n";
}

};

class HR : public Manager{

protected:
float target;

public:

HR(){
cout<<"default con HR \n";
target = 0;
}

HR(string n , int i , float s, int a,float t):Manager(n,i,s,a){
cout<<"para con HR \n";
target = t;
}

~HR(){
cout<<"des ...HR \n";
}

float cal_sal(){
float salA;
salA = sal + allowance + (0.15 * target);
return salA;
}

};

class Admin : public Emp{

protected:
int allowance;

public:

Admin(){
cout<<"default con Admin\n";
allowance = 0;
}

~Admin(){
cout<<"des Admin\n";
}

float cal_sal(){
return sal + allowance;
}

};

class Clerk : public Emp{

protected:
int allowance;

public:

Clerk(){
cout<<"default con Clerk\n";
allowance = 0;
}

~Clerk(){
cout<<"des Clerk\n";
}

float cal_sal(){
return sal + allowance;
}

};

class Security : public Emp{

protected:
int allowance;

public:

Security(){
cout<<"default con Security\n";
allowance = 0;
}

~Security(){
cout<<"des Security\n";
}

float cal_sal(){
return sal + allowance;
}

};

int main(){

Emp *e1 = new HR("AAA",1,10000,1000,10);
cout<<"\nHR Salary = "<<e1->cal_sal()<<endl;
delete e1;

Emp *e2 = new Admin();
cout<<"\nAdmin Salary = "<<e2->cal_sal()<<endl;
delete e2;

Emp *e3 = new Clerk();
cout<<"\nClerk Salary = "<<e3->cal_sal()<<endl;
delete e3;

Emp *e4 = new Security();
cout<<"\nSecurity Salary = "<<e4->cal_sal()<<endl;
delete e4;

return 0;
}