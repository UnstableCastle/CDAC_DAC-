package Sorting;

public class SelectionSort {

	private static void selection_Sort(int[] arr) {
		int i, j, min, t;

		for (i = 0; i < arr.length; i++) {
			min = i;

			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				
			}

		
				t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
			}
			
		}

	
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 13, 4, 5, 6, 7, 8, };
		System.out.println("Before Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

		selection_Sort(arr);

		System.out.println("After Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

	}

}
