package Inheritance;

//Parent class
class Vehicle {
 // Protected access specifier allows the member to be accessed within the same package or by subclasses
 protected String brand;
 private int year;

 // Constructor
 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 // Public method to display vehicle information
 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + getYear());
 }

 // Overridden method
 public void drive() {
     System.out.println("Vehicle is being driven.");
 }

 // Overloaded method
 public void drive(int speed) {
     System.out.println("Vehicle is being driven at " + speed + " km/h.");
 }

 // Getter method for private member
 public int getYear() {
     return year;
 }
}

//Child class inheriting from Vehicle class
class Car extends Vehicle {
 // Private access specifier restricts access to this variable only within this class
 private String model;

 // Constructor
 public Car(String brand, int year, String model) {
     // Calling the constructor of the parent class
     super(brand, year);
     this.model = model;
 }

 // Public method to display car information
 public void displayCarInfo() {
     // Accessing protected member of the parent class
     System.out.println("Brand: " + brand);
     // Accessing private member of the parent class indirectly using a method
     System.out.println("Year: " + getYear());
     System.out.println("Model: " + model);
 }

 // Method overriding
 @Override
 public void drive() {
     System.out.println("Car is being driven.");
 }

 // Method overloading
 public void drive(String destination) {
     System.out.println("Car is being driven to " + destination + ".");
 }
}

//Main class to demonstrate inheritance
public class Inheritance {
 public static void main(String[] args) {
     // Create a Car object
     Car car = new Car("Toyota", 2022, "Camry");

     // Accessing inherited method from Vehicle class
     car.displayInfo();

     // Accessing method specific to Car class
     car.displayCarInfo();

     // Method overriding
     car.drive();

     // Method overloading
     car.drive(60);
     car.drive("work");
 }
}
