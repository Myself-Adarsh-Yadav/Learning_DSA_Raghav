package If_Else.homework;

import java.util.Scanner;

public class smallerThan69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num < 0) num = -num;
        if (num < 69) {
            System.out.println("Magnitude is less than 69.");
        }
        else {
            System.out.println("ALERT!! \nMagnitude is not less than 69.");
        }
    }
}
