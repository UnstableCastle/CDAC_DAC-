#include<iostream>
using namespace std;

class Teacher{
char ch= 'A';

public:


Teacher(){                      //con
cout<<" "<<ch;

}

void display1(){
    Teacher();
    cout<<"asdfghjk";         //member fun
}

~Teacher(){                    //des
    
}

};


void display(){                 // fun
Teacher();
//display1();                   //member fun
}



int main(){
Teacher t1;
t1.display1();
// display();

}