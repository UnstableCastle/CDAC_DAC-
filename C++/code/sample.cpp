#include<iostream>
using namespace std;
void sum(int);
int main(){

int i ;
 cout<<"sum of numbers till  200 \n"; 
  i = 200;
    sum(i);
return 0;

}

void sum(int num)
{
    int total = 0;

    for(int a = 1; a <= num; a++)
    {
        total = total + a;
    }

    cout << "\tSum = " << total;
}