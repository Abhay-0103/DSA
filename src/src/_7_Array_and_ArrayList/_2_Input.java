package _7_Array_and_ArrayList;

import java.util.Scanner;

public class _2_Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 23;
        arr[3] = 43;
        arr[4] = 23;


        // [23, 43 , and any number ]
        System.out.println(arr[3]);

        // input using for loops
        for (int i=0; i<= arr.length; i++){
            arr[i] = in.nextInt();
        }

//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
