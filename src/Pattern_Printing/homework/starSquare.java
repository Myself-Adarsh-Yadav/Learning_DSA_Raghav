package Pattern_Printing.homework;

import javax.swing.*;
import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int square = sc.nextInt();

        for(int i=0; i<square;i++) {
            for (int j=0; j<square;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
