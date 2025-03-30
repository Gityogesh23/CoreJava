/*convert Array TO String=>
An array can be converted to a string in four different ways such as Arrays.
toString() method, String.Join() method, StringBuilder.append() method, and 
Collectors.joining() method. Here, we will see an example of the Array.toString()
method. Arrays.toString() returns a string representation of the array contents.
The string represents the array's elements as a list, enclosed in square 
brackets ("[]"). The characters ", " (a comma) followed by a space are used
to separate adjacent elements. It returns “null” if the array is null.
*/

import java.util.Arrays;
import java.util.Scanner;
public class ConvertArrayToString {
    public static String ConvertArrayToString(String[]arr){
          return Arrays.toString(arr);

        }
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Array Of String Size: ");
            int size = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
    
            String[] strArray = new String[size];
    
            System.out.println("Enter strings inside Array: ");
            for (int i = 0; i < strArray.length; i++) {
                strArray[i] = sc.nextLine();
            }
    
            // Print in formatted style: { "str1", "str2", "str3" }
            System.out.print("{ ");
            for (int i = 0; i < strArray.length; i++) {
                System.out.print("\"" + strArray[i] + "\"");
                if (i < strArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" }");
            String str1 = ConvertArrayToString(strArray);
            System.out.println("Converted Array to String: " + str1);
            sc.close();
        }
    }
    