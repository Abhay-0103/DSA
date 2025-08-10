package _5_Switch_and_Nested;

import java.util.Scanner;

public class _1_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit : ");
        String fruit = in.next();

        // old method
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweer red one");
                break;
            case "Orange":
                System.out.println("small fruit");
                break;
            case "Grapes":
                System.out.println("blue blue");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }


        // if else ,method
        System.out.println("Enter The Day : ");
        int day = in.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter a valid day");
        }


        // new and enhance method
        System.out.println("Enter The Day : ");
        int day1 = in.nextInt();
        switch (day1){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter a valid day");
        }

    }
}
