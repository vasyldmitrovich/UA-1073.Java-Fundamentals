package com.softserve.edu07.downloadex;

public class MyType implements Comparable {
    String name;

    public int compareTo(Object obj) {
        return name.compareTo(((MyType) obj).name);
    }
}
