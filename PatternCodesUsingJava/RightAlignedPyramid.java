//package PatternCodesUsingJava;
/*
        *
      * *
    * * *
  * * * *
* * * * *
 */

public class RightAlignedPyramid {
    public static void main(String[] args) {
        int rows=6;
        for(int i=0;i<rows;i++){
           for(int j=2*(rows-i);j>=0;j--){  //instead of this line we can also write
      //for(int j=0;j<(rows-i-1);j++{}) and next
      //must give two spaces in print of next statement for proper output
      //otherwise it wil gives pyramid only or triangle shape
      //refer Triangle.java
            System.out.print(" "); //to print space between two stars//imp line
           }
           for(int j=0;j<=i;j++){
            
            System.out.print("* ");//space after * also imp
           }
           System.out.println("");
           }
        }
    }

    