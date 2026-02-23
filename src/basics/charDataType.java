package basics;

public class charDataType {
    public static void main(String[] args) {
        char bc = 'A';
        int x = bc; // implicit type casting
        System.out.println(x);

        char bh = 'a';
        int y = (int)bh; // explicit type casting
        System.out.println(y);

        char dh = '@';
        System.out.println(dh+0);

        int p = 69;
        char xy = (char)p;
        System.out.println(xy);
    }
}
