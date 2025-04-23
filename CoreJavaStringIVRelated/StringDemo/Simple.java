//package StringDemo;

public class Simple {
    public static void main(String[] args){
    //creating String with string literal
    String s1="Yogesh";
    //creating character array of string
    char[] ch= {'K','I','R','A','N'} ;

    //converting char array to string
    String s2=new String(ch);

    //converting String into character array
    char[] s3=s1.toCharArray();  //String s1="Yogesh";

    }
    System.out.println("string is ");
    //creating Java string using new creating
    String s4=new String("Satodkar");

    System.out.println(" string s1 :" +s1);
    System.out.println("string s2: "+s2.toString());  //[C@63e31ee
    System.out.println("string s3: "+s3.toString());
    System.out.println();
    System.out.println("string s4: "+s4);


  }
