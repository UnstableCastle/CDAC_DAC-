package for_DSA;


public class Sort_Quick {
	public static int partition(int arr[],int low,int high)
	{
		int left,right,pivot,t;
		left=low; right = high; pivot=arr[low];
		while(left <= right)
		{
			while((arr[left]<=pivot)  &&  (left<high))  
			   left++;
			
			while(arr[right] > pivot)
				right--;
			
			if(left < right)
			{
				t=arr[left]; arr[left] = arr[right]; arr[right]=t;
				left++ ; right--;
			}
			else left++;
			
		}
		arr[low] = arr[right];
		arr[right] = pivot;
		return right;
	}

	
	public static void QuickSort(int arr[],int low,int high)
	{
		int pivloc;
		if(low >= high) return;
		System.out.println("high = "+high);
		pivloc = partition(arr,low,high);
		QuickSort(arr,low,pivloc-1);
		QuickSort(arr,pivloc+1,high);
	}
	
	
	public static void Bubble_sort(int arr[],int n)
	{
	  int i,j,t;
	  int flag = 0;

	  for(i=0;i<=n;i++)
	  {
	    flag=0;
	    for(j=0;j<n-i;j++)
	    {
	     if(arr[j] > arr[j+1])
	     {
	       flag=1;
	       t=arr[j];
	       arr[j] = arr[j+1];
	       arr[j+1] = t;
	     }
	    }
	    if(flag==0)
	       break;
	    
	   
	  }
	}

	
	
	public static void main(String[] args) {
		int arr[]={48,44,19,59,72,80,42,65,82,8,95,68};
		//Bubble_sort(arr, arr.length-1);
		QuickSort(arr,0,arr.length-1);
		   for(int i=0;i<arr.length;i++)
			   System.out.println("  "+arr[i]);
	}


}
