package introduction.basics;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the price of pen: ");
        int penPrice = scn.nextInt();


        System.out.print("Enter the price of pencil : ");
        int pencilPrice = scn.nextInt();


        System.out.print("Enter the price of notebook : ");
        int notebookPrice = scn.nextInt();


        int totalPriceWithoutGST = penPrice + pencilPrice + notebookPrice;
        System.out.println("The total price is " + totalPriceWithoutGST);

        double gstCost = totalPriceWithoutGST*0.18;
        System.out.println("GST for your item is " + gstCost);

        double toatlCost = totalPriceWithoutGST + gstCost;
        System.out.println("The total price to pay is :" + toatlCost);
    }
}
