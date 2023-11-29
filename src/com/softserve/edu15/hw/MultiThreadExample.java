package com.softserve.edu15.hw;

public class MultiThreadExample {

    public static void main(String[] args) {
        // Створення об'єктів для повідомлень
        messagePrinter printer1 = new messagePrinter("Потік 1: Привіт!");
        messagePrinter printer2 = new messagePrinter("Потік 2: Привіт ще раз!");
        messagePrinter printer3 = new messagePrinter("Потік 3: Привіт в останній раз!");

        // Створення потоків
        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        Thread thread3 = new Thread(printer3);

        // Запуск потоків
        thread1.start();
        thread2.start();

        try {
            // Очікуємо завершення роботи перших двох потоків
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Запуск третього потоку після завершення перших двох
        thread3.start();
    }
}

class MessagePrinter implements Runnable {
    private String message;

    public MessagePrinter(String message) {
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