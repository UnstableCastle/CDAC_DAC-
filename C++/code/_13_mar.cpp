#include<iostream>
using namespace std;

// int main(){
// int i ;
// cout<<"enter a num :  ";
// cin >>i ;
// cout<<"num  i =  "<<i;


// }

// int main(){  /////////////////////////// GET LINE 

// char line[20];

// cout<<"enter a line :  ";
// cin.getline(line,20);
// cout<<""<<line;
// return 0 ;

// }

// int main(){   ///       get char
// char c;
//     cout <<"enter char  ";
//     cin.get(c);
//     cout<<" "<<c<<endl;
// }



//................FILE..................................

#include<fstream>

// int main()
// {

//     ofstream file1;
//     file1.open("test.txt");
//     file1<<"hello world yooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"<<endl;
//     file1.close();
//     cout<<"data in the file ";



// }

// #include<fstream>
// int main(){
// ifstream file1;
// char ch;

// file1.open("test.txt");

// while(!file1.eof()){

// file1.get(ch);
// cout<<ch;
// }
// }


#include<fstream>    ///.......................seekG................................................
int main(){
ifstream file1;
char ch;

file1.open("test.txt");
file1.seekg(14,ios::beg);
while(!file1.eof()){

file1.get(ch);
cout<<ch;
}
}



