
import java.util.Scanner;

public class  SpecificCharRemoving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char chToRemove = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != chToRemove) {
                sb.append(ch);
            }
        }

        System.out.println("Modified String: " + sb.toString());

        sc.close();
    }
}
