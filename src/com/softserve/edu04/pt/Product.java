package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this("N/A", 0,0);
    }

    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void promptParameters(Product product) {
        System.out.println("Input product name");
        String name = SCANNER.nextLine();
        product.setName(name);

        System.out.println("Input product price");
        double price = SCANNER.nextDouble();
        product.setPrice(price);
        SCANNER.nextLine();

        System.out.println("Input product quantity");
        int quantity = SCANNER.nextInt();
        product.setQuantity(quantity);
        SCANNER.nextLine();
    }

    public static Product findMostExpensive (Product[] products) {
        Product mostExpensive = null;

        for (Product product : products) {
            if (mostExpensive == null || product.isMoreExpensive(mostExpensive)) {
                mostExpensive = product;
            }
        }

        return mostExpensive;
    }

    public static Product findMoreQuantity (Product[] products) {
        Product moreQuantity = null;

        for (Product product : products) {
            if (moreQuantity == null || product.hasBiggerQuantity(moreQuantity)) {
                moreQuantity = product;
            }
        }

        return moreQuantity;
    }

    public boolean isMoreExpensive(Product product) {
        return price > product.getPrice();
    }

    public boolean hasBiggerQuantity(Product product) {
        return quantity > product.getQuantity();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
}
