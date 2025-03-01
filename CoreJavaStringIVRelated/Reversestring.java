import java.util.Scanner;

/* 

//  This approach creates a new String object in every loop iteration, 
//  which is memory inefficient and slow.
 
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
)
*/

// Java program to reverse a string using backward traversal
//StringBuilder is mutable=>
//meaning it can modify the existing object instead of creating a new one every time.
public class Reversestring {

    public static String revString(String str){
        StringBuilder rstr=new StringBuilder();
        // Traverse on str in backward direction
        // and add each character to a new string
        for(int i=str.length()-1;i>=0;i--){
                rstr.append(str.charAt(i));
        }
        //3. Is it necessary to use StringBuilder?
// No, but it's highly recommended for efficiency.
// You can use String with +=, but it will be slower in large inputs.
 //StringBuilder is not a String,so we need to convert it into a String
 //before returning it.

//rstr.toString() converts the StringBuilder object to a String so that it can be used normally.

        return rstr.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        String rstr=revString(str);//as its static method.eithe call by class name or directly as both are static context=>so that we know through static context we can call static method
        System.out.println("Reverse string become: "+rstr);
    }


}

/*
 // Java program to reverse a string using two pointers

class ReverseString {
    static String revString(String s) {
        int left = 0, right = s.length() - 1;
      
    // Use StringBuilder for mutability
        StringBuilder res = new StringBuilder(s);
      
    // Swap characters from both ends till we reach
    // the middle of the string
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
  
    // Convert StringBuilder back to string
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "yogesh";
        System.out.println(revString(s));
    }
}
 */