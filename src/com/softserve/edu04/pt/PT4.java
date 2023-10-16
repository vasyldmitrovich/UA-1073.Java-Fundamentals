package com.softserve.edu04.pt;

public class PT4 {
    public static void main(String[] args) {
        Product product1 = new Product("Item1", 10.99, 5);
        Product product2 = new Product("Item2", 15.99, 3);
        Product product3 = new Product("Item3", 5.99, 8);
        Product product4 = new Product("Item4", 12.99, 7);

        Product[] products = {product1, product2, product3, product4};

        Product mostExpensive = null;
        Product largestQuantity = null;

        for (Product product : products) {
            if (mostExpensive == null || product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
            if (largestQuantity == null || product.getQuantity() > largestQuantity.getQuantity()) {
                largestQuantity = product;
            }
        }
        System.out.println("Most Expensive Item: " + mostExpensive.getName() + " - Price: $" + mostExpensive.getPrice());
        System.out.println("Item with Largest Quantity: " + largestQuantity.getName() + " - Quantity: " + largestQuantity.getQuantity());
    }
}
