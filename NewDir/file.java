//hi  

  Class A{
  int n1=10;
  String name="Yogesh";
    void disp(){
      System.out.println("hi All !!");
    }
  }
Class B{
  int n2=11;
  String name2="patil";
  
}
Class Main{
  public static void main(String[] args){
    Class A= new B(); //upcasting
    A.disp();
  }
}
