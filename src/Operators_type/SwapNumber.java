package Operators_type;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
      /* int a= 5;
       int b=7;
       int c =a;
       a=b;
       b=c;
       System.out.println(a);
       System.out.println(b);*/
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("swapping done");
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);

    }
}
