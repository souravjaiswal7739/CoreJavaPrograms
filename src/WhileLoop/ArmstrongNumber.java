package WhileLoop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //sum of individual digit cubes is equal to same number
        //153= 1*3 + 5*3 + 3*3 =153
        int n, temp, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("not a armstrong");
        }
    }


}

