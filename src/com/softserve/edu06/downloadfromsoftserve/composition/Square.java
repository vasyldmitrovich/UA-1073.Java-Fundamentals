package com.softserve.edu06.downloadfromsoftserve.composition;

class Square {
    private Point point;
    private int side;

    public Square(Point point, int side) {
        this.point = point;
        this.side = side;
    }
}

class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(new Point(74, 38), 26);
    }
}