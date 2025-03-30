/*convert Array TO String=>
An array can be converted to a string in four different ways such as Arrays.
toString() method, String.Join() method, StringBuilder.append() method, and 
Collectors.joining() method. Here, we will see an example of the Array.toString()
method. Arrays.toString() returns a string representation of the array contents.
The string represents the array's elements as a list, enclosed in square 
brackets ("[]"). The characters ", " (a comma) followed by a space are used
to separate adjacent elements. It returns “null” if the array is null.
*/
import java.util.Scanner;
public class ConvertArrayToString {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Array Of String Size: ");
    int size=sc.nextInt();
    sc.nextLine();
    String[]StrArray=new String[size]; //storing strings hence Type String
    System.out.println("enter strings inside Array: ");
    for(int i=0;i<StrArray.length;i++){
        StrArray[i]=sc.nextLine();
        
    }
    for(int i=0;i<StrArray.length;i++){
    System.out.print("  "+StrArray[i]);
    }
 }
}
