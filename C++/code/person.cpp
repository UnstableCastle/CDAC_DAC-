#include <iostream>
using namespace std;

class Student{
protected : 
char name;
int age;

public:
Student(){
cout<<"Default constructor ";
}

~Student(){
cout<<"Destructor ";
}
Student(char c,  int a){
cout<<" para constructor ";
name = c;
age= a;

}

void get_Student(const Student &s1){
cout<<" copy constructor ";
    
name = s1.name;
age = s1.age;




}




};