#include <iostream>
#include <fstream>
#include <ostream>
#include <string>

using namespace std;

class student{
int rno;
char name[15];

public:
student(){
cout<<"default con"<<endl;



}
student(int i , char s){
    cout<<"para  con"<<endl;
    // rno = i;
    // name = s;
}

~student(){

    
    cout<<"destructor";
}

void accept_data(){
cout<<"enter roll no :";
cin>>rno;
cout<<"enter name :";
cin>>name;

}

void display(){
    cout<<"Name     :  "<<name<<endl;
    cout<<"roll no  :  "<<rno<<endl;

}

};



int main(){
student s1;
s1.accept_data();
s1.display();

}