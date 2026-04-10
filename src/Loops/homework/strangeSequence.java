package Loops.homework;
import java.util.Scanner;

public class strangeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        for (int i = 1; i <= (n/2); i++) {
//            System.out.println(i);
//            System.out.println(n-(i-1));
//        }
//        if (n % 2 != 0) {
//            System.out.println((n / 2) + 1);
//        }

        for (int i = 1, j = n; i <= j; i++, j--) {
            if (i == j) {
                System.out.println(i);
            }
            else {
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}
