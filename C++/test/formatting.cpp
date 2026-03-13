#include <iostream>
#include <iomanip>
#include <string>
using namespace std;
int main(){  /////////////////////////// GET LINE 

char line[20];

cout<<"enter a line :  ";
cin.getline(line,20);
cout<<""<<line;
return 0 ;
char c;
    cout <<"enter char  ";
    cin.get(c);
    cout<<" "<<c<<endl;
    std::cout << std::setw(10) << std::setfill('*') <<"hellloooo "<< std::endl;
    return 0;

}
