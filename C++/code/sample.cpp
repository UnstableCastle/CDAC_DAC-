#include <iostream>
using namespace std;

class values {
    int x, y;

public:

    void set_values(int d, int m) {
        this->x = d;
        this->y = m;
    cout<<"\n";    
        cout<<"address 0f x \n"<<&x;
        cout<<"\n";
           cout<<"address 0f Y \n"<<&y;
    }

    void display() {
        cout << "Values = X" << this->x << "\tY = "<< this->y;
    }
};

int main() {
    values d1;
    d1.set_values(1, 12);
    cout<<"address 0f d1 \n"<<&d1;
    cout<<"\n";
 
    cout<<"\n";
    d1.display();
}