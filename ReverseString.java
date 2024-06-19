//package CoreJava.IVCodes;

import java.util.Scanner;
public class ReverseString {
    static String str,rstr="";

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter the string  want to reverse: :");
     str=sc.nextLine();
     for(int i=0;i<str.length();i++){
     char ch=str.charAt(i);
     rstr=ch+rstr;
    
    }
    System.out.println("reverse string "+rstr);
    }
  }

