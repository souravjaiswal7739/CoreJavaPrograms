package WhileLoop;

import java.util.Scanner;

public class ReverseAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, rev = 0, rem, original;
        System.out.println("Enter number");
        no = sc.nextInt();
        original = no;
        while (no > 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        System.out.println("Reverse number is " + rev);
        //check palindrome or not
        //121 -121---palindrome
        if (original == rev)
            System.out.println("number is palindrome");
        else
            System.out.println("not palindrome");
    }
}
