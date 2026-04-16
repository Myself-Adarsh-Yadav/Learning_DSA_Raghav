package Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 7, 6};
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum+=arr[i];
        }
        System.out.println("Sum of Array: " + arraySum);
    }
}
