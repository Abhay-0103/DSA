package _4_Conditionals_and_Loops;

import java.util.Scanner;

public class _5_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("your fibonacci number : " + b);
    }
}
