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
