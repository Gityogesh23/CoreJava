package DivideByZeroException;
import java.util.Scanner;
class DivideByZero{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        try{
        
        System.out.println(num/0);
        System.out.println("divide by zero exception Generated");
        }
        catch(Exception e)//catch(ArithmeticException e) as exception is the supertype of unchecked exception hence its ok
        { 
          e.getMessage();
          e.printStackTrace();
         
        }
        finally{
            sc.close();
           }
           System.out.println("divide by zero exception is created .");
     }
    }
     
