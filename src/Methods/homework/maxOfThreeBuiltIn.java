package Methods.homework;

import java.util.Scanner;

import static java.lang.Math.max;

public class maxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers (give space): ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result = max(max(num1, num2),max(num3, num4));
        System.out.println(result);
    }
}
