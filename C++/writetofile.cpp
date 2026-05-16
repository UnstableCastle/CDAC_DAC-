#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ofstream fo("abc.txt");

    fo<< " hello world"<<endl;
    fo<<100<<endl;
    fo<<'A'<<endl;
    for(int i = 0 ; i<=4;i++){
        fo<<"C++ Programming"<<endl;
    }
cout<<"data written"<<endl;
    fo.close();
    return 0 ;
}