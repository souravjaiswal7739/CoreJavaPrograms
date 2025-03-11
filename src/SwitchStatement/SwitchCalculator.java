package SwitchStatement;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("enter your choice 1 ->add ,2-> sub ,3-> multily ,4-> division");
        ch = sc.nextInt();
        switch (ch) {

            case 1:
                System.out.println("addition = " + (a + b));
                break;
            case 2:
                System.out.println("subtarction = " + (a - b));
                break;
            case 3:
                System.out.println("multiplication = " + (a * b));
                break;
            case 4:
                System.out.println("Division = " + (a / b));
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
