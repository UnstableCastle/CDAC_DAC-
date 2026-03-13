#include <iostream>
using namespace std;


void fun( int num )
{
if( num <= 0 )
throw num;
else
throw 'p';
cout<<"num = "<<num<<endl;
}
//Throwing an Exception from function and using multiple catch

int main ()
{
try {
fun( 99 );
}
catch(int excNum ) {
cout<<"exception generated: "<<excNum<<endl;
}
catch(char ch) {
cout<<"char exception generated: "<<ch;
}
return 0;
}