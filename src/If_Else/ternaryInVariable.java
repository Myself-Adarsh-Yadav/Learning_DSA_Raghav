package If_Else;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int newNum = (n >= 0) ? 100 : 0;
        System.out.println(newNum);
    }
}
