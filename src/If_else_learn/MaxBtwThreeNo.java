package If_else_learn;

import java.util.Scanner;

public class MaxBtwThreeNo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("enter ist number");
        a = input.nextInt();
        System.out.println("enter second number");
        b = input.nextInt();
        System.out.println("enter third number");
        c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c && b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

    }
}
