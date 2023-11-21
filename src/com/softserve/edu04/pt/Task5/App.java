package com.softserve.edu04.pt.Task5;

public class App {
    public static void main (String[] args){
        Product product1 = new Product();
        product1.prodValues ();
        Product product2 = new Product();
        product2.prodValues ();
        Product product3 = new Product();
        product3.prodValues ();
        Product product4 = new Product();
        product4.prodValues ();
        double mostExpensive = product1.getPrice();
        if (product2.getPrice() > mostExpensive){
            mostExpensive = product2.getPrice();
        }
        if (product3.getPrice() > mostExpensive) {
            mostExpensive = product3.getPrice();
        }
        if (product4.getPrice() > mostExpensive) {
            mostExpensive = product4.getPrice();
        }
        int biggestQuantity = product1.getQuantity();
        if (product2.getQuantity() > biggestQuantity){
            biggestQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > biggestQuantity) {
            biggestQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > biggestQuantity) {
            biggestQuantity = product4.getQuantity();
        }

        System.out.println("Most expensive product is " + mostExpensive+ ", quantity is " + mostExpensive); //cannot output name and quantity (method .getName and .getQuantity highlighted as red and do not connect with the Product.java file. Can you please help with a solution?
        System.out.println("Product with the biggest quantity is " + biggestQuantity); //the same problem here, cannot output name.


    }
}
