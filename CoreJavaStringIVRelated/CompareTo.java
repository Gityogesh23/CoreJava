import java.util.Scanner;
class CompareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter second String:");
        String str2 = sc.nextLine();
        
        // Check for null or empty strings
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Strings should not be empty");
            return;
        }
        
        // Remove non-alphanumeric characters (fixed regex)
        str1 = str1.replaceAll("[^A-Za-z0-9]", "");
        str2 = str2.replaceAll("[^A-Za-z0-9]", "");
        
        // Case-insensitive comparison
        int result = str1.toLowerCase().compareTo(str2.toLowerCase());
        
        if (result > 0) {
            System.out.println("First string is greater than second string");
        } else if (result < 0) {
            System.out.println("First string is less than second string");
        } else {
            System.out.println("Both strings are equal");
        }
        sc.close();
    }
}