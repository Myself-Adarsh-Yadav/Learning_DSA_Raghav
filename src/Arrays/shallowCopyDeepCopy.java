package Arrays;
import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40};
//        int[] x = arr; // x is shallow copy of arr.
//        x[0] = 100;
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0] = 90;
        System.out.println(arr[0]);
    }

}
