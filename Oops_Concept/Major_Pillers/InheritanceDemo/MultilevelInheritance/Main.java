// Main.java
// This file demonstrates multilevel inheritance in Java within a single file,
// including the ElectricCar class and its hierarchy.

import java.time.Year; // For getting the current year dynamically

// ---
// Level 1: Base Class (Grandparent) - Vehicle
// Represents the most general concept of a vehicle.
// ---
class Vehicle {
    // Attributes (instance variables)
    private String make;
    private String modelName;
    private int year; // Year of manufacture
    private double basePrice;

    // Constructor
    public Vehicle(String make, String modelName, int year, double basePrice) {
        this.make = make;
        this.modelName = modelName;
        this.year = year;
        this.basePrice = basePrice;
    }

    // Public methods (behaviors)
    public void displayInfo() {
        System.out.println("--- Vehicle Information ---");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.modelName);
        System.out.println("Year: " + this.year);
        System.out.printf("Base Price: $%,.2f%n", this.basePrice);
    }

    public double calculateDepreciation(int currentYear, double depreciationRate) {
        if (currentYear < this.year) {
            return this.basePrice; // Future model, no depreciation yet
        }
        int age = currentYear - this.year;
        double currentValue = this.basePrice * Math.pow((1 - depreciationRate), age);
        return Math.max(0, currentValue); // Value doesn't go below zero
    }

    // --- Getters (Good practice for accessing private attributes) ---
    public String getMake() {
        return make;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

// ---
// Level 2: Intermediate Class (Parent) - Car
// Inherits from Vehicle. Represents a passenger car.
// ---
class Car extends Vehicle {
    // Car-specific attributes
    private int numDoors;
    private String bodyType; // e.g., Sedan, SUV, Hatchback, Coupe

    // Constructor
    public Car(String make, String modelName, int year, double basePrice, int numDoors, String bodyType) {
        // Call the constructor of the superclass (Vehicle)
        super(make, modelName, year, basePrice);
        this.numDoors = numDoors;
        this.bodyType = bodyType;
    }

    // Override Vehicle's displayInfo method
    @Override // Good practice to use @Override annotation
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Vehicle)
        System.out.println("Doors: " + this.numDoors);
        System.out.println("Body Type: " + this.bodyType);
    }

    // Car-specific method
    public void activateSportMode() {
        System.out.println(getMake() + " " + getModelName() + " activating sport mode! Engine response enhanced.");
    }

    // --- Getters ---
    public int getNumDoors() {
        return numDoors;
    }

    public String getBodyType() {
        return bodyType;
    }
}

// ---
// Level 3: Derived Class (Child) - ElectricCar
// Inherits from Car. Represents a specific type of car: an electric car.
// This is the class you provided.
// ---
class ElectricCar extends Car { // 'extends' Car, forming the multilevel chain
    // ElectricCar-specific attributes
    private double batteryCapacityKWH;
    private int rangeKM;
    private double chargeLevelPercent; // Current charge level (0-100)

    // Constructor
    public ElectricCar(String make, String modelName, int year, double basePrice, int numDoors, String bodyType,
                       double batteryCapacityKWH, int rangeKM) {
        // Call the constructor of the immediate superclass (Car)
        super(make, modelName, year, basePrice, numDoors, bodyType);
        this.batteryCapacityKWH = batteryCapacityKWH;
        this.rangeKM = rangeKM;
        this.chargeLevelPercent = 100.0; // Initial charge is full
    }

    // Override Car's displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Car)
        System.out.println("Battery Capacity: " + this.batteryCapacityKWH + " kWh");
        System.out.println("Range: " + this.rangeKM + " km");
        System.out.printf("Current Charge: %.1f%%%n", this.chargeLevelPercent);
    }

    // Override Car's activateSportMode method
    @Override
    public void activateSportMode() {
        System.out.println(getMake() + " " + getModelName() + " activating electric sport mode! Instant torque delivery.");
    }

    // ElectricCar-specific method
    public void chargeBattery(double kwhToAdd) {
        if (this.chargeLevelPercent < 100.0) {
            double chargeIncrease = (kwhToAdd / batteryCapacityKWH) * 100;
            this.chargeLevelPercent = Math.min(100.0, this.chargeLevelPercent + chargeIncrease);
            System.out.printf("%s %s charging. Current charge: %.1f%%%n", getMake(), getModelName(), this.chargeLevelPercent);
        } else {
            System.out.println(getMake() + " " + getModelName() + " battery already full.");
        }
    }

    // --- Getters ---
    public double getBatteryCapacityKWH() {
        return batteryCapacityKWH;
    }

    public int getRangeKM() {
        return rangeKM;
    }

    public double getChargeLevelPercent() {
        return chargeLevelPercent;
    }

    // --- Setters (optional, if you need to modify charge level externally) ---
    public void setChargeLevelPercent(double chargeLevelPercent) {
        this.chargeLevelPercent = Math.max(0, Math.min(100, chargeLevelPercent));
    }
}

// ---
// Main Class for Demonstration
// This class contains the main method to create objects and demonstrate the
// multilevel inheritance hierarchy.
// ---
public class Main {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue(); // Gets the current year dynamically

        System.out.println("--- Demonstrating Vehicle Class ---");
        Vehicle generalVehicle = new Vehicle("Boeing", "747", 1970, 400_000_000.00);
        generalVehicle.displayInfo();
        // Calculate depreciation for 2 years into the future from currentYear
        System.out.printf("Estimated %d Value: $%,.2f%n", currentYear + 2, generalVehicle.calculateDepreciation(currentYear + 2, 0.15));
        System.out.println(); // Newline for better readability

        System.out.println("\n--- Demonstrating Car Class ---");
        Car sedan = new Car("AutoCorp", "Model X", 2022, 35000.00, 4, "Sedan");
        sedan.displayInfo();
        sedan.activateSportMode();
        System.out.printf("Estimated %d Value: $%,.2f%n", currentYear + 2, sedan.calculateDepreciation(currentYear + 2, 0.15));
        System.out.println(); // Newline

        System.out.println("\n--- Demonstrating ElectricCar Class ---");
        ElectricCar evSUV = new ElectricCar("AutoCorp", "ElectroGlide", 2023, 60000.00, 5, "SUV", 75.0, 450);
        evSUV.displayInfo();
        evSUV.activateSportMode(); // Calls ElectricCar's overridden method
        evSUV.chargeBattery(20.0); // Simulate adding 20 kWh
        evSUV.chargeBattery(100.0); // Try to overcharge
        System.out.printf("Estimated %d Value: $%,.2f%n", currentYear + 2, evSUV.calculateDepreciation(currentYear + 2, 0.15));
        System.out.println(); // Newline

        System.out.println("\n--- Another ElectricCar Example ---");
        ElectricCar evHatch = new ElectricCar("AutoCorp", "SparkEV", 2024, 32000.00, 5, "Hatchback", 50.0, 300);
        evHatch.setChargeLevelPercent(50.0); // Set initial charge lower for demo
        evHatch.displayInfo();
        evHatch.chargeBattery(15.0);
        System.out.printf("Estimated %d Value: $%,.2f%n", currentYear + 2, evHatch.calculateDepreciation(currentYear + 2, 0.15));
    }
}