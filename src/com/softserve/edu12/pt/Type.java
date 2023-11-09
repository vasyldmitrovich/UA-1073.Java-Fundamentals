package com.softserve.edu12.pt;

enum Type {
    HERB(1, 2),
    TREE(2, 150),
    CLIMBER(5, 27),
    SHRUB(1, 5),
    CREEPER(1, 7);

    private final int min;
    private final int max;

    Type(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
