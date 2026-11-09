package com.casestudies;



import java.util.Scanner;

public class SupermarketManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int n;
        int quantity;

        String productName;
        double price;
        double total = 0;
        double discount = 0;
        double finalAmount = 0;

        boolean productsAdded = false;
        boolean billCalculated = false;
        boolean discountApplied = false;

        while (true) {

            System.out.println("\n===== SUPERMARKET MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Apply Discount");
            System.out.println("4. Display Final Amount");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter number of products: ");
                    n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {

                        System.out.println("\nEnter details of Product " + i);

                        System.out.print("Enter product name: ");
                        productName = sc.next();

                        System.out.print("Enter product price: ");
                        price = sc.nextDouble();

                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        total = total + (price * quantity);

                        System.out.println("Product added successfully!");
                    }

                    productsAdded = true;
                    billCalculated = false;
                    discountApplied = false;

                    break;

                case 2:

                    if (productsAdded) {

                        System.out.println("Total Bill Amount: Rs." + total);
                        billCalculated = true;

                    } else {

                        System.out.println("Please add products first!");
                    }

                    break;

                case 3:

                    if (billCalculated) {

                        if (total > 10000) {

                            discount = total * 15 / 100;
                            finalAmount = total - discount;

                            System.out.println("15% Discount Applied!");
                            System.out.println("Discount Amount: Rs." + discount);

                        } else {

                            discount = 0;
                            finalAmount = total;

                            System.out.println("No Discount Applicable!");
                        }

                        discountApplied = true;

                    } else {

                        System.out.println("Please calculate the bill first!");
                    }

                    break;

                case 4:

                    if (discountApplied) {

                        System.out.println("\n========== FINAL BILL ==========");
                        System.out.println("Total Amount: Rs." + total);
                        System.out.println("Discount: Rs." + discount);
                        System.out.println("Final Amount: Rs." + finalAmount);
                        System.out.println("================================");

                    } else {

                        System.out.println("Please calculate the bill and apply discount first!");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice! Please enter 1 to 5.");
            }
        }
    }
}
