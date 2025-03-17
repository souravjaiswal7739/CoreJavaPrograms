package Methods;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("factorial number " + fact);

    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
