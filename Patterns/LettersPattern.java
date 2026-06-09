/*
1)Print-->
A
A B
A B C
A B C D

*/
import java.util.Scanner;
public class LettersPattern {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          //Represents rows till which output pattern is expected.
          System.out.println("Enter the number :");
          int n=sc.nextInt();
          for(int i=1;i<n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
          }

          
    }
}

/*
Print 2:
A
A B
A B C
A B C D

Logic:
char ch='A';//just put it outside to skip starts from A again-->simple.
 for(int i=1;i<n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
*/