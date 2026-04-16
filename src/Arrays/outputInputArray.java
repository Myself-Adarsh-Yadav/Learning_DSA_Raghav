package Arrays;

import java.util.Scanner;

public class outputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {55,3,8,7,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int[] karan = new int[4];
        for (int i = 0; i < karan.length; i++) {
            System.out.print("Enter "+(int)(i+1)+" value: ");
            karan[i] = sc.nextInt();
        }
        for (int i = 0; i < karan.length; i++) {
            System.out.print(Math.pow(karan[i], 2)+" ");
        }
    }
}
