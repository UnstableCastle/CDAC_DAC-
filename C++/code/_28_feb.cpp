//3d array
#include<iostream>
using namespace std;
int main(){
    int arr[2][3][2] = {{{1,2},{2,3},{3,4}},{{4,5},{5,6},{6,7}}};
    int i,j,k;

    cout<<"\n base address = "<<arr;
    for( i =0; i < 2 ;i++){
       cout<<"\narr["<<i<<"] = "<<arr[i];
       for(j = 0;j<3;j++){
        cout<<"\narr["<<i<<"] ["<<j<<"] = "<<arr[i][j];
        for(k=0;k<2;k++){
        cout<<"\narr["<<i<<"]["<<j<<"]["<<k<<"] = "<<arr[i][j][k];

  
        }
       }
    }
return 0;
}


//

//swap
#include<iostream>
using namespace std;
void swap_byValue(int,int);
void swap_byAddress(int* , int *);
void swap_byRef(int,int);
int main(){

    int num1 ,num2;
    cout<<"Enter the value for NUM1 : ";
    cin>>num1;
    cout<<"Enter the value for NUM2 : ";
    cin>>num2;

    cout<<" Num 1 = "<<num1 << "Num 2 = "<<num2;

    swap_byValue(num2,num2);
    swap_byAddress(&num1,&num2 );
    swap_byRef(num1,num2);   
    return 0;
}

void swap_byValue(int a,int b){
    int temp;
    a = b;
    b=
}


