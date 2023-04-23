package Lab1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        System.out.print("Enter price: ");
        double payment = scanner.nextDouble();

        System.out.print("Enter distance: ");
        double travel = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Product" + '\t' + " Quantity" + '\t' + "Price" + '\t' + "miles" + '\t' + "TotalCost");
        System.out.println("-----" +'\t'+ " ------ " +'\t'+ "------" +'\t'+ "------" +'\t'+ " -------" +'\t');
        double totalCost;
        if (travel <= 4) {
            totalCost = qty * payment + 2;
        } else if (travel <= 15) {
            totalCost = qty * payment + 5;
        } else if (travel <= 25) {
            totalCost = qty * payment + 10;
        } else if (travel <= 50) {
            totalCost = qty * payment + 15;
        } else {
            totalCost = qty * payment + 20;
        }
        System.out.printf("%-10s %-10d %-4.1f %6.1f %10.1f\n", name, qty, payment, travel, totalCost);

        System.out.printf("%s\t","Thank you. Come Again!");
    }

}
