package _5_Switch_and_Nested;

import java.util.Scanner;

public class _2_Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Emp ID : ");
        int empID = in.nextInt();
        System.out.println("Enter Department : ");
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Naam Hai Abhay");
                break;
            case 2:
                System.out.println("Ka Ho Ka Hal Hai");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department enter");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
