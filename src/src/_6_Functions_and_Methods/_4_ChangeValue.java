package _6_Functions_and_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _4_ChangeValue {
    public static void main(String[] args) {
       // create an array
       int[] arr = {1, 2, 3, 4, 5};
       change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
