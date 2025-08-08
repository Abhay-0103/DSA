import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("enter your number ");
//        float num = input.nextFloat();
//        System.out.println(num);

        // typecasting
// compasing the bigger number into smaller type is called typecasting
        int num = (int)(67.90f);
       // System.out.println(num);

        // automatic type promotion in expression

//        int a = 257;
//        byte b= (byte)(a); // its adding 257 % 256 = 1


//        int a = 40;
//        int b = 39;
//        int c = 100;
//        int d = (a*b) / c;



        // all in one

        byte b = 42;
        char c = 'a';
        short s  = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double  = double
        System.out.println((f * b) + " " + (i / c) +" " + (d * s));
        System.out.println(result);






    }
}
