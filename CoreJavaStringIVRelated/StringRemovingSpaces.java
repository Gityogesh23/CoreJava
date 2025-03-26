import java.util.Scanner;

public class StringRemovingSpaces {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the String With spaces: ");
        String str=sc.nextLine();
        String str1=str.replaceAll("\\s+",""); //removing spaces
        System.out.println("String after removing all the white spaces : " + str1);    
        }
        catch(Exception e){
            System.out.println("input ,mismatch Exception");
           
            sc.close();
        }
    }
}
