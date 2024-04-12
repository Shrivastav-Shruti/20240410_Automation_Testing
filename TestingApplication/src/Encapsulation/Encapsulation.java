package Encapsulation;

// Address class encapsulates the details of an address
class Address {
    // Private variables to encapsulate address details
    private String street;
    private String city;
    private String zipCode;

    // Constructor to initialize address details
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Overloaded constructor with only street and city
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getter and setter methods for accessing and modifying address details
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Override toString method to provide a string representation of the address
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

// Person class encapsulates the details of a person
class Person {
    // Private variables to encapsulate person details
    private String name;
    private int age;
    private Address address;

    // Constructor to initialize person details
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Overloaded constructor with only name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overloaded constructor with only name
    public Person(String name) {
        this.name = name;
    }

    // Getter and setter methods for accessing and modifying person details
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Ensuring age is non-negative
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Override toString method to provide a string representation of the person
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

// Main class to demonstrate encapsulation
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an address object
        Address address = new Address("123 Main St", "Cityville", "12345");

        // Creating a person object with the address object
        Person person = new Person("John", 30, address);

        // Accessing and modifying encapsulated data
        System.out.println("Original Person Details:");
        System.out.println(person);

        // Modifying person's details
        person.setName("Jane");
        person.setAge(35);
        person.getAddress().setCity("Townsville");

        System.out.println("\nModified Person Details:");
        System.out.println(person);
    }
}
