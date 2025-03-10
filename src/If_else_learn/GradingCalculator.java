package If_else_learn;

import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your marks");
        int marks = input.nextInt();
        if (marks >= 90) {
            System.out.println("grade A");
        } else if (marks >= 75) {
            System.out.println("grade B");
        } else if (marks >= 60) {
            System.out.println("grade C");
        } else {
            System.out.println("fail");
        }

    }
}
