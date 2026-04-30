import java.util.Arrays;
//String anagram using simple method then with map and filter
import java.util.Scanner;
public class StringAnagram {
    public static boolean isAnagram(String str1,String str2){

         //remove spaces and convert into lowecase 
    if(str1.isBlank() || str2.isBlank()) return false;
    //Strings in java are immutable but this methohds:replace(),replcaAll(regex,replacement) make it mutable.
    //always assigned it with varaible here str1 itself we assigne else on next line it become as previous.
    str1=str1.replaceAll("[^A-Za-z]","").toLowerCase();
    System.out.println("str1");
    str2= str2.replaceAll("[^A-Za-z]","").toLowerCase();
    System.out.println("str2");
 /*
 we can also use=>
 public String replaceAll(String regex, String replacement) 
 ex.str1=str1.replceAll([^A-Za-z0-9],"");
 str2=str2.replaceAll([^A-za-z0-9],"");
*/
        //convert to character array-->beacsue after that arrays.sort()only applicable on Array 
        //i.e here array of char after this step not on String understood.
        char[]sArray1=str1.toCharArray();  // ['s','t','r','i','n','g']
        char[] sArray2=str2.toCharArray(); // ['t','s','r','i','g','n']
        //java.util.Arrays
        Arrays.sort(sArray1); //['s','t','r','i','n','g']
        Arrays.sort(sArray2); //['s','t','r','i','n','g']
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
    System.out.println((result) ? "Strings are anagram":"string aren't anagram"); 
     
        }catch(Exception e){
            System.out.println("input mismatch exception");
        }
    }
}
// This is well optimised solution -To check Strings are Anagram or Not.