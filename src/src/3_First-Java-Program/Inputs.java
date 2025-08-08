import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("please enter one input: ");
//        int rollno = input.nextInt();
//        System.out.println("your roll number is " + rollno);
//
            int a = 234_000_000;
        System.out.println(a);

        // other example
        System.out.println("enter your name : ");
        String name = input.nextLine();
        System.out.println(name);

        // example for float
        System.out.println("Input the makes ");
        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
