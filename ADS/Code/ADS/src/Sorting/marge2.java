package Sorting;

import java.util.Arrays;

public class marge2 {

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

	public static void main(String[] args) {
		int arr[] = { 31, 23, 32, 45, 25, 76, 53 };
		int arr2[] = { 30, 20, 12, 55, 15, 65, 13 };

		Arrays.sort(arr);
		Arrays.sort(arr2);

		int merged[] = new int[arr.length + arr2.length];

		int combined[] = new int[arr.length + arr2.length];

		System.arraycopy(arr, 0, combined, 0, arr.length);
		System.arraycopy(arr2, 0, combined, arr.length, arr2.length);

		merge_v2(merged, combined, 0, arr.length - 1, arr.length, combined.length - 1);

		for (int x : merged) {
			System.out.print(x + " ");
		}
	}
}