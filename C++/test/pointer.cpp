#include <iostream>

using namespace std;

int main(){

int var =  50;
int *ptr ;
ptr = new int;
*ptr = 30;

cout<<"var "<<var<<endl;
cout<<"var add "<<&var<<endl;

cout<<"ptr " <<*ptr<<endl;;
cout<<"ptr add " <<&ptr<<endl;;




}
