package If_Else;

import java.util.Scanner;

public class isOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0 | num == 0) {
            System.out.println("Even Number");
            System.out.println("Happy Coding!");

        }else {
            System.out.println("Odd Number");
            System.out.println("Happy Coding!!");
        }
    }
}
