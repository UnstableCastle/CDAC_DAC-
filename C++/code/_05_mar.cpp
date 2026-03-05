#include<iostream>
using namespace std;

int sum(int,int);
int sum(int ,int ,int);
float sum (int, float);
float sum (float,int);
float sum (float, float);
float sum (float,float,float);

int main(){


sum(1,2);
sum(1,2),3;
sum(1,2.00002f);
sum(1.00001f,2);
sum(11.11f,22.22f);
sum(1,2);


}


int sum(int a, int b){

    return a+b;
}

int sum(int a, int b, int c){

    return a+b+c;

}

float sum(int a , float b){
return (float) a +b;

}

float sum (float a ,int b){
    {
return (float) a +b;

}
}
float sum (int a , float b)
{
return (float) a +b;

}
float sum (int a , float b,float c ){

     return a+b+c;

}




