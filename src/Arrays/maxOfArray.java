package Arrays;

import java.util.Arrays;

public class maxOfArray {
    public static void main(String[] args) {
        int[] arr = {45, 62, 12, 99, 142};
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
