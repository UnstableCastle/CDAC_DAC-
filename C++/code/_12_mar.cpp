#include <iostream>
#include <string>
using namespace std;


class Hospital{
protected:
string Hospital_name;
string city;

public:
  Hospital() {
        hospName = "Unassigned";
        city = "Unassigned";
    }


  Hospital(string h , string c ) {
        hospName = "Unassigned";
        city = "Unassigned";
    }
void accept_hospital(){
    cout<<"enter Hospital Name : "<<endl;
        cin>>Hospital_name;
    cout<<"enter Hospital City  : "<<endl;
        cin>>City;    

}



};



class Doctor public:Hospital{
protected:
int docID;
int free[3];
float avg_fee

public:
Doctor(){
    cout<"default constructor"<<endl;


}

Doctor(int i ,arr[] , float v){
  cout<"para constructor"<<endl;
    docID = i;
     avg_fee = v; 
     for(int i =0 ; i<3;i++){
        fee[i] = arr[i];
     }
    
}

~Doctor(){
  cout<"destructor"<<endl;
}

void display_doctor(){//getter
cout<<"Doctor Details : "<<endl;
cout<<"Doctor ID  : "docID<<endl;
cout<<"Average fees : "avg_fee<<endl;
   for(int i=0;i<3;i++){
            cout<<fees[i]<<" ";
        }
        cout<<endl;



}

void accept_doctor(){ //setter
    cout<<"enter info of doctor  :"<<endl;
    cout<<"enter ID : "<<endl;
    cin>>this->docID;
    cout<<"Average fees : "avg_fee<<endl;
for(int i =0 ; i<3;i++){
        cout<<"fee  : "<<i+1<<"  :   "<<endl;
    cin>>fee[i]; 
    }
      
}
void Total_Bill(){
    display_doctor();
    int sum = 0;
for(int i = 0  ; i< 3; i++){
    sum = sum + fee[i];
}
cout<<"total bill : =  "<<avg_fee<<endl;
}





};


int main(){


int a[2] = {10,20};

Hospital d1(12,a,65.20);
D2.set_Doctor();
D2.accept_doctor();
D2.display_doctor();
D2.Total_Bill();

return 0;






}