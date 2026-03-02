// STRING FUNCTIONS

// STRING FUNCTIONS
#include<iostream>
using namespace std;

int mystrlen(char*); 
char* mystrcpy(char*,char*);
char* mystrcat(char*,char*);
int mystrcmp(char*,char*);
int main(){

    char S1[50] = "Hello";
    char S2[50] = "Computer";

    cout<<"S1 = "<<S1<<endl;
    cout<<"S2 = "<<S2<<endl;

    cout<<"Length of S1 = "<<mystrlen(S1)<<endl;
    cout<<"Length of S2 = "<<mystrlen(S2)<<endl;

    mystrcpy(S1,S2);
    cout<<"After Copy S1 = "<<S1<<endl;

    mystrcat(S1,S2);
    cout<<"After Concat S1 = "<<S1<<endl;

    cout<<" "<<mystrcmp(S1,S2); 

}

int mystrlen(char* s){
    int l = 0;
    while(s[l] != '\0'){
        l++;
    }
    return l;
}

char* mystrcpy(char* a, char* b){
    char* t = a;
    while((*a++ = *b++) != '\0');
    return t;
}

char* mystrcat(char* a, char* b){
    char* t = a;

    while(*a != '\0'){   
        a++;
    }

    while((*a++ = *b++) != '\0');
    return t;
}

int mystrcmp(char*dest,char*sou){
while(*dest = '\0' && *sou!='\0'){
    if (*dest != *sou)
    return *dest-*sou;
}
return *dest-*sou;

}