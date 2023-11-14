package com.softserve.edu13.hw;

@FunctionalInterface
interface Encryption {

    String algorithm(String string, int moves);
}
