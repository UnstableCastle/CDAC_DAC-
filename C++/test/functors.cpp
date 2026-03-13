#include<iostream>
using namespace std;

class Add{
    public:
    int operator()(int a, int b){
return a+b;

    }

};


class Sub{
public: 
int operator()(int a, int b){
    return a-b;
}

};


int main(){

Add A;
Sub b;
int output = A(100,80);
cout<<"sum of number = "<<output<<endl;

output = b(10 ,20);
cout<<"sub of number = "<<output<<endl;
return 0;
}

