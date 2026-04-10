package If_Else.homework;

import java.util.Scanner;

public class rectangleAreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the length of rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.println("Area is greater then Perimeter.");
        }else {
            System.out.println("Perimeter is greater then Area.");
        }
    }
}
