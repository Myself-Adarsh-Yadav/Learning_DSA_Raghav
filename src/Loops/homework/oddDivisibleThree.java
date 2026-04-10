package Loops.homework;

public class oddDivisibleThree {
    public static void main(String[] args) {
        for (int i = 3; i <= 99; i++) {
            if (i % 3 == 0 && i % 2 !=0) {
                System.out.print(i + " ");
            }
        }
    }
}
