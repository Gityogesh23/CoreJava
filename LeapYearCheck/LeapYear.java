
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year=sc.nextInt();
        try{
        if(year<=0){
            System.out.println("Kindly enter positive integer number except zero");
        }

        //if( year %400==0 ){  OR
            if(year%400==0 || (year%4==0 && year%100 !=0)){
            System.out.println("leap year");
        }
        else {
        //(year%4==0 && year%100 !=0 )
            System.out.println("Not a leap year");
        }
      }catch(Exception e){
        System.out.println("Input Mismatch: plz enter vlid input i.e number except 0");
      }
    }
}
