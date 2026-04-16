package Methods;

import java.util.Scanner;

public class arguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum(num1,num2);
        sub(num1, num2);
        mult(num1, num2);
        div(num1, num2);
    }
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void sub(int a, int b) {
        System.out.println(a-b);
    }
    public static void mult(int a, int b) {
        System.out.println(a*b);
    }
    public static void div(double a, double b) {
        System.out.println(a/b);
    }
}
