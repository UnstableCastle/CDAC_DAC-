
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



#include <stdio.h>

int main() {

    int arr[5];
    int i;

    for (i = 0; i < 5; i++)
    {
        printf("Enter a number: ");
        scanf("%d", &arr[i]);
    }

    for (i = 0; i < 5; i++)
    {
        printf("\narr[%d] = %d", i, arr[i]);

        printf("\n*(arr + %d) = %d", i, *(arr + i));

        printf("\n%d[arr] = %d", i, i[arr]);

        printf("\n-------------------");
    }

    return 0;
}
// Enter a number: 1
// Enter a number: 2
// Enter a number: 3
// Enter a number: 4
// Enter a number: 5

// arr[0] = 1
// *(arr + 0) = 1
// 0[arr] = 1
// -------------------
// arr[1] = 2
// *(arr + 1) = 2
// 1[arr] = 2
// -------------------
// arr[2] = 3
// *(arr + 2) = 3
// 2[arr] = 3
// -------------------
// arr[3] = 4
// *(arr + 3) = 4
// 3[arr] = 4
// -------------------
// arr[4] = 5
// *(arr + 4) = 5
// 4[arr] = 5
// -------------------


// ARRAY with fun EXAMPLES
#include <stdio.h>
void dis_arr(int *ptr) ;
int main() {

    int arr[5];
    int i;
printf("Enter number to array: ");
    for (i = 0; i < 5; i++) {
        
        scanf("%d", &arr[i]);
    }

    printf("Base address of array = %p\n", arr);

    dis_arr(arr);  

    return 0;
}

void dis_arr(int *ptr) {

    int i;

    printf("\nFirst element using pointer = %d\n", *ptr);

    for (i = 0; i < 5; i++) {
        printf("ptr[%d] = %d\n", i, ptr[i]);
    }
}
// Enter number to array: 1 2 3 4 5
// Base address of array = 0061FF08

// First element using pointer = 1
// ptr[0] = 1
// ptr[1] = 2
// ptr[2] = 3
// ptr[3] = 4
// ptr[4] = 5

//........... 2D  ARRAYS

// DEMO FOR 2D ARRAY :
#include <stdio.h>

void dis_arr1(int arr[][3]);

int main()
{
    int arr[3][3], i, j;

    printf("Enter values for 3x3 array:\n");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    dis_arr(arr);

    return 0;
}

void dis_arr1(int arr[][3])
{
    int i, j;

    printf("\nMatrix elements are:\n");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}
// Enter values for 3x3 array:
// 1 2 3 4 5 6 7 8 9 

// Matrix elements are:
// 1 2 3 
// 4 5 6 
// 7 8 9 

//.........ADD 2 2D ARRAY
#include <stdio.h>

void display_arr(int arr[3][3]);
void accept_arr(int arr[3][3]);
int main()
{
    
int a[3][3],  b[3][3],  sum[3][3],i,j;

    accept_arr(a);
    accept_arr(b);
   for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            sum[i][j] = a[i][j] + b[i][j];
        }
    }

    display_arr(sum);

    return 0;
}

void display_arr(int arr[3][3])
{
    int i, j;

    printf("\n Sum of 2 2D array are:\n");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}

void accept_arr(int arr[3][3]){
int i, j;
    printf("Enter values for 3x3 array:\n");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
        scanf("%d", &arr[i][j]);
        }
    }

}
// Enter values for 3x3 array:
// 1 2 3 4 5 6 7 8 9
// Enter values for 3x3 array:
// 11 22 33 44 55 66 77 88 99

//  Sum of 2 2D array are:
// 12 24 36
// 48 60 72
// 84 96 108