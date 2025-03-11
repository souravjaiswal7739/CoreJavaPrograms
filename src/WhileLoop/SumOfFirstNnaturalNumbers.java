package WhileLoop;

import java.util.Scanner;

public class SumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        int n, i, add = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        i=1;
        while(i<=n) {
            add = add + i;
            i++;
        }
        System.out.println("sum is "+ add);

    }
}
