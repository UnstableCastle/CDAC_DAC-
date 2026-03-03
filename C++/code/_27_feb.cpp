// menu driven
#include<iostream>
using namespace std;

bool isEven(int);
bool isPrime(int);
bool isDigit(char);
int isVowel(char);
int isPositive(int);

int main()
{
    int choice, num;
    char ch;

    do {
        cout << "\n";
        cout << "\n1. isEven";
        cout << "\n2. isPrime";
        cout << "\n3. isDigit";
        cout << "\n4. isVowel";
        cout << "\n5. isPositive";
        cout << "\n6. Exit";
        cout << "\nEnter your choice: ";
        cin >> choice;

        if(choice == 1 || choice == 2 || choice == 5)
        {
            cout << "Enter number: ";
            cin >> num;
        }

        if(choice == 3 || choice == 4)
        {
            cout << "Enter character: ";
            cin >> ch;
        }

        switch(choice)
        {
            case 1:
                if(isEven(num))
                    cout << "Even";
                else
                    cout << "Odd";
                break;

            case 2:
                if(isPrime(num))
                    cout << "Prime";
                else
                    cout << "Not Prime";
                break;

            case 3:
                if(isDigit(ch))
                    cout << "Digit";
                else
                    cout << "Not Digit";
                break;

            case 4:
                if(isVowel(ch))
                    cout << "Vowel";
                else
                    cout << "Not Vowel";
                break;

            case 5:
                if(isPositive(num))
                    cout << "Positive Number";
                else
                    cout << "Not Positive";
                break;

            case 6:
                cout << "Exiting...";
                break;

            default:
                cout << "Invalid Choice!";
        }

    } while(choice != 6);

    cout << "\nThe End..";
    return 0;
}

bool isEven(int n)
{
    return (n % 2 == 0);
}

bool isPrime(int n)
{
    if(n <= 1)
        return false;

    for(int i = 2; i < n; i++)
    {
        if(n % i == 0)
            return false;
    }
    return true;
}

bool isDigit(char c)
{
    return (c >= '0' && c <= '9');
}

int isVowel(char c)
{
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
       c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        return 1;
    else
        return 0;
}

int isPositive(int n)
{
    return (n > 0);
}


//#include<iostream>
using namespace std;

int main()
{
    int var = 50;
    int *ptr = &var;

    cout << "\n var = " << var;
    cout << "\n Address of var = " << &var;
    cout << "\n ptr = " << ptr;
    cout << "\n Value at ptr = " << *ptr;
    cout << "\n Address of ptr = " << &ptr;

    return 0;
}

//dynamic memory alloc
// and operations#include<iostream>
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


//Implement power function:
//    pow(x, n) → calculate x^n
#include<iostream>
using namespace std;

int power(int x, int n)
{
    int result = 1;
    for(int i = 1; i <= n; i++)
        result *= x;
    return result;
}

int main()
{
    int x, n;
    cout<<"Enter base and power: ";
    cin>>x>>n;

    cout<<"Power = "<<power(x,n);

    return 0;
}

// Write function:
//    int max_of_four(int a, int b, int c, int d)
#include<iostream>
using namespace std;

int max_of_four(int a, int b, int c, int d)
{
    int max = a;

    if(b > max) max = b;
    if(c > max) max = c;
    if(d > max) max = d;

    return max;
}

int main()
{
    int a,b,c,d;
    cout<<"Enter four numbers: ";
    cin>>a>>b>>c>>d;

    cout<<"Maximum = "<<max_of_four(a,b,c,d);

    return 0;
}

//Special Number:
//    A number is special if
//    sum of digits % 4 == 0
#include<iostream>
using namespace std;

bool isSpecial(int num)
{
    int sum = 0;

    while(num > 0)
    {
        sum += num % 10;
        num /= 10;
    }

    return (sum % 4 == 0);
}

int main()
{
    int num;
    cout<<"Enter number: ";
    cin>>num;

    if(isSpecial(num))
        cout<<"Number is Special";
    else
        cout<<"Number is Not Special";

    return 0;
}//