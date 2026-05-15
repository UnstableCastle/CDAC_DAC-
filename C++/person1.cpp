// Online C++ compiler to run C++ program online
#include <iostream>
#include <string>
using namespace std;

class Person{
    private: 
    string name;
    
    public:
    
    Person(){
        this-> name = "null";
    }
    
    Person(string name){
        this->name = name;
    }
    
    virtual ~Person(){}
    
    
    void setName(string name){
        this->name  = name;
    }

    string getName(){
        return name;
    }
   virtual void display(){
        cout<<"Name : "<<name <<endl;
    }
    virtual void details () = 0;
    
    
        
};

class Student : public Person{
    private:
        int sid;
    
    public :
    Student (){
        this->sid = 0;
    }
    
    Student(string name,int sid) : Person(name){
        this->sid = sid;
    }
    
    void setSid(int sid){
        this->sid = sid;
    }
    
    int getSid(){
        return sid;
    } 
    
    void display(){
        Person::display();
        cout<<"Sid = "<<sid<<endl;
    }
    
    void details(){
        cout<<"My name is "<<getName()<<" and Im a Student "<<endl;
    }
    
};
class Doctor : public Person{
    private : 
    string Specialization;
    float charges;
    
    public:
    
    Doctor(){
        this->Specialization = "null";
        this->charges = 0;
    }
    
     Doctor(string name,string Specialization,float charges): Person(name){
        this->Specialization = Specialization;
        this->charges = charges;
    }
     ~Doctor(){}
     
     void setSpecialization(string s){
         this->Specialization=s;
     }
     string getSpecialization(){
         return Specialization;
         
     }
     
     void setCharges(float charges){
         this->charges = charges;
              }
     float getCharges(){
         return charges;
     }
     
     void display(){
         cout<<"Name : "<<Person::getName()<<" Specialization : "<<Specialization<<" Charges "<<charges<<endl;
     }
    
    
    void details(){
        cout<<"My name is "<<Person::getName()<<" and Im a Doctor and my Specialization is  : "<<getSpecialization()<<"and Visit Charges : "<<getCharges()<<endl;
    }
    
};



int main() {
    Person *p = new Student("A" , 1);
    Person *p2 = new Doctor("Doc1" , "Dentist" , 1000.00);
    
    
    p->display();
    p->details();
    p2->display();
    p2->details();
    
    delete p;
    delete p2;

    return 0;
}