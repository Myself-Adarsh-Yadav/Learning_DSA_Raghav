package If_Else.homework;

import java.util.Scanner;

public class liesInQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point Lies on the origin");
        }
        else if (x == 0) {
            System.out.println("Point lies in " + (y > 0 ? "+ve" : "-ve") + "Y-axis");
        }
        else if (y == 0) {
            System.out.println("Point lies in " + (x > 0 ? "+ve" : "-ve") + "X-axis");
        }
        else {
            if (x > 0) {
                System.out.println("Point lies in " + ((y > 0) ? "1st Quadrant" : "4th Quadrant"));
            }
            else {
                System.out.println("Point lies in " + ((y > 0) ? "2nd Quadrant" : "3rd Quadrant"));
            }
        }
    }
}
