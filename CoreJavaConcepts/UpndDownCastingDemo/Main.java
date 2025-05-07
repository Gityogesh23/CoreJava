package CoreJavaConcepts.UpndDownCastingDemo;


class Employee{
    private String name;
    private int empid;

    public void Employee(){}
    public void Employee(String name,int id){
        this.name=name;
        this.empid=empid;
    }
    public void show(){
        System.out.println("inside show of Employee");
    }
}
    class Developer extends Employee{

        public void see(){
            System.out.println("developer do coding.");
        }
    }

public class Main {
    public static void main(String[]args){
        Employee emp=new Developer();//Upcasting:converting subtype reference into supertype refernce.
        Developer d=(Developer)emp;//Downcasting:converting superclass reference(which is actually points to subclass obbject)back to subclass refernce.

//To do safe and meaningful downcasting, there must have been an upcast first.
/*
✅ Summary:
Upcasting: Subclass → Superclass ✅ Always safe
Downcasting: Superclass → Subclass ⚠️ Only safe if object is really a subclass
*/
    emp.show();
    // emp.see();//can't work//its subclass specific method in upcasting not possible.
    //or private fields,private methods ,non overridden methods of subclass not allow to access of subclass.
    
    d.see();//works
    d.show();//also works
    }
}
