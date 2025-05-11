
class Employee {
    private String name;
    private int empid;

    public Employee() {}

    public Employee(String name, int empid) {
        this.name = name;
        this.empid = empid;
    }

    public void show() {
        System.out.println("inside show of Employee");
    }
}


class Developer extends Employee {
    public void see() {
        System.out.println("developer do coding.");
    }
}

public class Main {
    public static void main(String[] args) {
        // ✅ Upcasting: Developer object as Employee reference
        Employee emp = new Developer();

        // ✅ Downcasting: Back to Developer
        Developer d = (Developer) emp;

        emp.show();    // Accessible via Employee reference
        d.see();       // Works after downcasting
        d.show();      // Inherited method, also works
    }
}
