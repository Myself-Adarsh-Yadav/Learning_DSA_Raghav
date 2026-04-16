package Methods;

import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        max(num1, num2, num3);
    }
    public static int max(int a, int b, int c) {
        if (a>b && a>c) return a;
        else if (b>c && b>a) return b;
        else return c;
    }
}
