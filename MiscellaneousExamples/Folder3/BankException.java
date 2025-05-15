/*
Scenario=>write custom exception
*/
public class BankException extends Exception{
    private static int[]accno={100,102,103,104,105};
    private static String[]names={"ajay","kiran","Mangal","Tejas","anita"};
    private static double[]bal={2500.00,11000.00,12000,13000.00};
   
// Constructor for the BankException class
   public  BankException(String msg){
       super(msg);// Call the constructor of the parent Exception class
        
      }
      public static void main(String[] args){

         //main method which are calling the records one by one
         // Example: Accessing the static variables
         try{
         System.out.println("\n names: ");
         for(String n:names){
            System.out.println(n);
         }

         System.out.println("\n numbers ");
         for( int accountNo:accno){
            System.out.println(accountNo);

         }
         System.out.println("\n balance");
         for( double balance:bal){
            System.out.println(balance);

         }

         // Example: Throwing the custom exception
       if(bal[0]<2000){
         throw new BankException("insufficient balance");
       }
         }catch(BankException e){
            System.out.println(" "+e.getMessage());

         }
      }
}
