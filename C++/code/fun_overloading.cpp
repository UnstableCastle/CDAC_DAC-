#include<iostream>
using namespace std;

int sum(int,int);
int sum(int,int,int);
float sum(int,float);
float sum(float,int);
float sum(float,float);
float sum(float,float,float);

int main(){

    cout<<sum(1,2)<<endl;
    cout<<sum(1,2,3)<<endl;
    cout<<sum(1,2.00002f)<<endl;
    cout<<sum(1.00001f,2)<<endl;
    cout<<sum(11.11f,22.22f)<<endl;
    cout<<sum(1.1f,2.2f,3.3f)<<endl;

}

int sum(int a, int b){
    return a+b;
}

int sum(int a, int b, int c){
    return a+b+c;
}

float sum(int a , float b){
    return a + b;
}

float sum(float a ,int b){
    return a + b;
}

float sum(float a , float b){
    return a + b;
}

float sum(float a , float b,float c ){
    return a + b + c;
}