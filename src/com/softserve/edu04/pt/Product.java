package com.softserve.edu04.pt;

class Product {

    String name;
    double price;
    int quantity;
    static Product mostExpensive;
    static Product biggestQuantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private static Product comparisonByPrice (Product p1, Product p2) {
        return (p1.price <= p2.price) ? p2 : p1;
    }

    private static Product comparisonByQuantity (Product p1, Product p2) {
        return (p1.quantity <= p2.quantity) ? p2 : p1;
    }

    static void  getMostExpensive(Product p1, Product p2, Product p3, Product p4) {
        mostExpensive = p1;
        mostExpensive = comparisonByPrice(mostExpensive, p2);
        mostExpensive = comparisonByPrice(mostExpensive, p3);
        mostExpensive = comparisonByPrice(mostExpensive, p4);
        System.out.println("Most expensive product - \"" + mostExpensive.name + "\" with quantity " +
                mostExpensive.quantity);
    }

    static void biggestQuantityProduct (Product p1, Product p2, Product p3, Product p4) {
        biggestQuantity = p1;
        biggestQuantity = comparisonByQuantity(biggestQuantity, p2);
        biggestQuantity = comparisonByQuantity(biggestQuantity, p3);
        biggestQuantity = comparisonByQuantity(biggestQuantity, p4);
        System.out.println("\"" + biggestQuantity.name + "\" has the biggest quantity - " + biggestQuantity.quantity);
    }

}
