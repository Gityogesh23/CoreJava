
import java.util.Scanner;
public class LowerToUpperAndViceVersa {   
    public static void convertTo(String str1){
    str1=str1.replaceAll("[^A-Za-z0-9]",""); 
    StringBuilder  sbr=new StringBuilder(str1);
     for(int i=0;i<str1.length();i++){
         //check for lowercase
         if(Character.isLowerCase(str1.charAt(i))){
             //coverting to uppecase
          sbr.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
         }
         //chk for Uppecase then convert to lowercase
         else if(Character.isUpperCase(str1.charAt(i))) {
             //coverting to lowercase
             sbr.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
         }
     }
     System.out.println(" String after case conversion: "+sbr);
      
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        try{
        String str=sc.nextLine();
      
       convertTo(str);
        }
        catch(Exception e){
           System.out.println("input should be in the format of 0,1,2");
        }
        
    }
}