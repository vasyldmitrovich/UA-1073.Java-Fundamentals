package com.softserve.edu05.pt;

public class App {

    public static void main(String[] args) {

        // Pt 1 - Arrays. Create, sort and look up for coincidences

        ArraysForHW.createAndSortArray();
        ArraysForHW.averageOfArray();
        ArraysForHW.coincidenceCheck();

        //Pt 2 - Check Integer from input

        PrimeNumber.primeCheck();

        //Pt 3 - Create array of random integers

        RandomIntegersArray.fillTheArray();
        RandomIntegersArray.sumOfPositiveNumbers();
        RandomIntegersArray.numberOfNegativeNumbers();
                // it was simple after refactoring, so I create this method for symmetry
        RandomIntegersArray.numberOfPositiveNumbers();
        RandomIntegersArray.negativeOrPositive();

        //Pt 4

        new Employee("Alex", 1, 300);
        new Employee("Bob", 2, 250);
        new Employee("Jeff", 1, 200);
        new Employee("Dylan", 3, 400);
        new Employee("Denis", 1, 270);
        Employee.whoWorksInDep();
        Employee.arrangeDescending();
    }
}
