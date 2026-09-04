#include<iostream>
#include<string>
#include<vector>

using namespace std;

int main(){

vector<double> transaction = {150.50,200,120,130,450,3000};

transaction.push_back(500.00);
cout<<"total transaction = "<<transaction.size()<< "\n " << endl;

for(int i = 0; i<transaction.size();i++ ){
if(transaction[i]>100){
cout<<transaction[i]<<"\n"<<endl;
} 
}
}

