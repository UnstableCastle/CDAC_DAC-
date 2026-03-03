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
   int i,pos,key,ch;
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
       cout<<"\n Enter your choice (1..10)";
       cin>>ch;
       switch(ch)
       {
           case 1: left_shift(arr,10); break;
           case 2: right_shift(arr,10); break;
           case 3: left_rotate(arr,10); break;
           case 4: right_rotate(arr,10); break;
           case 5: cout<<"\n Enter position :";
                   cin>>pos;
                   cout<<"\n Enter element to insert :";
                   cin>>key;
                   insert_ele(arr,10,pos,key); break;
           case 6: cout<<"\n Enter position :";
                   cin>>pos;
                   delete_ele(arr,10,pos); break;
           case 7:
                   cout<<"\n Enter value to search ";
                   cin>> key;
                   cout<<"\n Found at "<<search_ele(arr,10,key); break;
           case 8: cout<<"\n sum = "<<sum(arr,10); break;
           case 9: cout<<"\n Avg = "<<avg(arr,10); break;
           case 10: disp(arr,10); break;
           case 11: break;
           default: cout<<"\n Wrong choice..";
       }
   }while(ch!=11);
   cout<<"\n The End..";
   return 0;
}


void left_shift(int *a, int n)
{
    int i;
    for(i=0 ;i<n-1 ;i++)
         a[i] = a[i+1];

    a[i] = 0;
}

void right_shift(int *a, int n)
{
    int i;
    for(i=n-1 ; i>0 ;i--)
        a[i] = a[i-1];

    a[i] = 0;
}
void left_rotate(int *a, int n)
{
    int i, temp = a[0];
    for(i=0;i<n-1;i++)
        a[i] = a[i+1];

    a[i]=temp;
}
void right_rotate(int *a, int n)
{
    int i, temp = a[n-1];
    for(i=n-1 ; i>0 ;i--)
        a[i] = a[i-1];

    a[i] = temp;
}
void insert_ele(int *a, int n,int pos,int ele)
{
    int i;
    for(i=n-1 ; i>=pos ;i++)
        a[i] = a[i-1];
    a[i]=ele;
}
void delete_ele(int *a, int n,int pos)
{
    int i;
    for(i=pos-1 ;i<n-1 ;i++)
         a[i] = a[i+1];

    a[i] = 0;
}

int sum(int *a, int n)
{
   int i, sum = 0;
   for(i=0 ;i<n ;i++)
         sum = sum + a[i];

   return sum;
}

float avg(int *a,int n)
{
    int s = sum(a,n);
    float av = (float)s/n;
    return av;
}

int search_ele(int *a, int n,int key)
{
    int i, pos = -1;
    for(i=0 ;i<n ; i++)
    {
        if(a[i] == key)
            pos = i+1;
    }

    return pos;
}

void disp(int *a,int n)
{
    int i;
    cout<<"\n Array : ";
    for(i=0 ; i<n ;i++)
        cout<<"  "<<a[i];
}
