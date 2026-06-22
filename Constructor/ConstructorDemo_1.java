// package Constructor;
/* 
flow of below program-->

new Child()
      ↓
Parent Constructor
      ↓
show()
      ↓
Child.show()
      ↓
x not initialized yet
      ↓
default value = 0
*/
//Interview Que demo-1
class Parent {

    Parent() {
        show();
    }

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    int x = 100;

    @Override
    void show() {
       // int x = 100;
        System.out.println(x);//Not initialized hence prints default value of x=0;
    }
    //System.out.println(x);
}

public class ConstructorDemo_1{
    public static void main(String[] args) {

        Parent p = new Child();
      //  p.show();
    }
}