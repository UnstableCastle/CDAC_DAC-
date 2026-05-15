#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ofstream fout("abc.txt");

    fout<< " hello world"<<endl;
    fout<<100<<endl;
    fout<<'A'<<endl;
    for(int i = 0 ; i<=4;i++){
        fout<<"C++ Programming"<<endl;
    }
cout<<"data written"<<endl;
    fout.close();
    return 0 ;
}