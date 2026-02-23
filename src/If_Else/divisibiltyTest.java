package If_Else;

import java.util.Scanner;

public class divisibiltyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Divisible by Five and Three");
        }else if (num % 5 == 0) {
            System.out.println("Divisible by Five");
        }else if (num % 3 == 0) {
            System.out.println("Divisible by Three");
        }else {

        }
    }
}
