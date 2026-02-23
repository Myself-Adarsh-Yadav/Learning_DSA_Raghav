package basics.homework;

import java.util.Scanner;

public class volumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double PI = 3.1415;
        double volume = (4.0/3.0) * PI * r * r * r;
        System.out.print("Volume of Sphere: ");
        System.out.println(volume);
    }
}
