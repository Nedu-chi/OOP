// Abstract base class
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    public void describe() {
        System.out.println("This is a " + name + " with area " + calculateArea());
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        circle.describe();
        rectangle.describe();
    }
}
