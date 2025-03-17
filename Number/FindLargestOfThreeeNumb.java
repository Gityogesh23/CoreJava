
import java.util.Scanner;

public class FindLargestOfThreeeNumb {
    int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number: ");
    int num1=sc.nextInt();
    System.out.println("enter the Second number: ");
    int num2=sc.nextInt();
    System.out.println("enter the Third number: ");
    int num3=sc.nextInt();
    
    System.out.println("Greater Number Become: ");
    temp = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
    System.out.println("The largest number is: "+temp); 
}
