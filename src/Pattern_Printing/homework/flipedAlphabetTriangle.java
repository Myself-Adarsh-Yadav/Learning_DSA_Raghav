package Pattern_Printing.homework;

import java.util.Scanner;

public class flipedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=0; j<n+1-i; j++) {
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
    }
}
