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

        System.out.printf("%49s %5s %-8s %-7s %-10s\n", "Product", " Quantity", "Price", "miles", "TotalCost");
        System.out.printf("%49s %5s %8s %7s %10s\n", "------ ", "------", "------" , "------", "-------");
        double totalCost;
        if (travel <= 4) {
            totalCost = qty * payment + 2;
        } else if (travel <= 15) {
            totalCost = qty * payment + 5;
        } else if (travel <= 25) {
            totalCost = qty * payment + 10;
        } else if (travel <= 50) {
            totalCost = qty * payment + 15;
        } else{
            totalCost = qty * payment + 20;
    }
        System.out.printf("%48s %5d %8.1f %7.1f %10.1f\n",name,qty,payment,travel,totalCost);

        System.out.printf("%74s\t","Thank you. Come Again!");
    }

}
