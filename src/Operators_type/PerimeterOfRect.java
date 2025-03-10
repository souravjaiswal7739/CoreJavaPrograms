package Operators_type;

import java.util.Scanner;

public class PerimeterOfRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all sides in cm");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("perimeter of rectangle is " + perimeter + " cm");

    }
}
