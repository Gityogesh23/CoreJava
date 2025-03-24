import java.util.Scanner;
public class Traingle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
       for(int i=0;i<rows;i++){ //to print rows
        for(int j=0;j<(rows-i-1);j++){ //to print spaces
            System.out.print(" ");//if two spaces then it gives rightAlignedPyramid
             
        }
        for(int j=0;j<=i;j++){  //to print *
            System.out.print("* ");
        }
        System.out.println();
       }
      
       sc.close();
    }
}
