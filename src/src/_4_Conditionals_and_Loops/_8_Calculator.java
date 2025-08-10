package _4_Conditionals_and_Loops;

import java.util.Scanner;

public class _8_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or X
        int ans = 0;

        while (true) {
            // take the operator as input
            System.out.println("Enter the Operator : ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two number
                System.out.println("Enter First number");
                int num1 = in.nextInt();
                System.out.println("Enter Second number");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operations!!");
            }
            System.out.println("Your answer in " + ans);
        }
    }
}
