package PatternCodesUsingJava;
/*
        *
      * *
    * * *
  * * * *
* * * * *
 */

public class LeftRightAngleTriangle {
    public static void main(String[] args) {
        int rows=6;
        for(int i=0;i<rows;i++){
           for(int j=2*(rows-i);j>=0;j--){

            System.out.print(" "); //to print space between two stars//imp line
           }
           for(int j=0;j<=i;j++){
            
            System.out.print("* ");//space after * also imp
           }
           System.out.println("");
           }
        }
    }

    