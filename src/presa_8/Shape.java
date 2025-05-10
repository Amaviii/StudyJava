package presa_8;

import java.util.ArrayList;
import java.util.List;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private final double length;
    private final double width;

    //Конструктор для установки сторон
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}

class Circle implements Shape {
    private final double radius;

    //Конструктор для установки сторон
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private final double base;
    private final double height;

    //Конструктор для установки сторон
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}


class ResultShape {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5.0, 3.0));
        shapes.add(new Circle(2.5));
        shapes.add(new Triangle(4.0, 3.0));

        for (Shape shape : shapes) {
            System.out.printf("%s - : %.2f\n", shape, shape.getArea());
        }
    }
}
