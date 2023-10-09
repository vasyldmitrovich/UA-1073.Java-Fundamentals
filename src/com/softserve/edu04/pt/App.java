package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(!(3 < 4));
        System.out.println((3 >= 4));
        int a = -23;
        System.out.println(~a);
        System.out.println(-a - 1);
    }
}
class App1 {//Each class write in new file
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(
                a > b ? "a > b" : "a <=b"
        );
    }
}
class App2 {
    public static void main(String[] args) {
        if (32 > 3) {
            System.out.println("2 > 3");
        }
        System.out.println("End");
    }
}
class App3 {
    public static void main(String[] args) {
        int grade = 75;
        if (grade > 90) {
            System.out.println("A");
        }
        else if (grade > 70) {
            System.out.println("B");
        }
        else if (grade > 50) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
/*class Student {
    public static void main(String[] args) {

    }
    String name;
    int age;
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (age != other.age) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }
}*/

//PRACTICAL TASK
class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int counter = 0;
        if (n1 % 2 == 1) counter++;
        if (n2 % 2 == 1) counter++;
        if (n3 % 2 == 1) counter++;
        System.out.println("There are " + counter + " odd numbers in the input");
    }
}



class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week: ");
        String response = scanner.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

    }
}
enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок");//Where another days???
    final String en;
    final String ua;

    DayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}




class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the country name: ");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " belongs to " + country.continent);
    }
}
enum Continent {//Move to file Continent.java
    ASIA, EUROPE, AMERICA;
}
enum Country {//Move to file Country.java
    UKRAINE(Continent.EUROPE),
    USA(Continent.AMERICA);
    final Continent continent;
    Country(Continent continent) {
        this.continent = continent;
    }
}