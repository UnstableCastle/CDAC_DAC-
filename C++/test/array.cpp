// #include <iostream>

// using namespace std;

// int main(){


// int arr[5];

// for (int i=0;i<5;i++){
//     cout<<"\nEnter number..";
//     cin>>arr[i];

// }

// cout<<"array elements : ";

// for (int i=0;i<5;i++){
//     cout<<"\nEnter number..";
//     cout<<arr[i];

// }

// }

// #include <iostream>

// using namespace std;

// int main(){


// int arr[5];
// int sum = 0;
// int avg = 0;
// for (int i=0;i<5;i++){
//     cout<<"\nEnter number..";
//     cin>>arr[i];

// }

// cout<<"sum of elements : ";

// for (int i=0;i<5;i++){
//     sum = sum+arr[i];
    

// }
// cout<<"    "<<sum<<endl;
// avg = sum/5 ; 
// cout<<"average of elements  =     "<<avg<<endl;



// }


#include <iostream>

using namespace std;

int main(){


int arr[5];
int max = 1;
for (int i=0;i<5;i++){
    cout<<"\nEnter number..";
    cin>>arr[i];

}

cout<<"array elements : ";

for (int i=0;i<5;i++){
    cout<<"\nEnter number..";
    if(arr[i]>max)
      if(arr[i] > max){
            max = arr[i];
}

}
cout<<"MAX = "<<max;
}

