#include<iostream>
using namespace std;

class myMatrix{
int **mat;
int row,col;

public:

myMatrix(){
cout<<"\nDefault Constructor \n";
row = col = 3;

mat = new int*[row];
for(int i=0;i<row;i++)
    mat[i] = new int[col];
}

myMatrix(int n){
cout<<"\nParameterized Constructor";
row = col = n;
mat = new int*[row];
for(int i=0;i<row;i++)
    mat[i] = new int[col];
}

myMatrix(int n ,int m){
cout<<"\n2 Parameter Constructor";

row = n;
col = m;

mat = new int*[row];
for(int i=0;i<row;i++)
    mat[i] = new int[col];
}

~myMatrix(){
cout<<"\nDestructor";

for(int i =0; i< row ; i++)
    delete []mat[i];

delete []mat;
}

myMatrix(const myMatrix &m){
cout<<"\nCopy Constructor";

row = m.row;
col = m.col;

mat = new int*[row];

for(int i = 0; i<row;i++)
    mat[i] = new int[col];

for(int i =0;i<row;i++ )
    for(int j =0;j<col;j++)
        mat[i][j] = m.mat[i][j];
}

const myMatrix &operator=(const myMatrix &m){

cout<<"\nAssignment Operator";

for(int i =0; i< row ; i++)
    delete []mat[i];

delete []mat;

row = m.row;
col = m.col;

mat = new int*[row];

for(int i = 0; i<row;i++)
    mat[i] = new int[col];

for(int i =0;i<row;i++ )
    for(int j =0;j<col;j++)
        mat[i][j] = m.mat[i][j];

return *this;
}

void accept_matrix_value(){

for(int i = 0;i<row;i++)
    for(int j = 0;j<col;j++)
    {
        cout<<"Enter value : ";
        cin>>mat[i][j];
    }
}

void display(){

cout<<"\nMatrix : \n";

for(int i=0 ; i<row;i++){
    for(int j =0; j<col;j++)
        cout<<" "<<mat[i][j];

    cout<<"\n";
}
}

};

int main(){

myMatrix m1 ,m2(2,2);

m1.accept_matrix_value();
m1.display();

m2.accept_matrix_value();

myMatrix m3(m2);
m3.display();

return 0;
}


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
        cout << "Values OF  X " << this->x << "\t AND Y = "<< this->y;
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