package basics.homework;

import java.util.Scanner;

public class getSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double num2 = sc.nextDouble();
        double square = num1 * num1;
        double cube = num2 * num2 * num2;
        System.out.print("Square of 1st Number: ");
        System.out.println(square);
        System.out.print("Cube of 2nd Number: ");
        System.out.println(cube);
    }
}
