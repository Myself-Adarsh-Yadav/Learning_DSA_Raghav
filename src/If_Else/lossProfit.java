package If_Else;

import java.util.Scanner;

public class lossProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();
        sc.close();

        if (sellingPrice == costPrice) {
            System.out.println("No loss, No Profit");
        }
        else if (sellingPrice > costPrice) {
            System.out.println("You gain Profit");
            System.out.println("You Gain " + (sellingPrice-costPrice)*100/costPrice +" %");
        }
        else{
            System.out.println("You got loss!");
            System.out.println("You loss " + (costPrice-sellingPrice)*100/costPrice +" %");
        }
    }
}
