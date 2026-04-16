package Arrays.homework;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int arrProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            arrProduct*=arr[i];
        }
        System.out.println("Product of Array: " + arrProduct);
    }
}
