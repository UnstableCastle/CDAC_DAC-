#include<iostream>
using namespace std;


class Emp{

    private:

        int id;
        string name;
        int sal;

    public:

    Emp(){
        id = 0;
        name = "null";
        sal = 0;
    }
    
    Emp(int id , string name,int sal){
    
        this->id=id;
        this->name = name;
        this->sal = sal;
    
    }
    
    
    int getSal(){
        return sal;
    }
    
    
    

virtual ~Emp(){}

virtual void display(){
    
    cout<<"Name : "<<name<<" Id : "<<id;
}

virtual int cal_sal()=0;
    
};


class SDE : public Emp{
private:
    string lang;

public:

SDE(){
    lang = "XXX";
}

SDE(int id , string name,int sal,string Lang):Emp(id,name,sal){

    this->lang = Lang;

}
~SDE(){}

void setLang(string Lang){
    this->lang = Lang;
}

string getLang(){
    return lang;
}

int cal_sal(){
int total = getSal()*30;
return total;
}

void display(){
    Emp::display();
    cout<<" and I code in "<<getLang()<<" and my Salary is "<<cal_sal();
}


};

int main(){

    Emp *e[3]; 
    
e[0]= new SDE(1,"ABC",2500,"C++");
e[1]= new SDE(2,"XYZ",3200,"JAVA");
e[2]= new SDE(3,"PQE",2700,"PYTHON");

    for(int i = 0 ; i<=2;i++){
        e[i]->display();
        cout<<"\n";
    }

 for(int i = 0 ; i<=2;i++){
        delete e[i];
    }
   



}