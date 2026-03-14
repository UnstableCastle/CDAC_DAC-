#include<iostream>
using namespace std;

// Q.1  Write a program to generate a following structure:
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@

// int main()
// {
//     for(int i = 0;i<6;i++)
//     {
//         for(int j = 0; j<6;j++)
//         {
//             cout<<"@";
//         }
//         cout<<"\n";
//     }
// }

// Q.2  Write a program to generate a following #'s triangle:
// #	#	#	#	#
// 	#	#	#	#
// 		#	#	#
// 			#	#
// 				#

// int main()
// {
//     int i,j;
//     for(i=0;i<6;i++)
//     {
//         // for(j=0;j<i;j++)
//         // {
//         //     cout<<" ";
//         // }
//         for(j=6;j>i;j--)
//         {
//             cout<<"#";
//         }
//         cout<<"\n";
//     }
// }

// Q.3  Write a program to generate a following @'s triangle:
//           @ @ @ @ @
//           @ @ @ @ 
//           @ @ @ 
//           @ @ 
//           @ 

// int main()
// {
//     int i,j;
//     for(i=0;i<6;i++)
//     {
//         // for(j=0;j<i;j++)
//         // {
//         //     cout<<" ";
//         // }
//         for(j=6;j>i;j--)
//         {
//             cout<<"@";
//         }
//         cout<<"\n";
//     }
// }


// Q.4  Write a program to generate a following #'s triangle:-       
// #				
// #	#			
// #	#	#		
// #	#	#	#	
// #	#	#	#	# 

// int main()
// {
//     int i,j;
//     for(i=0;i<6;i++)
//     {
//         // for(j=0;j<i;j++)
//         // {
//         //     cout<<" ";
//         // }
//         for(j=0;j<i;j++)
//         {
//             cout<<"#";
//         }
//         cout<<"\n";
//     }
// }

// Q.5  Write a program to generate a following @'s triangle:                                 
// 				@
// 			@	@
// 		@	@	@
// 	@	@	@	@
// @	@	@	@	@

// int main()
// {
//     int i,j;
//     for(i=0;i<6;i++)
//     {
//         for(j=6;j>i;j--)
//         {
//             cout<<" ";
//         }
//         for(j=0;j<i;j++)
//         {
//             cout<<"@";
//         }
//         cout<<"\n";
//     }
// }


// Q.6  Write a program to generate a following numbers structure:
//           12345
//           12345
//           12345
//           12345
//           12345

// int main()
// {
//     int i, j;

//     for(i = 1;i<6;i++)
//     {
//         for(j = 1;j<6;j++)
//         {
//             cout<<j;
//         }
//         cout<<"\n";
//     }
// }

// Q.7  Write a program to generate a following numbers structure:
//           54321
//           54321
//           54321
//           54321
//           54321

// int main()
// {
//     int i,j;
//     for(i = 0; i<=5;i++)
//     {
//         for(j=5;j>0;j--)
//         {
//             cout<<j;
//         }
//         cout<<"\n";
//     }
// }

// Q.8  Write a program to generate a following numbers structure:
//           55555
//           44444
//           33333
//           22222
//           11111

// int main()
// {
//     int i,j;
//     for(i = 5; i>=1;i--)
//     {
//         for(j = 5;j>1;j--)
//         {
//             cout<<i;
//         }
//         cout<<"\n";
//     }
// }

// Q.9  Write a program to generate a following numbers structure:
//           11111
//           22222
//           33333
//           44444
//           55555

// int main()
// {
//     int i,j;
//     for(i = 1; i<6;i++)
//     {
//         for(j = 1;j<5;j++)
//         {
//             cout<<i;
//         }
//         cout<<"\n";
//     }
// }

// Q.10  Write a program to generate a following numbers structure:
//           1
//           12
//           123
//           1234
//           12345

// int main()
// {
//     int i,j;
//     for(i = 0; i<=6;i++)
//     {
//         for(j = 1;j<i;j++)
//         {
//             cout<<j;
//         }
//         cout<<"\n";
//     }
// }


// Q.11  Write a program to generate a following numbers structure:
//           12345
//           1234
//           123
//           12
//           1

// int main()
// {
//     int i,j;
//     for(i = 6; i>=0;i--)
//     {
//         for(j = 1;j<i;j++)
//         {
//             cout<<j;
//         }
//         cout<<"\n";
//     }
// }


// Q.12  Write a program to generate a following numbers structure:
    // 				1
    // 			1	2
    // 		1	2	3
    // 	1	2	3	4
// 1	2	3	4	5


// int main()
// {
//     int i,j;
//     for(i = 0;i<=5;i++)
//     {
//         for(j = 5;j>=i;j--)
//         {
//             cout<<" ";
//         }
//         for(j = 1;j<=i;j++)
//         {
//             cout<<j;
//         }
//         cout<<"\n";
//     }
// }

// Q.13  Write a program to generate a following numbers structure:
//           54321
//           4321
//           321
//           21
//           1


// Q.17  Write a program to generate a following numbers structure:
    // 				1				
    // 			1	2	1			
    // 		1	2	3	2	1		
    // 	1	2	3	4	3	2	1	
// 1	2	3	4	5	4	3	2	1

int main()
{
    int i,j,n;
    n=5;
    for(i=1;i<=n;i++)
    {
        for(j = 1;j<=n-i;j++)
        {
            cout<<"  ";
        }

        for(j=1;j<=i;j++)
        {
            cout<<j<<" ";
        }
        
        for(j = i-1;j>=1;j--)
        {
            cout<<j<<" ";
        }

        cout<<endl;
    }
}













