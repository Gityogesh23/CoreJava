import java.util.Scanner;
/*
 1)by using ternary operator=>
 (condition)?(if true:Action):(if false:Action)
 ex.result=num1>num2 ? num1:num2
 2)by using if-else=>if not given below=>its if(num1>num2)=>then num1 else num2 is greater 
 
 3)math.max();
 */
/*
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
*/
class GreatestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number num1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the Number num2 :");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("numbers are equal");
        }
        else{
        System.out.println(Math.max(num1,num2)+" "+ "is greater");
        }
    }
}