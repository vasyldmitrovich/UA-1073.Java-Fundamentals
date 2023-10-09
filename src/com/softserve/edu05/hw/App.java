package com.softserve.edu05.hw;

import com.softserve.edu05.hw.hw1program.OneProgram;

class App {

    public static void main(String[] args) {

        //HW 1

        OneProgram.oneProgramM();//Ok

        //HW 2 - Sum of two integers in do-while cycle

        DoWhileSum.doWhileSum();//Ok

        //HW 3 - Cars

        new Car("BMW", 2019, 3.0);
        new Car("Запорожець", 1988, 7.0);
        new Car("Audi", 2023, 4.0);
        new Car("Mercedes", 1988, 1.988);

        Car.findCarsByYear();
        Car.sortCarsDescendingOrder();

        //HW 4 - Random Number Game

        RandomNumberGame.game();

        // HW 5 - will make it tomorrow
    }
}
