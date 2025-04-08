
public class Employee {
    private String name;
    private int age;
    private double salary;
    private Boolean active;

    public Employee(){
        this.name="";
        this.age=0;
        this.salary=0.0;
        this.active=active;
    }
    //getter-Setter (Accessors and Mutators)
    //getters:Are public methods that retrieves the values of private Property.
    //Setter:public methods that sets/updates the vlaue of private property.
 
    //getter method for name
    public String getName(){
       return  this.name=name;
    }
   // setter method for name
    public void setName(String name){
        if(name!=null && !name.trim().isEmpty()){  //checks name is not null and erasing Leading
                                                   //Leading ND trailing spaces from string ND checks its empty i.e " " or not 
            this.name=name;                                              
        }else{
        throw new IllegalArgumentException("name cannot be Empty");
        }
    }
//getter for age
    public int getAge(){
        return this.age=age;
    }
    
    //Setter for age
    public void setAge(int age){
        if(age>=28 && age<=65){
            this.age=age;
        }else{
            throw new IllegalArgumentException("age must in between 18 And 65");
        }
    }
    //getter for salary
    public double getSalary(){
        return this.salary=salary;
    }
    public void setSalary(double salary){
        if(salary>=0){
        this.salary=salary;
        }else{
            throw new IllegalArgumentException("salary should not be less than negative");
        }
    }    
    // Getter for active status (note the "is" prefix for boolean)
    public boolean isActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active=active;
    }
    // A method that uses the private attributes
    public double calculateYearlySalary(){
        return this.salary*12;
    }

    public static void main(String[]args){
        Employee emp=new Employee();

        try{
            emp.setName("Yogesh");
            emp.setAge(30);
            emp.setSalary(50000);
            emp.setActive(true); //Codenera

            System.out.println("employee details: ");
            System.out.println("Name: " +emp.getName());
            System.out.println("age: " +emp.getAge());
            System.out.println("salary: " +emp.getSalary());
            System.out.println("is Active:"+emp.isActive());
            System.out.println("yearly salary of Employee Rs."+emp.calculateYearlySalary());


             // Testing validation
            // emp.setAge(15); // This would throw an exception

        }catch(IllegalArgumentException e){
            System.out.println(" Error "+e.getMessage());
        }

    }
}

