// day 2 
//  grade 
#include<iostream>
using namespace std;

int main(){

    int m1 ,m2,m3,m4,total;
    float per;
    char grd;
    cout<<"\nEnter 4 subject : ";
    cin>>m1;
    cin>>m2;
    cin>>m3;
    cin>>m4;

    total = m1 + m2 + m3 + m4 ;
    per =  total / 4;


    if(per>= 85) grd = 'A';
    else if(per>= 70) grd = 'B';
    else if(per>= 55) grd = 'C';
    else if(per>= 40) grd = 'D';
    else grd = 'F';

   cout<<" TOTAL "<<total<<" PERS = "<< per << " GRADE " <<grd; 

   return 0 ;

}


// sum of square
#include <iostream>
using namespace std;
int main(){

int i , sum = 0 ; 

for(i  = 1 ; i <= 25 ; i++ ){

   sum = sum + i*i;
}

cout<<"Sum of Square  = "<<sum ;
   
}

//Sum of Square  =5525

// min of 15 
#include <iostream>
#include <climits>

using namespace std;
int main(){

int i , num ,min ; 

min = __INT_MAX__;
cout << " enter number " ; 
for(i  = 1 ; i <= 15 ; i++ ){
cin >> num;
if(num<min ) min = num;
}
cout<<"  \n min of 15 numbers "<<min ;
   
}

// enter number 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
  
 //min of 15 numbers 1