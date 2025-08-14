package _7_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _5_MultiAL {
    public static void main(String[] args) {
        // multiDisionalArrayList

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // add element
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
