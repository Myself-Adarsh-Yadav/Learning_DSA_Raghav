package Methods;

import java.util.Scanner;

public class returnIsMandatory {
    public static int fac(int x){
        int f = 1;
        for (int i = x; i >= 1; i--) {
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = fac(n)/(fac(r)*fac((n-r)));
        int nPr = fac(n)/fac(n-r);
        System.out.println("Combination: "+nCr);
        System.out.println("Permutation: "+nPr);

    }
}
