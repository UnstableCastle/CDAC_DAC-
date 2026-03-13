#include<iostream>
using namespace std;
class  A{
int data;
public:
A(){
 cout<<"default con"<<endl;


}

~A(){
 cout<<"DEST"<<endl;


}


void set_data(){
    cout << "enter a number ";
    cin>>data;

}
void display(){
 cout<<"value of data  = "<<data<<endl;
 }



friend class B;
};

class B{
public:
 void display(A obj){

     cout<<"value A    = "<<endl;

}


};