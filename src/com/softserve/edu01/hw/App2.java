package com.softserve.edu01.hw;

import java.util.Scanner;

public class App2 {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("What is your name? ");
            String name = scanner.nextLine();


            System.out.print("Where do you live, " + name + "?");
            String address = scanner.nextLine();

            System.out.println("Name: " + name);
            System.out.println("Address: " + address);

        }
  }

