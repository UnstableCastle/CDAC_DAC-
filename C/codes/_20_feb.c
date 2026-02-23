// 1
#include <stdio.h>

int main () /// - entry point of function
{


printf (" Mella World"); // statements 

return 0; //Sucessful Execution

} //end of block

//Keywords :- int, return, include 
// .c exe file 


//2
#include <stdio.h>
int main (){
printf("infoway\r \b");
printf("\n INFOWAY \r \n pune ");
return 0;
}

//3
#include<stdio.h>
int main(void) {
    int a = 15;
printf (" a = %d \t",a); // 15
printf (" a = %o \t",a); //17
printf (" a = %x \t",a); //f
printf (" a = %X \t",a); // F

}


// no value assigned OS will give garbage value
// for os no value is garbage

//4
#include<stdio.h>
int main(void) {

    int a = 4000000000;
    unsigned int b = 4000000000; // unsigned always gives positive value

    printf("a = %d  , b = %d \n",a,b );

    printf("%d , %u \n",__INT_MAX__,__UINTMAX_MAX__);
    return 0;
}