package Loops;
import java.util.Scanner;

public class geometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Term: ");
        int n = sc.nextInt();
        System.out.print("GP: ");
        for (int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            a *= r;
        }
        sc.close();
    }
}
