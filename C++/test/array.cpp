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


// #include <iostream>

// using namespace std;

// int main(){


// int arr[5];
// int max = 1;
// for (int i=0;i<5;i++){
//     cout<<"\nEnter number..";
//     cin>>arr[i];

// }

// cout<<"array elements : ";

// for (int i=0;i<5;i++){
//     cout<<"\nEnter number..";
//     if(arr[i]>max)
//       if(arr[i] > max){
//             max = arr[i];
// }

// }
// cout<<"MAX = "<<max;
// }

// #include <iostream>
// using namespace std;

// int main(){

//     int arr[5];

//     for (int i = 0; i < 5; i++){
//         cout << "Enter number: ";
//         cin >> arr[i];
//     }

//     cout << "\nOriginal array:\n";
//     for (int i = 0; i < 5; i++){
//         cout << arr[i] << " ";
//     }

//     // LEFT SHIFT
//     cout << "\n\nLeft shift array:\n";
//     for (int i = 0; i < 4; i++){
//         arr[i] = arr[i+1];
//     }

//     for (int i = 0; i < 4; i++){
//         cout << arr[i] << " ";
//     }

//     // RIGHT SHIFT
//     cout << "\n\nRight shift array:\n";

//     for (int i = 4; i > 0; i--){
//         arr[i] = arr[i-1];
//     }

//     for (int i = 0; i < 5; i++){
//         cout << arr[i] << " ";
//     }

//     return 0;
// }


// #include <iostream>
// using namespace std;

// int main(){

//     int arr[10], n, pos, val;

//     cout<<"Enter number of elements: ";
//     cin>>n;

//     for(int i=0;i<n;i++){
//         cout<<"Enter element: ";
//         cin>>arr[i];
//     }

//     cout<<"Enter position to insert: ";
//     cin>>pos;

//     cout<<"Enter value: ";
//     cin>>val;

//     for(int i=n;i>=pos;i--){
//         arr[i] = arr[i-1];
//     }

//     arr[pos-1] = val;
//     n++;

//     cout<<"\nArray after insertion:\n";

//     for(int i=0;i<n;i++){
//         cout<<arr[i]<<" ";
//     }

//     return 0;
// }

// #include <iostream>
// using namespace std;

// int main(){

//     int arr[10], n, pos;

//     cout<<"Enter number of elements: ";
//     cin>>n;

//     for(int i=0;i<n;i++){
//         cout<<"Enter element: ";
//         cin>>arr[i];
//     }

//     cout<<"Enter position to delete: ";
//     cin>>pos;

//     for(int i=pos-1;i<n-1;i++){
//         arr[i] = arr[i+1];
//     }

//     n--;

//     cout<<"\nArray after deletion:\n";

//     for(int i=0;i<n;i++){
//         cout<<arr[i]<<" ";
//     }

//     return 0;
// }
