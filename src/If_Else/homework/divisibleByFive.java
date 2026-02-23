package If_Else.homework;

import java.util.Scanner;

public class divisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num%5 == 0) {
            System.out.println("Divisible by Five");
            System.out.println("Thanks");
        }else {
            System.out.println("Not divisible by Five");
            System.out.println("Thank You!");
        }
    }
}
