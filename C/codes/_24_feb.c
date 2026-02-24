
// call by address call by value 


#include <stdio.h>
void cal(int ,int ,int*,int*,int*);
int main(){

    int n1,n2,add,sub,mul;
    printf("enter the value for n1 : ");
    scanf("%d",&n1);

    printf("enter the value for n2 : ");

    scanf("%d",&n2);

    cal(n1 , n2,&add,&sub,&mul);

    printf ("add = %d\n",add);
     printf ("sub = %d\n",sub);
      printf ("mul = %d\n",mul);

      return 0 ; 
      
}

void cal(int a,int b ,int*add,int*sub,int*mul){
*add = a + b ;
*sub = a - b ;
*mul = a * b ; 

}

// ARRAYS



