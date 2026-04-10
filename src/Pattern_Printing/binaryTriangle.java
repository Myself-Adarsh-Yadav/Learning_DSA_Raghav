package Pattern_Printing;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                int num = ((i+j)%2 == 0) ? 1 : 0;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
