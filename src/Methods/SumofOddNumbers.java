package Methods;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum=oddSum(num);
        System.out.println("sum of odd numbers is " +sum);

    }
    public static int oddSum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
            i=i+2;
        }
        return sum;
    }
}
