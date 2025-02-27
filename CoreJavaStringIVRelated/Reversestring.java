import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");     
    String str=sc.nextLine();
    String rstr=" ";//initialize rstr

    for(int i=str.length()-1;i>=0;i--){
         rstr=rstr+str.charAt(i);
       
    }
    System.out.println(""+rstr+"");

}
}