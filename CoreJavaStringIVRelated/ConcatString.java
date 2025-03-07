import java.util.Scanner;

/*
public class ConcatString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using + operator
        String result = str1 + " " + str2;
        
        System.out.println("Concatenated String: " + result);
    }
}
O/P:
Concatenated String: Hello World
*/

public class ConcatString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using concat() method
        String result = str1.concat(" ").concat(str2);

        System.out.println("Concatenated String: " + result);
    }
}
