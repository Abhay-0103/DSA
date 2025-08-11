package _6_Functions_and_Methods;

import java.util.Scanner;

public class _1_Method {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the First number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;
        System.out.println("The sume of 2 number is : " + sum);
    }

}
