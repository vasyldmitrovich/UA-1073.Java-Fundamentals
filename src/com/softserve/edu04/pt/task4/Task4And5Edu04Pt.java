package com.softserve.edu04.pt.task4;

public class Task4And5Edu04Pt {//Rename this class
    public static void task4And5() {
        Product p1 = new Product("cherry", 11.5, 90);
        Product p2 = new Product("apple", 14.5, 30);
        Product p3 = new Product("strawberry", 9.5, 50);
        Product p4 = new Product("tomato", 15.5, 40);

        Product expensive = Product.mostExpensiveProduct(p1, p2, p3, p4);
        Product mostquantity = Product.mostQuantity(p1, p2, p3, p4);

        System.out.println("The most expensive product is: " + expensive);
        System.out.println("The most quentity product is: " + mostquantity);


    }


}
