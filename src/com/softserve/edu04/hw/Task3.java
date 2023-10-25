package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number HTTPError: ");
        int number = scanner.nextInt();
        int name;
        System.out.println("HTTPError name: ");

    }
}

enum Name {//Not here, should be on file Name.java, and another enum the same rule
    BadRequest, Unauthorized, PaymentRequired;
}

enum Number {
    _400(Name.BadRequest),
    _401(Name.Unauthorized),
    _402(Name.PaymentRequired);
    final Name name;

    Number(Name name) {
        this.name = name;
    }

}