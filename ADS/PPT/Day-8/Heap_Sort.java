package for_DSA;
public class Heap_Sort {

 public static void heapify(int arr[], int n, int i)
 {
  int t, largest = i;
  int left = 2*i + 1;
  int right = 2*i + 2;

  if(left < n  && arr[left] > arr[largest])
       largest = left;
  

  if(right < n   &&  arr[right] > arr[largest])
        largest = right;

  if( i != largest)
  {
      t=arr[i]; 
      arr[i] = arr[largest];
      arr[largest] = t;
      heapify(arr,n,largest);
  }//end of of
}//end of function

public static void HeapSort(int arr[])
{
    int n = arr.length;
    int temp;
   for(int i = n/2 - 1; i>=0 ; i--) 
    heapify(arr,n,i);   

   // heap sort
     System.out.println(arr[0]);
 for(int i = n-1; i>=0 ;i--)
 {
   temp = arr[0];
   arr[0] = arr[i];
   arr[i] = temp;

   heapify(arr, i  ,0);
   
 }
}

	public static void main(String[] args) {
		int arr[] = {48,34,67,89,12,333,44,32,2,89,78,90};

		HeapSort(arr);

	    for(int i=0;i<arr.length;i++)
	       System.out.print("  " + arr[i]);

	}

}
