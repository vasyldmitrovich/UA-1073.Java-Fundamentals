package com.softserve.edu04.pt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    //This two methods move in the end of class, and add constructor without parameters, getters and setters
    public static Product searchMostExpensiveProduct(Product[] products){
        Product product = products[0];

        for (int i = 1; i < products.length; ++i){
            if(product.price < products[i].price){
                product = products[i];
            }
        }

        return product;
    }

    public static Product searchProductQuantity(Product[] products){
        Product product = products[0];

        for (int i = 1; i < products.length; ++i){
            if(product.quantity < products[i].quantity){
                product = products[i];
            }
        }

        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
