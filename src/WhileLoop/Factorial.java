package WhileLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial number is  " + fact);
    }
}
