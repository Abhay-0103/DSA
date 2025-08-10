package _4_Conditionals_and_Loops;

public class _7_Reverse {
    public static void main(String[] args) {
        int num = 28479; // random number

        int ans = 0;

        while (num > 0 ){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
