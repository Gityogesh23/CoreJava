import java.util.Scanner;


public class GreatestNum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number num1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the Number num2 :");
        int num2=sc.nextInt();
        int result=0;
        if(num1==num2){
            System.out.println("numbers are equal");
        }
        else{
        System.out.println(result=num1>num2 ? num1:num2);
        System.out.println("Greatest Number Become: "+result);
        }
    }
}
