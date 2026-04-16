package Arrays.homework;

public class searchInArray {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 56, 3};
        // find 15 exist or not
        int target = 3;
        System.out.println(find(target, arr));
    }
    public static String find(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return "Found at Index: " +i;
            }
        }
        return "Not Found";

    }
}
