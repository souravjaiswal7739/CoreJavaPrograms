package ForLoop;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
