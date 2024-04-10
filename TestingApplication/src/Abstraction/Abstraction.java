package Abstraction;

//Define an interface representing a shape
interface Shape {
 // Abstract method to calculate area
 double calculateArea();
}

//Define an abstract class representing a 2D shape
abstract class TwoDimensionalShape implements Shape {
 // Common properties for 2D shapes
 protected double width;
 protected double height;

 // Constructor
 public TwoDimensionalShape(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Abstract method to calculate perimeter
 public abstract double calculatePerimeter();
}

//Define a concrete class representing a rectangle
class Rectangle extends TwoDimensionalShape {
 // Constructor
 public Rectangle(double width, double height) {
     super(width, height);
 }

 // Override calculateArea method to implement specific logic for rectangle
 @Override
 public double calculateArea() {
     return width * height;
 }

 // Override calculatePerimeter method to implement specific logic for rectangle
 @Override
 public double calculatePerimeter() {
     return 2 * (width + height);
 }
}

//Define a concrete class representing a circle
class Circle implements Shape {
 // Radius of the circle
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Override calculateArea method to implement specific logic for circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Main class to demonstrate abstraction
public class Abstraction {
 public static void main(String[] args) {
     // Create a rectangle object
     Rectangle rectangle = new Rectangle(5, 4);
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

     // Create a circle object
     Circle circle = new Circle(3);
     System.out.println("Circle Area: " + circle.calculateArea());
 }
}
