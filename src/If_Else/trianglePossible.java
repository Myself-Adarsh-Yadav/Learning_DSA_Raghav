package If_Else;

import java.util.Scanner;

public class trianglePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int side1 = sc.nextInt();
        System.out.print("Enter 2nd Side: ");
        int side2 = sc.nextInt();
        System.out.print("Enter 3rd Side: ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            System.out.println("Yes! Triangle is Possible with these Sides.");
        }else {
            System.out.println("Not possible with these Sides");
        }
    }
}
