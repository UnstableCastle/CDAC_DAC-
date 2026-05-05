package Sorting;

public class mergeSort {

	public static void merge_v2(int tar[], int arr[], int low1, int high1, int low2, int high2) {
		int i = low1;
		int j = low2;
		int k = low1;

		while ((i <= high1) && (j <= high2)) {
			if (arr[i] < arr[j]) {
				tar[k++] = arr[i++];
			} else if (arr[j] < arr[i]) {
				tar[k++] = arr[j++];
			} else {
				tar[k++] = arr[i++];
				j++;
			}
		}

		while (i <= high1) {
			tar[k++] = arr[i++];
		}

		while (j <= high2) {
			tar[k++] = arr[j++];
		}
	}

	public static void merge_Sort(int arr[], int low, int high) {
		int mid;
		int temp[] = new int[arr.length];
		if (low < high) {
			mid = (low + high) / 2;
			merge_Sort(arr, low, mid);
			merge_Sort(arr, mid + 1, high);
			merge_v2(temp, arr, low, mid, mid + 1, high);
			copy(arr, temp, low, high);
		}

	}

	private static void copy(int[] arr, int[] temp, int low, int high) {
		int i;
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];

		}

	}

	public static void main(String[] args) {
		int arr[] = { 31, 23, 32, 45, 25, 76, 53 };

		merge_Sort(arr, 0, arr.length-1);
		
		for (int i : arr) {
			System.out.println(""+i);
		}
		
	}
	
}
