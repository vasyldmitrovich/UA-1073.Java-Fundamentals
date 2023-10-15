package com.softserve.edu06.hw.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            String type = bird.getClass().getSimpleName();
            String canFly = bird instanceof FlyingBird ? "літаючий птах, він літає." : "птах, який не літає.";
            String feathersInfo = bird.hasFeathers() ? "має пір'я" : "не має пір'я";
            String layEggsInfo = bird.laysEggs() ? "відкладає яйця" : "не відкладає яйця";
            System.out.println(type + " - " + canFly);
            System.out.println(type + " " + feathersInfo + " і " + layEggsInfo);
        }
    }

}




