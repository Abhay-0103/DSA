package _7_Array_and_ArrayList;

import java.util.Arrays;

public class _6_Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 23, 45};
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
