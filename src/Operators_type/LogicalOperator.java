package Operators_type;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ticket discount calculator");
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("are you female? (true/false) ");
        boolean isFemale = input.nextBoolean();
        if (age < 5) {
            System.out.println("75% discount");
        } else if (isFemale) {
            System.out.println("50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("25% discount");
        } else {
            System.out.println("not discount");
        }
    }
}
