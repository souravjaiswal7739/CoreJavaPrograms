package Methods;

import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        int first = ReadNumber();
        int second = ReadNumber();
        int sum = first + second;
        System.out.println("sum of number is  " + sum);

    }

    public static int ReadNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        return number;


    }
}
