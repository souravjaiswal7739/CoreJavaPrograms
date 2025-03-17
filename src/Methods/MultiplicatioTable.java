package Methods;

import java.util.Scanner;

public class MultiplicatioTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        multiTable(num);
        multiTable(5);

    }

    public static void multiTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }

    }
}
