package com.softserve.Graduation;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int coffee = 120;
    int money = 550;
    int cups = 9;

    public CoffeeMachine(int water, int milk, int coffee, int money, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = money;
        this.cups = cups;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public CoffeeMachine() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String input;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            input = scanner.nextLine();
            if ("buy".equals(input)) {
                buy(coffeeMachine);
            }
            if ("fill".equals(input)) {
                fill(coffeeMachine);
            }
            if ("take".equals(input)) {
                take(coffeeMachine);
            }
            if ("remaining".equals(input)) {
                remaining(coffeeMachine.water, coffeeMachine.milk,
                        coffeeMachine.coffee, coffeeMachine.money, coffeeMachine.cups);
            }
        } while (!Objects.equals(input, "exit"));
    }


    private static void exit() {

    }

    private static void remaining(int water, int milk, int coffee, int money, int cups) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private static void buy(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String backMenu = scanner.nextLine();
        if ("back".equals(backMenu)) {
            return;
        }
        int buy = Integer.parseInt(backMenu);


        if (buy == 1) {
            calculate(coffeeMachine, buy);
            if (coffeeMachine.getWater() <= 250) {
                return;
            }
            if (coffeeMachine.getCoffee() <= 16) {
                return;
            }
            if (coffeeMachine.getCups() <= 1) {
                return;
            }
            coffeeMachine.setWater(coffeeMachine.getWater() - 250);
            coffeeMachine.setCoffee(coffeeMachine.getCoffee() - 16);
            coffeeMachine.setCups(coffeeMachine.getCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 4);
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (buy == 2) {
            calculate(coffeeMachine, buy);
            if (coffeeMachine.getWater() <= 350) {
                return;
            }
            if (coffeeMachine.getMilk() <= 75) {
                return;
            }
            if (coffeeMachine.getCoffee() <= 20) {
                return;
            }
            if (coffeeMachine.getCups() <= 1) {
                return;
            }
            coffeeMachine.setWater(coffeeMachine.getWater() - 350);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - 75);
            coffeeMachine.setCoffee(coffeeMachine.getCoffee() - 20);
            coffeeMachine.setCups(coffeeMachine.getCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 7);
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (buy == 3) {
            calculate(coffeeMachine, buy);
            if (coffeeMachine.getWater() <= 200) {
                return;
            }
            if (coffeeMachine.getMilk() <= 100) {
                return;
            }
            if (coffeeMachine.getCoffee() <= 12) {
                return;
            }
            if (coffeeMachine.getCups() <= 1) {
                return;
            }
            coffeeMachine.setWater(coffeeMachine.getWater() - 200);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - 100);
            coffeeMachine.setCoffee(coffeeMachine.getCoffee() - 12);
            coffeeMachine.setCups(coffeeMachine.getCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 6);
            System.out.println("I have enough resources, making you a coffee!");
        }


    }

    private static boolean calculate(CoffeeMachine coffeeMachine, int product) {
        if (product == 1) {
            if (coffeeMachine.water < 250) {
                System.out.println("Sorry, not enough water!");
                return false;
            }
            if (coffeeMachine.coffee < 16) {
                System.out.println("Sorry, not enough coffee!");
                return false;
            }
            if (coffeeMachine.cups < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }


        if (product == 2) {
            if (coffeeMachine.water < 350) {
                System.out.println("Sorry, not enough water!");
                return false;
            }
            if (coffeeMachine.milk < 75) {
                System.out.println("Sorry, not enough milk!");
                return false;
            }
            if (coffeeMachine.coffee < 20) {
                System.out.println("Sorry, not enough coffee!");
                return false;
            }
            if (coffeeMachine.cups < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }
        if (product == 3) {
            if (coffeeMachine.water < 200) {
                System.out.println("Sorry, not enough water!");
                return false;

            }
            if (coffeeMachine.milk < 100) {
                System.out.println("Sorry, not enough milk!");
                return false;
            }
            if (coffeeMachine.coffee < 12) {
                System.out.println("Sorry, not enough coffee!");
                return false;
            }
            if (coffeeMachine.cups < 1) {
                System.out.println("Sorry, not enough cups!");
                return false;
            }
        }
        return true;

    }

    private static void fill(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int waterAdd = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milkAdd = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int coffeeAdd = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        int cupsAdd = scanner.nextInt();

        coffeeMachine.setWater(coffeeMachine.getWater() + waterAdd);
        coffeeMachine.setMilk(coffeeMachine.getMilk() + milkAdd);
        coffeeMachine.setCoffee(coffeeMachine.getCoffee() + coffeeAdd);
        coffeeMachine.setCups(coffeeMachine.getCups() + cupsAdd);
    }

    private static void take(CoffeeMachine coffeeMachine) {
        System.out.println("I gave you " + "$" + (coffeeMachine.money) + " of money");
        coffeeMachine.setMoney(0);
    }
}




