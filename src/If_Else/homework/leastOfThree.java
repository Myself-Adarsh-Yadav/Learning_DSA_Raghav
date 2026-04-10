package If_Else.homework;

import java.util.Scanner;

public class leastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers and get Greatest of them.");
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3 = sc.nextInt();
        if (num1 <= num2) {
            if (num1 <= num3) System.out.println(num1 + " is the Least.");
            else System.out.println(num3 + " is the Least.");
        }
        else {
            if (num2 <= num3) System.out.println(num2 + " is the Least.");
            else System.out.println(num3 + " is the Least.");
        }
    }
}
