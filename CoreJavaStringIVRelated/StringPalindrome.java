import java.util.Scanner;
class StringPalindrome{
    static String original,revString="";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be reverse");
        original=sc.nextLine();//acceptin string input from user
        int len=original.length();
        for(int i=len-1;i>=0;i--){
            revString=revString+original.charAt(i);

        }
        if(revString.equals(original)){
            System.out.println("String is palinrdrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}