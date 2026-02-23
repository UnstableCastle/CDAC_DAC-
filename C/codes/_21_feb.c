//5

#include <stdio.h>

int main (void) {

char ch;
printf("Enter a character: ");

scanf("%c", &ch);
printf ("%d \n", ch); // printS ASCII value of 1st Char

return 0;
}
// ASCII :Uppercase (A-Z): 65–90
// Lowercase (a-z): 97–122
// Digits (0-9): 48–57
// Space: 32
// Special Characters: ! (33), @ (64), # (35), $ (36)

//6
#include <stdio.h>

int main (void) {

float b = 32.1265f;
printf("%f \t",b);
printf("%.2f \t",b);
printf("%.3f \t",b);
printf("%5.2f \t",b);
printf("%6.2f \t",b);
return 0;
}


//7
#include <stdio.h>

int main (void) {
char c;
int a = 98 ;
printf("%c ,  %d \n",a, c);
}


//8
#include <stdio.h>

int main (void) {
printf("%s","INDIA");
printf("%10s","INDIA");
printf("%5s","INDIA");
printf("%s","INDIA");
printf("%10s","INDIA");
}

//11
#include <stdio.h>

int main (void) {
int a = -3;
a = -a -a + !a; // = 6
printf("%d \n",a);
}




//12

#include <stdio.h>

int main (void) {

    int a = 2 , b = 1 , c, d;

    c = a < b;
    d = (a>b)&&(c<d);
    printf("%d = c , %d = d", c,d);
    
}


//13

#include <stdio.h>

int main (void) {

int a = 9 ,  b = 15, c ,e,f;

e = !(a>b || b<c );

f = (a>b) ? a-b : b-a;


}



//14

#include <stdio.h>

int main (void) {
int a = 5;
a = a + 5*a;
printf("%d = a",a);
}


//16

#include <stdio.h>

int main (void) {

int x , y, z;

//..   x = 8++; // error
//..   y = ++x++; // error
z = (x+y);

}


//17
 #include <stdio.h>

int main (void) {
int a = 4 , b = 8 , c = 3 , d = 9 , z;

z = a ++ + ++b + c-- - --d;
printf("%d = z", z);

}


//20 


#include <stdio.h>

int main (void) {
int x , y ,z, k=10;

k += (x=5,y=x+2,z=x+y);

printf("%d = k", k);

}


//21

#include <stdio.h>

int main (void) {
float b;
b = 15/2;
printf("%f  = b\t",b);

b = (float)15/2 + 15/2;
printf("%f  = b ....with typecasting\t",b);

}


// 23


#include <stdio.h>

int main (void) {

int a = 9 , ch = "A" ; 

a = a + ch + 24 ; // = 9 + 65 + 24 = 98 ....ASCII

printf("%d ,  %c  , %d , %c",ch,ch,a,a);
}

//26

#include <stdio.h>

int main (void) {
 int a = 5 , b = 6;
 printf("%d\n",a=b);
  printf("%d \n",a==b);
   printf("a= %d , b =  %d",a,b);
}



//27
#include <stdio.h>

int main (void) {

    int a = 3 , b = 4 , c = 3 ,d = 4 ;
    
    int x  = (a=5) && (b=7); // x = 1 as non zero values

    int y = (c == 6 ) || (d =10);
    
    
}


//28 
#include <stdio.h>

int main (void) {

    int a = 10 ;
    a = a++ ;
    a = a++ * a-- ; //UNDEFINED ANSWER
    printf("%d ",a);


}


//29

#include <stdio.h>

int main (void) {

int x = 4*(3*2+3);

int y = 4*(5+3);

printf("x = %d",x);
printf("y = %d",y);

}



//30
#include <stdio.h>

int main (void) {

float TempC,TempF;
printf("Enter temp in C");
scanf("%f",&TempC);

TempF = (TempC * 9/5)+32 ; 

printf("Temp in Fahrenheit = %f",TempF);

return 0;

}

//if else

//36

#include <stdio.h>

int main (void) {

    int a = 9;
    if(a=5)
        printf("%d = a",a );
    else
        printf("%d = a",a );
}

//37

#include <stdio.h>

int main (void) {

    int a = 0;
    if(a=0)
    printf("a is not zero");
    else
    printf("a is zero");

    printf("%d = a ",a);

    return 0;


}


// switchcase : 

//  switch (expression) {
//     case constant1:
//         // Code to be executed if expression == constant1
//         break;
//     case constant2:
//         // Code to be executed if expression == constant2
//         break;
//     ...
//     default:
//         // Code to be executed if none of the cases match
// }

//50 .....similar
#include <stdio.h>

int main() {
    int number;
    printf("Enter a number (10, 50, or 100): ");
    scanf("%d", &number);

    if (number == 10) {
        printf("Number is 10\n");
    } else if (number == 50) {
        printf("Number is 50\n");
    } else if (number == 100) {
        printf("Number is 100\n");
    } else {
        printf("Number is not 10, 50, or 100\n");
    }

    return 0;
}
 // ======In SWITCH =====
 #include <stdio.h>

int main() {
    int number;
    printf("Enter a number (10, 50, or 100): ");
    scanf("%d", &number);

    switch (number) {
        case 10:
            printf("Number is 10\n");
            break;
        case 50:
            printf("Number is 50\n");
            break;
        case 100:
            printf("Number is 100\n");
            break;
        default:
            printf("Number is not 10, 50, or 100\n");
    }

    return 0;
}


//51 
#include <stdio.h>

int main(void) {
int a , b;
while (-1)          //....infinite loop
{
    printf("test loop");
}
}

//for loop

// assignments 

// find largest no from 10 numbers
#include <stdio.h>
#include <limits.h>

int main(void) {

    int i, num, largest;
    
    largest = INT_MIN;

    printf("Enter 10 numbers:\n");

    for (i = 0; i < 10; i++)   // runs 10 times
    {
        scanf("%d", &num);

        if (num > largest) {
            largest = num;
        }
    }

    printf("Largest number = %d\n", largest);

    return 0;
}

//...sum of digits
#include <stdio.h>
int main(void) {

int a=0,num,rem,sum=0;

printf("enter a number : ");
scanf("%d",&num);
a= num;
while (num>0)
{
    rem = num % 10;
    sum = sum + num;
    num = num / 10;

}

printf("SUM of each digit of %d = %d",a ,sum);
return 0 ;
}


// Count num of digits
#include <stdio.h>
int main(void) {

int a=0,num,rem,count=0;

printf("enter a number : ");
scanf("%d",&num);
a= num;
while (num>0)
{
    rem = num % 10;
    count ++;
    num = num / 10;

}

printf("no of digit in %d = %d",a ,count);
return 0;
}


// reverse a number 
#include <stdio.h>

int main(void) {

    int a = 0, num, rev = 0, rem;

    printf("Enter a number: ");
    scanf("%d", &num);

    a = num;

    while (num > 0)
    {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }

    printf("Reverse of %d = %d\n", a, rev);

    return 0;
}

//palindrome ....

#include <stdio.h>

int main(void) {

    int original, num, rev = 0, rem;

    printf("Enter a number: ");
    scanf("%d", &num);

    original = num;

    while (num > 0)
    {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }

    if (original == rev)
        printf("%d is a Palindrome number\n", original);
    else
        printf("%d is NOT a Palindrome number\n", original);

    return 0;
}


//Fibonacci Series

#include <stdio.h>

int main() {

    int t1 = 0, t2 = 1, t3, n, i;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci Series: ");

    if (n >= 1)
        printf("%d ", t1);

    if (n >= 2)
        printf("%d ", t2);

    for (i = 3; i <= n; i++)
    {
        t3 = t1 + t2;
        printf("%d ", t3);
        t1 = t2;
        t2 = t3;
    }

    return 0;
}
