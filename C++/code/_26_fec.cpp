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

 //fibo of 3 terms

 #include<iostream>
using namespace std;
int main(){

int t1 , t2 ,t3 ,nt,till;
t1 =0;
t2 =1;
t3 =1;
cout<<"enter range : ";
cin>>till;
cout<<" "<<t1<<" "<<t2<<" "<<t3; 
for(int i = 4 ; i<= till ; i++){

nt =t1+t2+t3;
cout << "  "<<nt;
t1=t2;
t2=t3;
t3=nt;

}
}

// enter range : 30
//  0 1 1  2  4  7  13  24  44  81  149  274  504  927  1705  3136  5768  10609  
// 19513  35890  66012  121415  223317  410744  755476  1389537  2555757  4700770  8646064  15902591


///




// Armstrong
#include<iostream>
using namespace std;

int main(){

    int num, rem, sum = 0, original;

    cout<<"Enter number to check Armstrong: ";
    cin>>num;

    original = num;   

    while(num > 0){
        rem = num % 10;
        sum = sum + (rem * rem * rem);
    

        num = num / 10;
    }

    if(sum == original)
        cout<<"Armstrong";
    else
        cout<<"Not Armstrong";

    return 0;
}

// LEAP YEAR

#include<iostream>
using namespace std;

int main(){

int year;
cout<<"Enter the year : ";
cin>>year;
if(year %100 !=0 ){
if (year%4== 0)
{
    cout<<"Leap year ";
}
else
cout<<"not a leap year";


}

    return 0;
}

//grade 
#include<iostream>
using namespace std;

int main()
{
    int m1,m2,m3,m4, total;
    float per;
    char grd;
    cout<<"\n Enter 4 subject marks : ";
    cin>>m1;  // 75
    cin>>m2;   //75
    cin>>m3;   //75
    cin>>m4;   //75
    total = m1 + m2 + m3 + m4;
    per = total / 4;
  /*  if(per >= 85)  grd = 'A';
    if((per < 85) && (per >= 70))  grd = 'B';
    if((per < 70) && (per >= 55))  grd = 'C';
    if((per < 55) && (per >= 40))  grd = 'D';
    if(per < 40)  grd = 'E';*/
    if(per>=85)  grd = 'A';
    else if(per >= 70)  grd = 'B';
    else if(per >= 55)  grd = 'C';
    else if(per >= 40)  grd = 'D';
    else  grd = 'E';
    cout<<"\n Total = "<<total<<" Percent = "<<per;
    cout<<"\n Grade = "<<grd;
    return 0;
}

// menu
#include<iostream>
using namespace std;
int main()
{
    int result=0, num1, num2, ch;

    do {
    result=0;
    cout<<"\n **Menu**";
    cout<<"\n1. Addition";
    cout<<"\n2. Subtraction";
    cout<<"\n3. Multiplication";
    cout<<"\n4. Division";
    cout<<"\n5. power num1^num2";
    cout<<"\n6. square";
    cout<<"\n7. cube";
    cout<<"\n8. Exit";
    cout<<"\n Enter Your Choice..(1..7)";
      
    cin>>ch;
    if((ch>=1) &&(ch<=4))
    {
        cout<<"\n Enter 2 numbers ";
        cin>>num1;
        cin>>num2;
    }
    else{
         cout<<"\n Enter a numbers ";
        cin>>num1;

    }
    switch(ch)
    {
        case 1 : result = num1+num2;
                 break;
        case 2 : result = num1-num2;
                 break;
        case 3 : result = num1*num2;
                 break;
        case 4 : result = num1/num2;
                 break;
        case 5 : result = num1^num2;
                 break;
        case 6 : result = num1*num1;
                 break;
        case 7 : result = num1*num1*num1;
                 break;
        case 8 : break;

        default : cout<<"\n Invalid Choice.. Enter (1..5)";
    }
    cout<<"\n Result = "<<result;
    }while(ch!=8);

    cout<<"\n\n Bye..";
    return 0;
}

//cafe menu 
#include <iostream>
using namespace std;

int main()
{
    int qty, total = 0, ch;

    do {
        cout << "\n========== CAFE MENU ==========\n";
        cout << "\n--- Tea Section ---";
        cout << "\n1. Tea                  15/-";
        cout << "\n2. Coffee               25/-";
        cout << "\n3. Masala Tea           20/-";

        cout << "\n\n--- Snacks Section ---";
        cout << "\n4. Vada Pav             17/-";
        cout << "\n5. Cream Roll           23/-";
        cout << "\n6. Samosa               18/-";
        cout << "\n7. Poha                 30/-";

        cout << "\n\n--- Cold Drinks ---";
        cout << "\n8. Water Bottle         20/-";
        cout << "\n9. Cold Coffee          40/-";
        cout << "\n10. Soft Drink          35/-";

        cout << "\n\n--- Sandwich ---";
        cout << "\n11. Veg Sandwich        45/-";
        cout << "\n12. Cheese Sandwich     55/-";

        cout << "\n13. Exit";
        cout << "\n\nEnter your choice (1..13): ";
        cin >> ch;

        if (ch >= 1 && ch <= 12)
        {
            cout << "Enter quantity: ";
            cin >> qty;

            if (qty <= 0)
            {
                cout << "Invalid quantity!\n";
                continue;
            }
        }

        switch (ch)
        {
            case 1: total += qty * 15; break;
            case 2: total += qty * 25; break;
            case 3: total += qty * 20; break;
            case 4: total += qty * 17; break;
            case 5: total += qty * 23; break;
            case 6: total += qty * 18; break;
            case 7: total += qty * 30; break;
            case 8: total += qty * 20; break;
            case 9: total += qty * 40; break;
            case 10: total += qty * 35; break;
            case 11: total += qty * 45; break;
            case 12: total += qty * 55; break;
            case 13: break;
            default: cout << "Invalid choice! Please select 1..13\n";
        }

    } while (ch != 13);

    cout << "\n\n========== BILL ==========\n";
    cout << "Total Bill Amount: " << total << "/-\n";
    cout << "Thank You! Visit Again.\n";

    return 0;
}

// even odd / + || -

#include<iostream>
using namespace std;
int main(){
int a;
cout<<"Enter a num : ";
cin>>a;

if(a%2 ==0 )
cout<<"\neven";
else
cout<<"\nodd";

if(a > 0)
cout<<"\npositive";
else
cout<<"\nnegitive";
}


// ASSIGNMENT QUESTIONS 
#include<iostream>
using namespace std;
int main(){
int i;
for(i=0;i<5;i++){
cout<<"\n hello";
}

}


#include<iostream>
using namespace std;
int main(){
int i;

for(i=1;i<=100;i++)
    cout<<"\t "<<i;
}

#include<iostream>
using namespace std;
int main(){
int num = 2;

for(int i=1;i<=10;i++)
    cout<<"\t"<<num*i;
}

// table with for loop
#include<iostream>
using namespace std;
void table(int);
int main(){

int i ;
 cout<<"Enter number to calculate table: "; 
    cin >> i ; 

    table(i);
return 0;

}

void table(int num){
int res;
    for(int a=1 ; a<=10 ;a++){
     res = num * a;
     cout<<""<<num<<"*"<<a<<"="<<"  "<<res<<"\n";
    }

}

//1 to 100
#include<iostream>
using namespace std;
void count();
int main(){

count();
    
return 0;

}

void count(){

    for(int a=1 ; a<=100 ;a++){

     cout<<a<<"\n";
    }

}

// fact
#include<iostream>
using namespace std;
void fact(int);
int main(){

int i ;
 cout<<"Enter number to calculate fact: "; 
    cin >> i ; 

    fact(i);
return 0;

}

void fact (int num){   
int res = 1;
    for(int a=num ; a>0 ;a--){
     res = res * a;
     
     cout<<"factorial = "<<res; ;  
    }
}

// square till 25
#include<iostream>
using namespace std;
void square(int);
int main(){

int i ;
 cout<<"square of numbers \n"; 
  i = 25;
    square(i);
return 0;

}

void square (int num){   
int res = 1;
    for(int a=0 ; a<=num;a++){
     res = a * a;
     cout<<"\n"<<res; 
     
     
    }
}

// even
#include<iostream>
using namespace std;
void even(int);
int main(){

int i ;
 cout<<"even of numbers till  200 \n"; 
  i = 200;
    even(i);
return 0;

}

void even (int num){   

    for(int a=0; a<=num;a++){
     if(a%2==0)
     cout<<"\n"<<a; 
     
    
          
    }
}

// odd
#include<iostream>
using namespace std;
void odd(int);
int main(){

int i ;
 cout<<"odd of numbers till  200 \n"; 
  i = 200;
    odd(i);
return 0;

}

void odd (int num){   
for(int a=0; a<=num;a++){
     if(a%2!=0)
     cout<<"\n"<<a;  
    }
}

//#include<iostream>
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
        total = total * a;
    }

    cout << "\tSum = " << total;
}