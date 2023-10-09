package com.softserve.edu04.pt;

class App {

    public static void main(String[] args) {

        // Pt1 . just run it... )

        OddNumbers.calcOddNumb();

        //Pt2 NUMBER !!! of the day of the week (according to the requirements)

        DaysOfWeek.dayByNumber();

        //Pt3 Implement 2 types of switch

        Country.showContinentByCountry();

        //Pt4 + Pt5

        Product p1 = new Product("Сало", 300.00, 2);
        Product p2 = new Product("Iphone 15", 48_000.00, 17);
        Product p3 = new Product("Gun", 23_000.00, 40);
        Product p4 = new Product("Fireworks", 86.47, 499);
        ProductMethods.getMostExpensive(p1, p2, p3, p4);
        ProductMethods.biggestQuantityProduct(p1, p2, p3, p4);





    }

}
