package Arrays;

public class negetiveNumOnly {
    public static void main(String[] args) {
        int[] arr = {5, -6, 2, -7, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
