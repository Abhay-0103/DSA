package _4_Conditionals_and_Loops;

public class _1_if {

        public static void main(String[] args) {

            /* for if
            if (boolrand epxopc t or f) {
            // body
            else {
            // do this
            }
             */


            int salary = 35400;
//
//            if (salary > 10000) {
//                salary = salary + 2000;
//            } else {
//                salary = salary + 1000;
//            }


            // multi if-else

            if (salary > 10000) {
                salary += 2000;
            } else if (salary > 20000) {
                salary += 30000;
            } else {
                salary += 1000;
            }

            System.out.println("Final salary: " + salary);
        }
    }
