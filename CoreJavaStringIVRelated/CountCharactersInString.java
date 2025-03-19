import java.util.Scanner;

class CountCharactersInString{
public static void CountCharsInString(String str) {
   
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);\
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
