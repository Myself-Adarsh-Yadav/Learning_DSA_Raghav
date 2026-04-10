package Pattern_Printing.homework;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print((char)('a' + j)+" ");
            }
            System.out.println();
        }
    }
}
