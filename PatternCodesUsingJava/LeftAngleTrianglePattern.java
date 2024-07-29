
/*
  to print RightAngleTriangle Pattern:
          *
        * *
      * * *
    * * * *
 */
public class LeftAngleTrianglePattern {
	public static void main(String args[]) {
		  int row=6;
		 for(int i=0;i<row;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print("* ");
			}

			System.out.println(" ");
		 }
	}
	
}