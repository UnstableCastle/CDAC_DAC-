// CLASS 

//DATE
#include <iostream>
using namespace std;

class Date{
int dd,mm,yy;

public:

void set_Date(int d,int m, int y){
    this->dd = d;
    this->mm = m;
    this->yy=y;
}

void display(){

    cout<<"Date =  "<<this->dd<<" \t"<<this->mm<<"\t"<<this->yy;


}


};

int main(){
Date d1;
d1.set_Date(01,12,20);
d1.display();

}



// DATE AND TIME 
#include <iostream>
using namespace std;

class Date{
int dd,mm,yy;
int hh,min,ss;

public:
void set_Time(int h,int m, int s){
    this->hh =h ;
    this->min = m;
    this->ss=s;
}



void set_Date(int d,int m, int y){
    this->dd = d;
    this->mm = m;
    this->yy=y;
}

void display(){

    cout<<"Date =  "<<this->dd<<"/"<<this->mm<<"/"<<this->yy;
    cout<<"\n";
    cout<<"Time =  "<<this->hh<<":"<<this->min<<":"<<this->ss;


}

};

int main(){
Date d1;
d1.set_Date(01,12,20);
d1.set_Time(1,23,30);
d1.display();

}

// pointer(x,y)

