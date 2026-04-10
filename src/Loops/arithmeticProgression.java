package Loops;

import java.util.Scanner;

public class arithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter the Common Difference: ");
        int d = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println(a + " ");
            a +=d;
        }
    }
}
