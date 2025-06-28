import java.util.Arrays;
//String anagram using simple method then with map and filter
import java.util.Scanner;
public class StringAnagram {
    public static boolean isAnagram(String str1,String str2){

         //remove spaces and convert into lowecase 

    str1=str1.replaceAll("\\s","").toLowerCase();
    str2= str2.replaceAll("\\s","").toLowerCase();
 /*
 we can also use=>
 public String replaceAll(String regex, String replacement) 
 ex.str1=str1.replceAll([^A-Za-z0-9],"");
 str2=str2.replaceAll([^A-za-z0-9],"");
*/
        //convert to character array
        char[]sArray1=str1.toCharArray();
        char[] sArray2=str2.toCharArray();
        //java.util.Arrays
        Arrays.sort(sArray1);
        Arrays.sort(sArray2);
        return Arrays.equals(sArray1,sArray2);
    }
    public static void main(String[]args){
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String one");
        String str1= sc.nextLine();
        System.out.println("Enter the String two");
        String str2=sc.nextLine();   
       boolean result=isAnagram(str1,str2);
     if(result){
        System.out.println("string is anagram");
     }else{
        System.out.println("string is not  anagram");
     }
        }catch(Exception e){
            System.out.println("input mismatch exception");
        }
    }
}
