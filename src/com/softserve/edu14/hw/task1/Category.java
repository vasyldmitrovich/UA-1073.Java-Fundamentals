package com.softserve.edu14.hw.task1;

public enum Category {
    TOY("Toy"), PHONE("Phone"), COMPUTER("Computer"), BOOK("Book"),
    CLOTHING("Clothing"), ELECTRONICS("Electronics"), FOOD("Food"), JEWELRY("Jewelry");

    final String category;

    Category(String category) {
        this.category = category;
    }
}
