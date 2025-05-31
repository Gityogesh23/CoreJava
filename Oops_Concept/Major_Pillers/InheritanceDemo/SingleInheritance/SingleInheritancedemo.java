// Parent Class (Superclass)
class Animal {
    private int no_of_legs;
    private String name; // Fixed typo "Animal name :" in disp()

    // No-argument constructor for Animal
    public Animal() {
        System.out.println("Animal no-arg constructor called.");
        this.no_of_legs = 0; // Default value
        this.name = "Unknown Animal"; // Default value
    }

    // Parameterized constructor for Animal
    public Animal(int no_of_legs, String name) {
        System.out.println("Animal parameterized constructor called.");
        this.no_of_legs = no_of_legs;
        this.name = name;
    }

    // Method to display Animal properties
    public void disp() {
        System.out.println("Animal Legs are: " + this.no_of_legs + ", Animal Name: " + this.name);
    }
}

// Child Class (Subclass) - Now a separate top-level class extending Animal
class Cat extends Animal {
    private String breed;

    // Cat's no-argument constructor
    public Cat() {
        super(); // Calls Animal's no-arg constructor implicitly or explicitly.
                 // It's good practice to be explicit if you want to be clear.
        this.breed = "Domestic"; // Default breed for a no-arg Cat
        System.out.println("Cat no-arg constructor called.");
    }

    // Cat's parameterized constructor (to initialize both Animal and Cat specific properties)
    public Cat(String breed, int no_of_legs, String name) {
        super(no_of_legs, name); // Calls Animal's parameterized constructor
        this.breed = breed;
        System.out.println("Cat parameterized constructor called.");
    }

    // Method to display Cat's specific details, also leveraging inherited disp()
    public void displayCatDetails() {
        disp(); // Calls the inherited disp() method from Animal
        System.out.println("Cat Breed: " + this.breed);
    }
}

public class SingleInheritancedemo {

    // Static block - executed when the class is loaded, before main method
    static {
        System.out.println("Inside static block, executed when SingleInheritancedemo class is loaded.");
    }

    public static void main(String[] args) {

        System.out.println("\n--- Creating an Animal object ---");
        Animal generalAnimal = new Animal(4, "Lion");
        generalAnimal.disp();

        System.out.println("\n--- Creating a Cat object (using no-arg constructor) ---");
        Cat domesticCat = new Cat(); // Calls Cat's no-arg constructor
        domesticCat.displayCatDetails(); // Displays both Animal and Cat details

        System.out.println("\n--- Creating another Cat object (using parameterized constructor) ---");
        Cat persianCat = new Cat("Persian", 4, "Whiskers"); // Calls Cat's parameterized constructor
        persianCat.displayCatDetails(); // Displays both Animal and Cat details

        // Demonstrating that a Cat object is also an Animal
        System.out.println("\n--- Cat object treated as an Animal ---");
        Animal animalReferenceToCat = new Cat("Siamese", 4, "Shadow");
        animalReferenceToCat.disp(); // This will call Animal's disp() method
    }
}