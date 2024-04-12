package Polymorphism;

//Parent class
class Animal {
  // Protected access specifier allows the member to be accessed within the same package or by subclasses
  protected String name;

  // Constructor
  public Animal(String name) {
      this.name = name;
  }

  // Public method to make a sound
  public void makeSound() {
      System.out.println("Animal makes a sound");
  }

  // Public method to eat without parameters
  public void eat() {
      System.out.println("Animal eats");
  }

  // Public method to eat with a parameter
  public void eat(String food) {
      System.out.println("Animal eats " + food);
  }
}

//Child class inheriting from Animal class
class Dog extends Animal {
  // Constructor
  public Dog(String name) {
      // Calling the constructor of the parent class
      super(name);
  }

  // Method overriding
  @Override
  public void makeSound() {
      System.out.println("Dog barks");
  }

  // Method overloading
  public void eat(String food) {
      System.out.println("Dog eats " + food);
  }
}

//Child class inheriting from Animal class
class Cat extends Animal {
  // Constructor
  public Cat(String name) {
      // Calling the constructor of the parent class
      super(name);
  }

  // Method overriding
  @Override
  public void makeSound() {
      System.out.println("Cat meows");
  }
}

//Main class to demonstrate polymorphism
public class Polymorphism {
  public static void main(String[] args) {
      // Creating objects of different animal types
      Animal animal1 = new Dog("Buddy");
      Animal animal2 = new Cat("Whiskers");

      // Invoking overridden methods
      animal1.makeSound(); 
      animal2.makeSound(); 

      // Invoking method without parameters
      animal1.eat(); 

      // Invoking method with a parameter
      animal1.eat("bones");
  }
}
