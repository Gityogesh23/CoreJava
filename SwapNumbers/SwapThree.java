import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

class SwapThree{
    public static List<Integer>swapThree(int n1,int n2,int n3){
        n3=n1+n2+n3;
        n1=n3-(n1+n2);
        n2=n3-(n1+n2);
        n3=n3-(n1+n2);
        return Arrays.asList(n1,n2,n3);
    }
    public static void main(String[] args) {
        int n1 = 0,n2 = 0,n3=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers: "); 
        for(int i=0;i<1;i++){
           n1=sc.nextInt();
           n2=sc.nextInt();
           n3=sc.nextInt();

        }
        System.out.println("Three numbers: "+"num1 = "+n1+",num2 = "+n2+", num3= "+n3);
        List<Integer>number=swapThree(n1,n2,n3);
        System.out.println("numbers After Swapping :");
        System.out.print("num1=  "+number.get(0)+", num2= "+number.get(1)+", num3= "+number.get(2));
    }
}

/* 
class SwapThree{
    public static void SwapThreeNum(int a,int b,int c){
        //without third variable
        //let a=1,b=2=>how itcan be a=2 and b=1
        //a=a+b;//b=a-b;//b=a-b
        System.out.print("before swap : "+a+" "+b+" "+c);
        a=a+b;
        b=a-b;
        a=a-b;
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
*/
/*
 import java.util.Scanner;

class SwapThree {
    public static int[] swapThree(int n1, int n2, int n3) {
        // Rotate the numbers: n1 -> n2, n2 -> n3, n3 -> n1
        int temp = n1;
        n1 = n2;
        n2 = n3;
        n3 = temp;

        return new int[]{n1, n2, n3};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Enter the three numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.println("Before Swap: n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);

        int[] swapped = swapThree(n1, n2, n3);

        System.out.println("After Swap: n1 = " + swapped[0] + ", n2 = " + swapped[1] + ", n3 = " + swapped[2]);
    }
}

 */