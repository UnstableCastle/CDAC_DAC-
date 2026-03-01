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
// 1 d array