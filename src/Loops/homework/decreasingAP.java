package Loops.homework;
import java.util.Scanner;

public class decreasingAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term of Decreasing AP: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Difference of Decreasing AP: ");
        int d = sc.nextInt();
        if (d < 0) {
            d = Math.abs(d);
        }
        if (d == 0) {
            System.out.println("Common Difference must be Non ZERO!");
        }
        else {
            System.out.print("AP: ");
            for (int i = a; i >0 ; i = i-d) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
