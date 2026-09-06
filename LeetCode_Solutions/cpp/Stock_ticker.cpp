#include<iostream>
#include<unordered_map>
using namespace std;    
int main(){
    unordered_map<string,double> stock;
    stock["AAPL"] = 100;
    stock["TSLA"] = 200;

    cout << "Stock AAPL" << stock["AAPL"] << endl;
return 0;
}
