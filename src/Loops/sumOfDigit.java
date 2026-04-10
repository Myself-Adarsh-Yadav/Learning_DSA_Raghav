package Loops;
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Handle negative numbers if necessary
        n = Math.abs(n);

        int sum = 0;
        while(n != 0) {
            sum += n % 10; // 1. Get the last digit and add to sum
            n /= 10;    // 2. Remove the last digit from n
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}