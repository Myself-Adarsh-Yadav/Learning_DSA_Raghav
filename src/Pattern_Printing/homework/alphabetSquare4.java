package Pattern_Printing.homework;

import java.util.Scanner;

public class alphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            char charToPrint = (i%2 == 0) ? (char)('a'+i) : (char)('A'+i);
            for (int j=0; j<n; j++) {
                System.out.print(charToPrint);
            }
            System.out.println();
        }
    }
}
