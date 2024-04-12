package AccessSpecifier;

public class accesspecifier {
    // Public member variable
    public int publicVar = 10;

    // Private member variable
    private int privateVar = 20;

    // Protected member variable
    protected int protectedVar = 30;

    // Default (package-private) member variable
    int defaultVar = 40;

    // Public method accessing private member
    public void accessPrivateMember() {
        System.out.println("Accessing private member from a public method: " + privateVar);
    }

    // Method to demonstrate accessing members within the same class
    public void accessMembersWithinClass() {
        System.out.println("Inside the class:");
        System.out.println("Public member: " + publicVar);
        System.out.println("Private member: " + privateVar);
        System.out.println("Protected member: " + protectedVar);
        System.out.println("Default (package-private) member: " + defaultVar);
    }

    public static void main(String[] args) {
    	accesspecifier example = new accesspecifier();

        // Accessing public member from outside the class
        System.out.println("Accessing public member from outside the class: " + example.publicVar);

        // Accessing private member through a public method
        example.accessPrivateMember();

        // Accessing protected member from a subclass (for demonstration)
        Subclass subclass = new Subclass();
        subclass.accessProtectedMember();
    }
}

// Subclass to demonstrate accessing protected member
class Subclass extends accesspecifier {
    public void accessProtectedMember() {
        System.out.println("Accessing protected member from a subclass: " + protectedVar);
    }
}

