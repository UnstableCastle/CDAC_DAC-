#include<iostream>
#include<unordered_map>
using namespace std;
int main(){
    
    unordered_map<int,double> account;
    account[101] = 5000.00;
    account[102] = 250.00;

    cout<<"101 balance = "<<account[101]<<endl;
return 0 ;
}
