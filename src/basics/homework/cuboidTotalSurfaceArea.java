package basics.homework;

public class cuboidTotalSurfaceArea {
    public static void main(String[] args) {
        double l = 5, b = 9, h = 6;
        double surfaceArea = 2 * (l*b + b*h + l*h);
        System.out.print("Total Surface Area of Cuboid is: ");
        System.out.println(surfaceArea);

    }
}
