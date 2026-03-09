// inheritance 

// single level

#include <iostream>
using namespace std;

class BASE{
protected:
int i ;  //data member

public:
//member functions
BASE(){ //  def con
    
    cout<<"BASE default constructor \n";

    i =0;
}

BASE(int n){
// para con 

cout<<" BASE para con \n";
i = n;

}

~BASE(){
    
    cout<<" BASE des";
}
virtual void display(){

    cout<<"i = "<<i<<"\n";
 }


};

class Derived : public BASE{ //inheritance
protected:
int j ;

public: 
Derived(){

    cout<<"derived...default \n";
    j = 0;
}

Derived(int m,int n ): BASE(n) {
    cout<<"para constructor \n";
    j = m;
}

~Derived(){
    cout<<"derived des \n";

}

void display(){
 cout<<"i = "<<i<<"\n";
 cout<<"j = "<<j<<"\n";


}

};

int main(){

Derived obj(10,20);
obj.display();
return 0 ;


}