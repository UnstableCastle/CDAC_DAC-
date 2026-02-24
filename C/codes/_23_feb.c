//67
#include<stdio.h>
int main(){

int i =1 , j = 3 , k=6;

while(1){
if(i=j || k < 0);
    break;

i++;
j--;
k = k-2;

}
printf("%d -i , %d - j , %d - k",i,j,k); // 1 - i , 3 - j , 6 - k
return 0;
}

//68

#include<stdio.h>
int main(){

int i ;

}

// Nested Loops

#include <stdio.h>
int main(){

int i ,j ; 
for ( i = 0; i <=j; i++) //......outer loop ......ROWS...VALUES CHANGES
{
    for (j = 0; j <=3; j++) //....inner loop......COLS...SAME VALUES
        {
    
    
printf("\n i = %d  j = %d",i,j);

        }
 printf("\n j = %d",j);   
}

return 0;

}


//CHECK PRIME NO 
#include <stdio.h>

int main() {

    int num, i, count = 0;

    printf("Enter number: ");
    scanf("%d", &num);

    if (num <= 1) {
        printf("Not Prime");
        return 0;
    }

    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            count = 1;
            break;
        }
    }

    if (count == 0)
        printf("Prime");
    else
        printf("Not Prime");

    return 0;
}

//Print prime 
#include <stdio.h>

int main() {

    int n, m, i, num, count;

    printf("Enter the range: ");
    scanf("%d %d", &n, &m);

    printf("Prime numbers between %d and %d are:\n", n, m);

    for (num = n; num <= m; num++)
    {
        if (num <= 1)
            continue;

        count = 0;

        for (i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                count = 1;
                break;
            }
        }

        if (count == 0)
            printf("%d ", num);
    }

    return 0;
}


// perfect numbers  
#include <stdio.h>

int main() {

int i ,num , sum = 0;

printf("Enter the number : ");
scanf("%d ", &num);

for ( i =  1 ; i < num ; i++)
{
if (num % i == 0)
{
    sum = sum + 1;
}
if (num == sum)
{
    printf("%d is a perfect number",num);
}
else
    printf("%d is NOT a perfect number",num);

       
}

return 0 ;

}

// PATTERNS : 

#include<stdio.h>
int main(){

for(int i=1;i<=5;i++ ){


    for(int j=1;j<=5;j++){
        printf("1");

    }
    printf("\n");

}

}
// output:
// 11111
// 11111
// 11111
// 11111
// 11111


#include<stdio.h>
int main(){

for(int i=1;i<=5;i++ ){


    for(int j=1;j<=5;j++){
        printf("*");

    }
    printf("\n");

}

}
// output:
// *****
// *****
// *****
// *****
// *****


#include <stdio.h>

int main() {

    int i, j;
    int spnt = 4;

    for (i = 1; i <= 5; i++) {

        // Print spaces
        for (j = 1; j <= spnt; j++) {
            printf(" ");
        }

        // Print stars
        for (j = 1; j <= i; j++) {
            printf("*");
        }

        printf("\n");

        spnt--;   // decrease after each row
    }

    return 0;
}
//     *
//    **
//   ***
//  ****
// *****
 
// 78  ...AREA AND VOLUME OF CUBOID 


#include<stdio.h>

int main(){

    float l ,w ,  h, area , volume;
printf("Enetr values  for Height , width , length");
scanf("%f %f %f",&h,&w,&l);
if (h>0 && w>0 && l>0){

    area = 2*(w*l + w*h + h*l);

    volume = l*h*w;
    printf("area = %f    volume = %f ", area,volume);
}
else
printf("enter valid data");


}

// function 
#include <stdio.h>

int fun (void ); 

int main(){
int x = 10;
x = fun();
printf("%d \n ",x);
}

fun(){
    print("function");
}


// sum via function

#include <stdio.h>
int sum(int,int);

int main(){

    int n1,n2,res;
    printf("Enter value for n1 and n2");
    scanf("%d %d",&n1 ,&n2);
    res = sum (n1,n2);
    printf("result  = %d , res ");
    return 0 ;

}

int sum(int a, int b){

int r;
r = a+b;
return r;
}


// POINTERS  
#include<stdio.h>
int main(){
int i = 10 ;
int * ptr ;
 printf(" \n value of n1 = %d",i);
 printf("\n value of ptr = %d",*ptr);
 return 0 ;

}

// //

#include<stdio.h>
int main(){

    int i ; 
    int * ptr = (int * )malloc(sizeof(int)*5);

    for  (i = 0; i <=5; i++)
    {
        *ptr = i;
        printf("Value at ptr = %d \n",*ptr);
        ptr = ptr + 1;
    }
    return 0 ;

}


//

#include<stdio.h>
int main(){

    int i ; 
    int * ptr = (int * )malloc(sizeof(int)*5);

    for  (i = 0; i <=5000000; i++)
    {
        *ptr = i;
        printf("Value at ptr = %d \n",*ptr);
        ptr = ptr + 1;
    }
    return 0 ;



}