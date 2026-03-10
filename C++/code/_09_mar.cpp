// inheritance 

// single level

#include <iostream>
using namespace std;

class BASE{
protected:
int i ;  //data member

public:
//member functions
BASE(){ //  def con
    
    cout<<"BASE default constructor \n";

    i =0;
}

BASE(int n){
// para con 

cout<<" BASE para con \n";
i = n;

}

~BASE(){
    
    cout<<" BASE des";
}
virtual void display(){

    cout<<"i = "<<i<<"\n";
 }


};

class Derived : public BASE{ //inheritance
protected:
int j ;

public: 
Derived(){

    cout<<"derived...default \n";
    j = 0;
}

Derived(int m,int n ): BASE(n) {
    cout<<"para constructor \n";
    j = m;
}

~Derived(){
    cout<<"derived des \n";

}

void display(){
 cout<<"i = "<<i<<"\n";
 cout<<"j = "<<j<<"\n";


}

};

int main(){

Derived obj(10,20);
obj.display();
return 0 ;


}

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