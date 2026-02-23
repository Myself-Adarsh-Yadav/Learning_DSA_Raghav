package basics;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.print("Sum of given Number: ");
        System.out.println(sum);
    }
}
