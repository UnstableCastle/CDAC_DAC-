#include<iostream>

using namespace std;
 class outer{

    int o;
public: 
outer(){
 o = 1;

 }
 void display(){
    cout<<"outer o = "<<o<<endl;
 }

class inner{
int i;
    public:

inner(){

    i = 90;
    cout<<"inner i  = "<<i<<endl;

}
void display(){
    // cout<<"outer o = "<<o<<endl;
     cout<<"inner i  = "<<i<<endl;
 }


};


 };

 int main(){

{
outer o;
outer::inner obj;
obj.display();
return 0;

 }
}