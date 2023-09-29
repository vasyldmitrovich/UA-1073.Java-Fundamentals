package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.Task5.SCANNER;

public class Task4 {
    public static class Product {

        public Product() {
            this("Error", 0.0, 0);
        }

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public static int totalQuantity;
        public static String nameTotalQuantity;

        public static String nameBiggestPrice;
        public static double biggestPrice;
        private String name;
        private double price;
        private int quantity;

        public static void promptParameters(Product product) {
            System.out.println("Input name of product:");
            String name = SCANNER.nextLine();
            product.setName(name);
            System.out.println("Input price for product '" + product.getName() + "' :");
            double price = SCANNER.nextDouble();
            product.setPrice(price);
            System.out.println("Input quality for product '" + product.getName() + "' :");
            int quantity = SCANNER.nextInt();
            SCANNER.nextLine();
            product.setQuantity(quantity);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
            this.price = price;

            if (biggestPrice < price) {
                biggestPrice = price;
                nameBiggestPrice = this.name;
            }
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;

            if (totalQuantity < quantity) {
                totalQuantity = quantity;
                nameTotalQuantity = this.name;
            }
        }

    }

}
