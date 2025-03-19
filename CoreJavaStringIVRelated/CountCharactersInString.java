import java.util.Scanner;

class CountCharactersInString{
public static void CountCharsInString(String str) {
    String str1=str.replaceAll("[^A-Z a-z]"," ");
   int count=0;
  for(int i=0;i<str1.length();i++){
       if(str1.charAt(i)!=' '){   // Exclude spaces, count only characters
        count++;
       }
    }
    System.out.println("Number of characters in the given string excluding space are: " +count);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    try{
    String str=sc.nextLine();
    CountCharsInString(str);
   
}
catch(Exception e){
System.out.println(" enter proper input in string/characters format");
}
finally{
    sc.close();
      }
   }
}
