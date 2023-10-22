package hw2;

import java.util.Scanner;
class Main2 {

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);//declaring user input
            String name, adress; //initializing variables

            System.out.println("What is your name?");
            name = scan.nextLine();

            System.out.println("Where do you live, " + name + " ?");
            adress = scan.nextLine();

            System.out.println(name + ", your adress is: " + adress);
        }
    }
}