package _4_Conditionals_and_Loops;

import java.util.Scanner;

public class _3_Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = in.nextInt();
        System.out.println("enter Second number : ");
        int b = in.nextInt();
        System.out.println("enter Thred number : ");
        int c = in.nextInt();

        // Q: Find the largest of the 3 number
        int max = a;
        if (b > max) {
            max = c;
        }
        if (c > max) {
            max = c;
        }



        // other menthid
        int maxu = 0;
        if (a > b) {
            maxu = a;
        } else {
            maxu = b;
        }

        if (c > maxu) {
            maxu = c;
        }


        // one more other ease one
        int maxi = Math.max(c, Math.max(a,b));

        System.out.println("The Largret number is : " + maxi);
    }
}
