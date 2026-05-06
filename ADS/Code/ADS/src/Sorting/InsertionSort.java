package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 13, 4, 5, 6, 7, 8, };
		System.out.println("Before Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

		insertion_Sort(arr);

		System.out.println("After Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

	}

	private static void insertion_Sort(int[] arr) {
		int i, j, k;
		for (i = 1; i < arr.length; i++) {
			k = arr[i];
			for (j = i - 1; j >= 0 && k < arr[j]; j--)
				arr[j + 1] = arr[j];
			arr[j + 1] = k;
		}
	}
}