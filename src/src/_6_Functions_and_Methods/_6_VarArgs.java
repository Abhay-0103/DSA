package _6_Functions_and_Methods;

import java.util.Arrays;

public class _6_VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 67, 87, 98);
        mulit(2, 3, "Abhay", "Singh");
    }

    static void mulit(int a, int b, String...c){

    }

    static void fun(int...a){
        System.out.println(Arrays.toString(a));
    }

}
