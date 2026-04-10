package Pattern_Printing.homework;

import java.util.Scanner;

public class alternateAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<=n; i++) {
            for (int j=0; j<=i; j++){
                if (j%2 == 0) {
                    System.out.print((char)('A'+j));
                }else {
                    System.out.print((char)('a'+j));
                }
            }
            System.out.println();
        }
    }
}
