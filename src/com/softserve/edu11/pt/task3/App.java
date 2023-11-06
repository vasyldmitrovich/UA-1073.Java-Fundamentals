package com.softserve.edu11.pt.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            var name = scanner.nextLine();
            if (validName(name)){
                System.out.println("The name '" + name + "' is valid");
            }else {
                System.out.println("The name '" + name + "' isnt valid");
            }
        }
    }
    public static boolean validName (String name){
        return name.matches("\\w{3,15}");
    }
}
