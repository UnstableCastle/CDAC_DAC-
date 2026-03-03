#include<iostream>
using namespace std;

void left_shift(int *, int);
void right_shift(int *, int);
void left_rotate(int *, int);
void right_rotate(int *, int);
void insert_ele(int *, int,int,int);
void delete_ele(int *, int,int);
int sum(int *, int);
float avg(int *,int);
int search_ele(int *, int,int);
void disp(int *,int);

int main()
{
   int arr[10]={10,20,30,40,50,60,70,80,90,100};
   int pos,key,ch;

   do
   {
       cout<<"\n***Menu***";
       cout<<"\n1. Left Shift";
       cout<<"\n2. Right Shift";
       cout<<"\n3. Left Rotate";
       cout<<"\n4. Right Rotate";
       cout<<"\n5. Insert";
       cout<<"\n6. Delete";
       cout<<"\n7. Search";
       cout<<"\n8. Sum";
       cout<<"\n9. Average";
       cout<<"\n10. Display Array";
       cout<<"\n11. Exit";
       cout<<"\nEnter your choice (1..11): ";
       cin>>ch;

       switch(ch)
       {
           case 1: left_shift(arr,10); disp(arr,10); break;
           case 2: right_shift(arr,10); disp(arr,10); break;
           case 3: left_rotate(arr,10); disp(arr,10); break;
           case 4: right_rotate(arr,10); disp(arr,10); break;

           case 5:
               cout<<"\nEnter position: ";
               cin>>pos;
               cout<<"Enter element to insert: ";
               cin>>key;
               insert_ele(arr,10,pos,key);
               disp(arr,10);
               break;

           case 6:
               cout<<"\nEnter position: ";
               cin>>pos;
               delete_ele(arr,10,pos);
               disp(arr,10);
               break;

           case 7:
               cout<<"\nEnter value to search: ";
               cin>>key;
               cout<<"Found at position: "<<search_ele(arr,10,key);
               break;

           case 8:
               cout<<"\nSum = "<<sum(arr,10);
               break;

           case 9:
               cout<<"\nAverage = "<<avg(arr,10);
               break;

           case 10:
               disp(arr,10);
               break;

           case 11:
               break;

           default:
               cout<<"\nWrong choice!";
       }

   }while(ch!=11);

   cout<<"\nThe End..\n";
   return 0;
}

void left_shift(int *a, int n)
{
    for(int i=0;i<n-1;i++)
        a[i]=a[i+1];
    a[n-1]=0;
}

void right_shift(int *a, int n)
{
    for(int i=n-1;i>0;i--)
        a[i]=a[i-1];
    a[0]=0;
}

void left_rotate(int *a, int n)
{
    int temp=a[0];
    for(int i=0;i<n-1;i++)
        a[i]=a[i+1];
    a[n-1]=temp;
}

void right_rotate(int *a, int n)
{
    int temp=a[n-1];
    for(int i=n-1;i>0;i--)
        a[i]=a[i-1];
    a[0]=temp;
}

void insert_ele(int *a, int n,int pos,int ele)
{
    if(pos<1 || pos>n)
    {
        cout<<"\nInvalid Position!";
        return;
    }

    for(int i=n-1;i>=pos;i--)
        a[i]=a[i-1];

    a[pos-1]=ele;
}

void delete_ele(int *a, int n,int pos)
{
    if(pos<1 || pos>n)
    {
        cout<<"\nInvalid Position!";
        return;
    }

    for(int i=pos-1;i<n-1;i++)
        a[i]=a[i+1];

    a[n-1]=0;
}

int sum(int *a, int n)
{
   int s=0;
   for(int i=0;i<n;i++)
       s+=a[i];
   return s;
}

float avg(int *a,int n)
{
    return (float)sum(a,n)/n;
}

int search_ele(int *a, int n,int key)
{
    for(int i=0;i<n;i++)
        if(a[i]==key)
            return i+1;
    return -1;
}

void disp(int *a,int n)
{
    cout<<"\nArray: ";
    for(int i=0;i<n;i++)
        cout<<" "<<a[i];
}


// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 1

// Array:  20 30 40 50 60 70 80 90 100 0
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 2

// Array:  0 20 30 40 50 60 70 80 90 100
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 3

// Array:  20 30 40 50 60 70 80 90 100 0
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 4

// Array:  0 20 30 40 50 60 70 80 90 100
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 5

// Enter position: 5
// Enter element to insert: 34

// Array:  0 20 30 40 34 50 60 70 80 90
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 6

// Enter position: 5

// Array:  0 20 30 40 50 60 70 80 90 0
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 7

// Enter value to search: 43
// Found at position: -1
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 8

// Sum = 440
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 9

// Average = 44
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 10

// Array:  0 20 30 40 50 60 70 80 90 0
// ***Menu***
// 1. Left Shift
// 2. Right Shift
// 3. Left Rotate
// 4. Right Rotate
// 5. Insert
// 6. Delete
// 7. Search
// 8. Sum
// 9. Average
// 10. Display Array
// 11. Exit
// Enter your choice (1..11): 11

// The End..