#include<iostream>
#include <iomanip>
using namespace std;

int main(){
    for(int i = 1 ; i<=25;i++){
        int square = i*i;
        cout<<""<<endl;
       std::cout<<std::setw(10)<<std::setfill('*')<<square<<std::endl;
    }
}

