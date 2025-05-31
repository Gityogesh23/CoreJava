
//Single Inheritance
class Animal{
    private int no_of_legs;
    private String name;
    Animal(){}
    Animal(int no_of_legs,String name){
        this.no_of_legs=no_of_legs;
        this.name=name;
    }
    public void disp(){
        System.out.println("Inside Animal's Display method");
    }

    class Cat extends Animal{
        String breed;
        Cat(){
        
        }
        Cat(String breed){
            this.breed=breed;
        }
    }
}


public class SingleInheritancedemo {
    
    public static void main(String[] args) {
        
        Animal a=new Animal(4,"indian billi");
        a.disp();
    }
    static {
        System.out.println("inside static block executed first i.e even before object creation");
    }
    
}
