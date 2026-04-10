package Loops;
import java.util.Scanner;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        do {
            n/=10;
            count++;
        }while(n != 0);
        System.out.println("Digit: " + count);
    }
}
