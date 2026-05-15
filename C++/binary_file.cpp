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

    
    cout<<"destructor"<<endl;
}

void set_data(){
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


int main()
{
ofstream f1;
ifstream f2;

f1.open("mydata.dat");
student obj1,obj2;

obj1.set_data();

f1.write((char *)&obj1,sizeof(obj1));

obj1.display();


f1.close();

f2.open("mydata.dat");

f2.read((char *)&obj2,sizeof(obj2));

obj2.display();

f2.close();

}