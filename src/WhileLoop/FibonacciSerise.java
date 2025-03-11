package WhileLoop;

import java.util.Scanner;

public class FibonacciSerise {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8  sum of first two number
        int x = 0, y = 1, sum = 0, max;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        max=sc.nextInt();
        while(sum<=max){
            System.out.print(sum);
            x=y;
            y=sum;
            sum=x+y;
        }


    }
}
