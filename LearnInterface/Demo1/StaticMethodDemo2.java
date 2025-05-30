interface MyInterface1 {
    static void disp() {
        System.out.println("Inside display of MyInterface1");
    }
}

interface MyInterface2 {
    static void disp() {
        System.out.println("Inside display of MyInterface2");
    }
}

public class StaticMethodDemo2 implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        // Calling interface static methods using interface name
        MyInterface1.disp();
        MyInterface2.disp();
    }
}
