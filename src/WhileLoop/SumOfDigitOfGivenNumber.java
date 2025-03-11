package WhileLoop;

import java.util.Scanner;

public class SumOfDigitOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, sum = 0, rem;
        System.out.println("Enter number");
        no = sc.nextInt();
        while (no > 0) {
            rem = no % 10;
            sum = sum + rem;
            no = no / 10;
        }
        System.out.println("sum of digit of given number is " + sum);
    }
}
