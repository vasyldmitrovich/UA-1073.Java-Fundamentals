package com.softserve.edu03.hw;

import static com.softserve.edu03.hw.App.SCANNER;

public class TriangleArea {
    private int side1;
    private int side2;
    private int side3;

    public TriangleArea () {
        this(0,0,0);
    }

    public TriangleArea (int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Prompts the user to input the lengths of three sides of a triangle and sets
     * them as the values of the respective fields in the provided TriangleArea object.
     *
     * @param obj A TriangleArea object to store the input side lengths.
     */
    public static void promptParameters(TriangleArea obj) {
        System.out.println("Input side 1: ");
        int side1 = getNumber();
        obj.setSide1(side1);

        System.out.println("Input side 2: ");
        int side2 = getNumber();
        obj.setSide2(side2);

        System.out.println("Input side 3: ");
        int side3 = getNumber();
        obj.setSide3(side3);
    }

    /**
     * Reads an integer from the standard input using the provided SCANNER, and
     * clears the newline character from the input buffer.
     *
     * @return The integer read from the input.
     */
    private static int getNumber () {
        int num = SCANNER.nextInt();
        SCANNER.nextLine();
        return num;
    }

    /**
     * Calculates and returns the semi-perimeter of the triangle, which is half of
     * the sum of its three side lengths.
     *
     * @return The semi-perimeter of the triangle as a double.
     */
    public double getSemiPerimeter() {
        return (side1 + side2 + side3) / 2.0;
    }

    /**
     * Calculates and returns the area of the triangle using Heron's formula, which
     * relies on the semi-perimeter and the lengths of its three sides.
     *
     * @return The area of the triangle as a double.
     */
    public double getArea() {
        double semiPerimeter = getSemiPerimeter();
        double areaSquare = semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);

        return Math.sqrt(areaSquare);
    }

    public int getSide1 () {
        return side1;
    }

    public void setSide1 (int side1) {
        this.side1 = side1;
    }

    public int getSide2 () {
        return side2;
    }

    public void setSide2 (int side2) {
        this.side2 = side2;
    }

    public int getSide3 () {
        return side3;
    }

    public void setSide3 (int side3) {
        this.side3 = side3;
    }
}
