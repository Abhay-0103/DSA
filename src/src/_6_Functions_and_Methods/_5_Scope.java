package _6_Functions_and_Methods;

public class _5_Scope {
    public static void main(String[] args) {
        int a = 90;
        int b = 80;

        {
         //   int a = 99 // alread its initialzed cannot be doe again
             a =100;
            System.out.println(a);
            int c = 88;
            // value can intialised in this blck , wil reaim on the block
        }
      //  System.out.println(c); // cannot use outside the block
    }

    static void random(int marks) {
        int num = 78;
        System.out.println(num);
        System.out.println(marks);
    }
}
