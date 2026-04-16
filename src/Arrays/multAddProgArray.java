package Arrays;

public class multAddProgArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6};
        System.out.println("Old Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i%2 ==0) {
                arr[i]+=10;
            }else {
                arr[i]*=2;
            }
        }
        System.out.println("New Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
