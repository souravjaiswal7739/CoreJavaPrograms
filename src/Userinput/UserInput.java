package Userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your name");
       String name= sc.nextLine();
       System.out.println("Good morning "+name);
       System.out.println(name +",Also tell your age");
       int age=sc.nextInt();
        System.out.println("your age is  "+age);


    }
}
