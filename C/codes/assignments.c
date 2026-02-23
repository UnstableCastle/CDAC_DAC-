//..........22/02/2026
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


///...sum of digits
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

}

//... Count num of digits
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
