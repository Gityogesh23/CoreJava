import java.util.Scanner;
class SwapThree{
    public static void SwapThreeNum(int a,int b){
        //without third variable
        //let a=1,b=2=>how itcan be a=2 and b=1
        //a=a+b;//b=a-b;//b=a-b
        System.out.print("before swap : "+a+" "+b+" "+c);
        // a=a+b;
        // b=a-b;
        // a=a-b;
     System.out.println(" After swap :"+a+" "+b+" "+c);
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println();
int b=sc.nextInt();
int c=sc.nextInt();
 SwapThreeNum(a,b,c);
}
} 