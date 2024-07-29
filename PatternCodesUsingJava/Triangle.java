
import java.util.Scanner;
class Triangle{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            
            for(int j=rows-i;j>1;j--){  //for spaces
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){  //to print *
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}