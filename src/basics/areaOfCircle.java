package basics;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double circumference = 2*3.14*radius;
        double area = 3.14*radius*radius;

        System.out.println("Circumference of circle radius " +radius + " is " + circumference +".");
        System.out.println("Area of circle of radius " + radius + " is " + area + ".");
    }
}
