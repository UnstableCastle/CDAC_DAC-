//..........25-02-26

//Assignments #1:
// demo codes

#include<iostream>
using namespace std;

int main()
{
	// const int j;  error: uninitialized const j

	const int i = 9;

	int num1 = 4;
    //	i = 20;      error: assignment of read-only variable i

    constexpr int j = 4 * 5;  // work fine, j is read only

    cout<<"\n j = "<<j;  // work fine

    constexpr int num2 = 4 * j + i; 
    cout<<"\n num2 = "<<num2;

	return 0;
}
// j = 20
// num2 = 89

//  2. Write a small program to demonstrate const and constexpr for calculating
//      area of a circle.

#include <iostream>
using namespace std;
int main(){

    const int r = 15;

    printf("Value of constant r = %d",r);

    constexpr int area = (int) 3.14*r*r;

printf("Area of the circle = %d",area);

}

/*Program to find out the size and limits of data types*/


#include<iostream>
#include<climits>
#include<cfloat>
using namespace std;
int main()
{
	cout<<"\nsizeof(char) = "<<sizeof(char);
	cout<<"\nsizeof(short) = "<<sizeof(short);
	cout<<"\nsizeof(int) = "<<sizeof(int);
	cout<<"\nsizeof(long) = "<<sizeof(long);
	cout<<"\nsizeof(float) = "<<sizeof(float);
	cout<<"\nsizeof(double) = "<<sizeof(double);
	cout<<"\nsizeof(long double) = "<<sizeof(long double);

	cout<<"\nSCHAR_MIN = "<<SCHAR_MIN;
	cout<<"\nSCHAR_MAX = "<<SCHAR_MAX;
	cout<<"\nUCHAR_MAX = "<<UCHAR_MAX;
	cout<<"\nSHRT_MIN = "<<SHRT_MIN;
	cout<<"\nSHRT_MAX = "<<SHRT_MAX;
	cout<<"\nUSHRT_MAX = "<<USHRT_MAX;
		
	cout<<"\nINT_MIN = "<<INT_MIN;
	cout<<"\nINT_MAX = "<<INT_MAX;
	cout<<"\nUINT_MAX = "<<UINT_MAX;
	
	cout<<"\nLONG_MIN = "<<LONG_MIN;
    cout<<"\nLONG_MAX = "<<LONG_MAX;
    cout<<"\nULONG_MAX = "<<ULONG_MAX;
    
	cout<<"\nFLT_MIN = "<<FLT_MIN;
	cout<<"\nFLT_MAX = "<<FLT_MAX;

	cout<<"\nDBL_MIN = "<<DBL_MIN;
	cout<<"\nDBL_MAX = "<<DBL_MAX;

	cout<<"\nLDBL_MIN = "<<LDBL_MIN;
	cout<<"\nLDBL_MAX = "<<LDBL_MAX;

	/*Number of digits of precision*/
	cout<<"\nFLT_DIG = "<<FLT_DIG;
	cout<<"\nDBL_DIG = "<<DBL_DIG;
	cout<<"\nLDBL_DIG = "<<LDBL_DIG;
	return 0;
}


// sizeof(int) = 4
// sizeof(long) = 4
// sizeof(float) = 4
// sizeof(double) = 8       
// sizeof(long double) = 16
// SCHAR_MIN = -128
// SCHAR_MAX = 127
// UCHAR_MAX = 255
// SHRT_MIN = -32768
// SHRT_MAX = 32767
// USHRT_MAX = 65535          
// INT_MIN = -2147483648
// INT_MAX = 2147483647
// UINT_MAX = 4294967295
// LONG_MIN = -2147483648
// LONG_MAX = 2147483647
// ULONG_MAX = 4294967295
// FLT_MIN = 1.175494e-038
// FLT_MAX = 3.402823e+038
// DBL_MIN = 2.225074e-308
// DBL_MAX = 1.797693e+308
// LDBL_MIN = 3.205284e-317
// LDBL_MAX = 3.205284e-317
// FLT_DIG = 6
// DBL_DIG = 15
// LDBL_DIG = 18


//String demo

// A Word is said to be Magic Word if it satisfies following properties

//        i. The word has at least six characters.
//       ii. The word has even number of characters.
//      iii. The word has first letter 'Z' or 'z'.
//       iv. The word has last and First letter same.
//        v. The word has two halves which are same.

//      Write a program to take a word from user and print the total number of
//      properties the word satisfies.

#include<iostream>
#include<string>
using namespace std;
int main(){


int count = 0;
string word;

cout<<"Enter a Word : ";
cin >> word;

int len = word.length();

// 1 length > 6
if(len >= 6)
count++;

//2 word has even no of char
if(len%2 ==0)
count++;

// 3  word has first letter 'Z' or 'z'
if(word[0] == 'Z' || word[0]=='z')
    count++;

// 4 first and last letter same
if(word[0] == word[len-1])
count++;

//5 The word has two halves which are same.

if(len % 2 ==0 ){
    string firsthalf = word.substr(0,len/2);
    string secondhalf = word.substr(len/2 , len/2);

    if(firsthalf == secondhalf){
        count++;
    }
}
  cout << "Total properties satisfied = " << count << endl;
if(count == 5){
    printf("Word is a Magic word");
}

    return 0;
}

//zabzab : count 4

// operator 

// #include<iostream>
// using namespace std;
// int main()
// {
//     unsigned short a = 5, b = 9, result; // a = 5(00000101), b = 9(00001001)
//     cout<<"\na = "<<a <<" b = "<< b;
//     result = a & b;
//     cout<<"\n a & b = "<< result; // The result is 00000001
//     result = a | b;
//     cout<<"\n a | b = "<< result;  // The result is 00001101
//     result = a ^ b;
//     cout<<"\n a ^ b = "<< result; // The result is 00001100
//     result = ~a;
//     cout<<"\n ~a = "<< result;   // The result is 11111010
//     result = b << 1;
//     cout<<"\n b<<1 = "<< result;  // The result is 00010010
//     result = b >> 1;
//     cout<<"\n b>>1 = "<< result;  // The result is 00000100
//     return 0;
// }

// a = 5 b = 9
//  a & b = 1
//  a | b = 13
//  a ^ b = 12
//  ~a = 65530
//  b<<1 = 18
//  b>>1 = 4




 //1. Observe output of following codes :
// #include<iostream>
// using namespace std;
// int main()
// {
// 	int x=8;
// 	cout<<" x= "<<x;
// 	cout<<" x= "<<x++;	//postfix increment
// 	cout<<" x= "<<x;
// 	cout<<" x= "<<x--;	//postfix decrement
// 	cout<<" x= "<<x;

// 	cout<<"\n x= "<<x;
// 	cout<<" x= "<<++x;	//prefix increment
// 	cout<<" x= "<<x;
// 	cout<<" x= "<<--x;	//prefix decrement
// 	cout<<" x= "<<x;
// 	return 0;
// }

//  x= 8 x= 8 x= 9 x= 9 x= 8
//  x= 8 x= 9 x= 9 x= 8 x= 8



// 2. Observe output and play with the code.

//   #include<iostream>
// using namespace std;
// int main()
// {
//     int a,b,c,d,e,f,g,h,k;
// 	a=8, b=4, c=2, d=1, e=5, f=20;
// 	cout<<"\t"<< a+b-(c+d)*3%e+f/9;

// 	a=17, b=5, c=6, d=3, e=5;
// 	cout<<"\t"<<a%6-b/2+(c*d-5)/e;

// 	a=4, b=5, c=6, d=3, e=5, f=10;
// 	cout<<"\t"<<a*b-c/d;

// 	a=8, b=5, c=8, d=3, e=65, f=10, g=2, h=5, k=2;
// 	cout<<"\t"<<(a-b+c/d);
// 	int r1 = a-b+c/d ;
// 	int r2 = (e/f-g+h%k);
//     cout<<"\t"<<(r1 == r2);  //remove (   ) and check
// 	a=8, b=3, c=2, d=3, e=2, f=11;
// 	cout<<"\n"<<a-b||(a-b*c)+d&&e-f%3;
// 	return 0;
// }

//         10      5       18      5       1
// 5

// 3.

// #include<iostream>
// using namespace std;
// int main(void)
// {
// 	int a=9,b=15,c=16,d=12,e,f;
// 	e = !(a<b || b<c);
// 	f = (a>b) ? a-b: b-a;
// 	cout<<" e = "<<e <<" f = "<< f;
// 	return 0;
// }

//  e = 0 f = 6




// 4.

// #include<iostream>
// using namespace std;
// int main(void)
// {
//     int x,y,z,k=10;
//     k+=(x=5, y=x+2, z=x+y);
// 	cout<<"\n x = "<<x <<" y = "<< y <<" z = "<<z<< " k = "<<k;
//     return 0;
// }


//  x = 5 y = 7 z = 12 k = 22

// escape sequence
#include<iostream>
using namespace std;

int main()
{
   cout<<"\a";
   cout<<"Hello\bBackSpace";
   cout<<"\n new line";
   cout<<"\n tab\tkey";
   cout<<"\n return \r key";
   cout<<"\n form \f feed"<<endl;
   cout<<"\\ backslash...";
   cout<<"\? question mark";

   return 0;
}

/*output

HellBackSpace
 new line
 tab    key
 keyurn
 form
 feed
\ backslash...? question mark

*/
