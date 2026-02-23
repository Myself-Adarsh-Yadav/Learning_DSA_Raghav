package If_Else;

import java.util.Scanner;

public class intergerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real Number: ");
        double num = sc.nextDouble();
        if (num == (int)num) {
            System.out.println("Number is Integer");
        }else {
            System.out.println("Number is not Integer");
        }
    }
}
