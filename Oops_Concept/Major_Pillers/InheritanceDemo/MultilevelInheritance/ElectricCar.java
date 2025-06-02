// ElectricCar.java

public class ElectricCar extends Car { // 'extends' Car, forming the multilevel chain
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