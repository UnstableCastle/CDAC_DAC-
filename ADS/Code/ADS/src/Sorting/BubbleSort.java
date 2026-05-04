package Sorting;

public class BubbleSort {
	public static void bubble_Sort(int arr[]) {

		int i, j, t, flag;

		for (i = arr.length - 1; i >= 0; i--)  {
			flag = 0;

			 for (j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1]) {

					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

					flag = 1;
				}
			}

			if (flag == 0)
				break;
		}
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 13, 4, 5, 6, 7, 8, };
		System.out.println("Before Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

		bubble_Sort(arr);

		System.out.println("After Sorting : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}

	}

}
