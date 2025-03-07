import java.util.Scanner;

//most efficient and always prefer
//using StringBuilder
public class ConcatString{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Appending another string
        sb.append(" ").append("World");

        System.out.println("Concatenated String: " + sb.toString());
    }
}


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
/*
//second type 
public class ConcatString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using concat() method
        String result = str1.concat(" ").concat(str2);

        System.out.println("Concatenated String: " + result);
    }
}
 */

