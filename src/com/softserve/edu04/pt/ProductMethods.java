package com.softserve.edu04.pt;

public class ProductMethods {

    private static Product mostExpensive;//Move this two variable from here to class for example Pt1.java
    private static Product biggestQuantity;

    //And this methods move too
    private static Product comparisonByPrice (Product p1, Product p2) {
        return (p1.getPrice() <= p2.getPrice()) ? p2 : p1;
    }

    private static Product comparisonByQuantity (Product p1, Product p2) {
        return (p1.getQuantity() <= p2.getQuantity()) ? p2 : p1;
    }

    static void  getMostExpensive(Product p1, Product p2, Product p3, Product p4) {
        mostExpensive = p1;
        mostExpensive = comparisonByPrice(mostExpensive, p2);
        mostExpensive = comparisonByPrice(mostExpensive, p3);
        mostExpensive = comparisonByPrice(mostExpensive, p4);
        System.out.println("Most expensive product - \"" + mostExpensive.getName() + "\" with quantity " +
                mostExpensive.getQuantity());
    }

    static void biggestQuantityProduct (Product p1, Product p2, Product p3, Product p4) {
        biggestQuantity = p1;
        biggestQuantity = comparisonByQuantity(biggestQuantity, p2);
        biggestQuantity = comparisonByQuantity(biggestQuantity, p3);
        biggestQuantity = comparisonByQuantity(biggestQuantity, p4);
        System.out.println("\"" + biggestQuantity.getName() + "\" has the biggest quantity - " + biggestQuantity.getQuantity());
    }



}
