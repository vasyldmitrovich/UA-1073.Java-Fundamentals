package com.softserve.edu15.hw;

class multithreadexample {

    public static void main(String[] args) {
        messagePrinter printer1 = new messagePrinter("Потік 1: Привіт!");
        messagePrinter printer2 = new messagePrinter("Потік 2: Привіт ще раз!");
        messagePrinter printer3 = new messagePrinter("Потік 3: Привіт в останній раз!");

        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        Thread thread3 = new Thread(printer3);


        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Головний потік завершено.");
    }
}

class messagePrinter implements Runnable {
    private String message;

    public messagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // Виведення повідомлення 5 разів
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                // Затримка для демонстрації конкурентності
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
