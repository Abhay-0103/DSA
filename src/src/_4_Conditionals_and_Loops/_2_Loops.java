package _4_Conditionals_and_Loops;

import java.util.Scanner;

public class _2_Loops {
    public static void main(String[] args) {
        // Q: Print number from 1 to 5

        /*
                syntax of For Loop
                for (int ; condion; +/-) {
                     // body
                }
         */



        for (int num = 1; num <=5; num+= 1 ){
            System.out.println(num);
        }

        // print number from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <=n ; num++) {
           // System.out.println(num + " ");
            System.out.println("Haa Bhai Kya Hal");
        }

        // while loops
        /*
        syntax:
        while (condition ) {
        // body
        }
         */


        for (int num = 1; num <=5; num+= 1 ){
            System.out.println(num);
        }
        int num = 1;
        while (num <= 5) {
           System.out.println(num);
            num += 1;
        }

        // do while
        /*

            do {

            } while (condition);

         */

            int n = 1;
            do {
                System.out.println(n);
                n++;
            } while (n <= 5);

    }
}
