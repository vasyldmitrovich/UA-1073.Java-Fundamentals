package com.softserve.edu06.downloadfromsoftserve.rectangle;

//slide 10
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 42;
        rectangle.height = 74;

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.width = 42;   // inherit from Rectangle
        parallelogram.height = 74;  // inherit from Rectangle
        //parallelogram.angle = 35; //compile error
        parallelogram.setAngle(35);

        int perimeter = parallelogram.getPerimeter(); // inherit from Rectangle
        int area = parallelogram.getArea();

        System.out.println("Perimeter of parallelogram equals " + perimeter);
        System.out.println("Area of parallelogram equals " + area);
    }
}
