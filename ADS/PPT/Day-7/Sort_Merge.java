package for_DSA;

public class Sort_Merge {


public static void merge_Ver2(int []arr,int []tar,int low1,int high1, int low2, int high2)
{
  int i,j,k;
  i=low1;
  j=low2;
  k=low1;
  
  while((i<=high1)&&(j<=high2))
  {
    if(arr[i] < arr[j])
      {
         tar[k] = arr[i];
         i++;
         k++;
      }
      else if(arr[j] < arr[i])
      {
          tar[k] = arr[j];
          j++;
          k++;
      }
      else 
      {
         tar[k] = arr[i];
         i++;  j++;  k++;
      }
   }

   while(i<=high1)
   {
      tar[k] = arr[i];
      i++; k++;
   }
   while(j<=high2)
   {
      tar[k]=arr[j];
      j++; k++;
   }
}

public static void mergeSort(int arr[],int low, int high)
{
   int mid;
   int []temp=new int[arr.length];

   if(low < high)
   {
      mid = (low + high)/2;
      mergeSort(arr, low, mid);  //sort arr[low:mid]
      mergeSort(arr, mid+1, high); //sort arr[mid+1:high]

      merge_Ver2(arr, temp, low, mid, mid+1, high);
      copy(arr,temp,low,high);
   }
}

public static void copy(int arr[],int temp[],int low, int high)
{
   int i;
   for(i=low; i<=high;i++)
       arr[i]=temp[i];
}

	public static void main(String[] args) {
		int arr[]={12,6,70,77,80,80,6,7,2,3};
		   mergeSort(arr, 0, arr.length-1);

		   for(int i=0;i<arr.length;i++)
			   System.out.println("  "+arr[i]);
	}

}
