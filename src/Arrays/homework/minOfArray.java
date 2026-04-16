package Arrays.homework;

public class minOfArray {
    public static void main(String[] args) {
        int[] arr = {45, 2, 12, 99, 142};
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
