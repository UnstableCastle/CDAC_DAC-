//operator overloading

#include<iostream>

using namespace std;

class MyComplex{
int real , img;

public : 

MyComplex(){
cout<<"default";

    real = 0;
    img= 0;
     

}

MyComplex(int r ,int i){
cout<<"para";
real = r;
img = i;

}

~MyComplex(){
cout<<"destructor";


}

void set_Value(){

    
}





};// end of class




//copy constructer 





