package com.okten.demo.lesson3;

public class Main {

    public static final String CONSTANT = "CONST_VALUE";

    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        Shape rectangle = new Rectangle(5, 10);

        printShapeSquare(circle);
        printShapeSquare(rectangle);

        circle.printArea();
        rectangle.printArea();

        System.out.println(circle.getColor());

        Square square = new Square(5);

        square.printArea();

        AbstractShape shape = new AbstractShape() {
            @Override
            public String getColor() {
                return null;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        System.out.println(shape.getArea());
    }

    private static void printShapeSquare(Shape shape) {
        System.out.println(shape.getArea());
    }
}
