#include <iostream>
using namespace std;

class Shape{
protected:
    int para;

public:

    Shape(){}

    Shape(int n){
        para = n;
    }

    void accept_number(){
        cout<<"Enter para : \n";
        cin>>para;
    }
};

class Circle : public Shape{

public:

    double calArea(){
        return 3.14 * para * para;
    }

    void display(){
        cout<<"Area of Circle = \n"<<calArea()<<"\n";
    }
};

class Square : public Shape{

public:

    double calArea(){
        return para * para;
    }

    void display(){
        cout<<"Area of Square = \n"<<calArea()<<"\n";
    }
};

int main(){

    Circle c1;
    Square s1;

    c1.accept_number();
    c1.display();

    s1.accept_number();
    s1.display();

}