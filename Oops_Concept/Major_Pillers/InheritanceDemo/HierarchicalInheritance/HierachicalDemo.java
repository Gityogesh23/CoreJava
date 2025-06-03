// Base class
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: $" + getSalary());
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;
    private String department;

    public Manager(String name, int id, double salary, int teamSize, String department) {
        super(name, id, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Department: " + department);
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;
    private String project;

    public Developer(String name, int id, double salary, String programmingLanguage, String project) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getProject() {
        return project;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project: " + project);
    }
}

// Subclass: Intern
class Intern extends Employee {
    private int durationMonths;
    private String supervisor;

    public Intern(String name, int id, double salary, int durationMonths, String supervisor) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
        this.supervisor = supervisor;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Internship Duration: " + durationMonths + " months");
        System.out.println("Supervisor: " + supervisor);
    }
}

// Demo class with main method
public class HierachicalDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 95000, 5, "IT");
        Developer developer = new Developer("Bob", 102, 80000, "Java", "Billing System");
        Intern intern = new Intern("Charlie", 103, 20000, 6, "Alice");

        System.out.println("=== Manager Details ===");
        manager.displayInfo();

        System.out.println("\n=== Developer Details ===");
        developer.displayInfo();

        System.out.println("\n=== Intern Details ===");
        intern.displayInfo();
    }
}
