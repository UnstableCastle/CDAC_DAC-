package Sorting;

import java.util.Arrays;

public class merge {
    public static void merge_v1(int tar[], int arr[], int arr2[]) {
        int i = 0, j = 0, k = 0;

        while ((i < arr.length) && (j < arr2.length)) {
            if (arr[i] < arr2[j]) {
                tar[k++] = arr[i++];
            } else if (arr[i] > arr2[j]) {
                tar[k++] = arr2[j++];
            } else {
                tar[k++] = arr[i++];
                j++;
            }
        }

        while (i < arr.length) {
            tar[k++] = arr[i++];
        }

        while (j < arr2.length) {
            tar[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {

        int arr[] = {31, 23, 32, 45, 25, 76, 53};
        int arr2[] = {30, 20, 12, 55, 15, 65, 13};


        Arrays.sort(arr);
        Arrays.sort(arr2);

        int tar[] = new int[arr.length + arr2.length];

        merge_v1(tar, arr, arr2);

        for (int i = 0; i < tar.length; i++) {
            System.out.println(tar[i]);
        }
    }
}
