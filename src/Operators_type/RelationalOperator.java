package Operators_type;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving License Portal");
        System.out.println("Please enter your age :  ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eliible to drive");
        } else {
            System.out.println("beta cycle chalao");
        }
    }
}
