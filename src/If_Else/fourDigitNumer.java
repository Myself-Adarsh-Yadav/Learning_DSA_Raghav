package If_Else;

import java.util.Scanner;

public class fourDigitNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 999 && num < 10000) {
            System.out.println("Number is Four Digit Number.");
        }else {
            System.out.println("Not a Four Digit Number");
        }
    }
}
