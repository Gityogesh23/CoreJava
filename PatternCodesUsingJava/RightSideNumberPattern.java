import java.util.Scanner;
public class RightSideNumberPattern {
    public static void printpattern(int n){
            
            for(int i=1;i<n;i++){  //for rows
                for(int j=1;j<=i;j++){//for columns
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit till you wan to print the pattern.");
        int n=sc.nextInt();
        System.out.println(); //to see good output =>for space between input and output
       printpattern(n);
    }
}
