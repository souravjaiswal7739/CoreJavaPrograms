package Operators_type;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("enter your choice 1 ->add ,2-> sub ,3-> multily ,4-> division");
        ch = sc.nextInt();
        if (ch == 1)
            System.out.println("addition = " + (a + b));
        else if (ch == 2)
            System.out.println("subtarction = " + (a - b));
        else if (ch == 3)
            System.out.println("multiplication = " + (a * b));
        else if (ch == 4)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("invalid input");
    }
}
