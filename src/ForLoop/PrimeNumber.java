package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, i;
        System.out.println("Enter number");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
