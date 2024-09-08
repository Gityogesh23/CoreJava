//package CoreJavaConcepts.Strictfp;

public class StrictfpExample {
    // Java program to illustrate strictfp modifier
// Usage in Classes

// Main class


    // Method 1
    // Calculating sum using strictfp modifier
    public strictfp double sum()
    {

        double num1 = 10e+10;
        double num2 = 6e+08;

        // Returning the sum
        return (num1 + num2);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class in main() method
        StrictfpExample t = new StrictfpExample();

        // Here we have error of putting strictfp and
        // error is not found public static void main method
        System.out.println(t.sum());
    }
}

// output:1.006E11