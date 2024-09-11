public class Static_1 {
   //Java Program to demonstrate the use of static variable  
 
    int rollno;//instance variable  
    String name;  
    static String college ="ITS";//static variable  
    //constructor  
    Static_1(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 
 //Test class to show the values of objects  
   public static void main(String args[]){  
   Static_1 s1 = new Static_1(111,"Karan");  
   Static_1  s2 = new Static_1(222,"Aryan");  
  //we can change the college of all objects by the single line of code  
  //Student.college="BBDIT";  
  s1.display();  
  s2.display();  
   
  }  
 } 
 //Test it Now
 //Output:
 
 //111 Karan ITS
 //222 Aryan ITS;
    