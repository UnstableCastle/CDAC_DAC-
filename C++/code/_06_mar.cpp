//operator overloading

#include<iostream>
using namespace std;

class MyComplex{
int real , img;

public : 

MyComplex(){
    cout<<"default\n";
    real = 0;
    img = 0;
}

MyComplex(int r ,int i){
    cout<<"para\n";
    real = r;
    img = i;
}

~MyComplex(){
    cout<<"destructor\n";
}

//member functions
void set_Real(int r){
    this->real = r;
}

void set_Complex(int i){
    this->img = i;
}

MyComplex Add(MyComplex c){
    MyComplex temp;
    temp.real = this->real + c.real;
    temp.img = this->img + c.img;
    return temp;
}

MyComplex sub(MyComplex c){
    MyComplex temp;
    temp.real = this->real - c.real;
    temp.img = this->img - c.img;
    return temp;
}

void display(){
    cout<<"Number = "<<real<<" + "<<img<<"i"<<endl;
}

}; // end class

int main(){

    MyComplex c1(1,3), c2(2,3);
    
    MyComplex c3 = c1.Add(c2);   // store result
    
    c3.display();

}

//copy constructer 





