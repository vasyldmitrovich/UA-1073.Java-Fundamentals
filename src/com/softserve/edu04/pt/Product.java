package com.softserve.edu04.pt;

public class Product {
    public static void main(String[] args) {//Move to App.java
        Product p1 = new Product("Milk", 2.5, 20);
        Product p2 = new Product("Bread", 4, 10);
        Product p3 = new Product("Eggs", 0.6, 40);
        Product p4 = new Product("Salad", 7.5, 5);


        //Write logic like that in some method and call this method in main method
        Product mostExpensive = p1;
        if(p2.getPrice() > mostExpensive.getPrice()){
            mostExpensive = p2;
        }

        if(p3.getPrice() > mostExpensive.getPrice()){
            mostExpensive = p3;
        }

        if(p4.getPrice() > mostExpensive.getPrice()){
            mostExpensive = p4;
        }


        Product mostQuantity = p1;
        if(p2.getQuantity() > mostQuantity.getQuantity()){
            mostQuantity = p2;
        }

        if(p3.getQuantity() > mostQuantity.getQuantity()){
            mostQuantity = p3;
        }

        if(p3.getQuantity() > mostQuantity.getQuantity()){
            mostQuantity = p3;
        }

        System.out.println("Most Expensive Product: " + mostExpensive.getName());
        System.out.println("Quantity: " + mostExpensive.getQuantity());
        System.out.println("Most Quantity Product: " + mostQuantity.getName() + " quantity: " + mostQuantity.getQuantity());



    }
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public String toString() {
        return "Product name: " + getName() +
                " Product price: " + getPrice() + " Product quantity: " + getQuantity();

    }
}

