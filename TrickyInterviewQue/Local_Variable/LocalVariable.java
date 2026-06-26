// package TrickyInterviewQue.Local_Variable;

/*
IV Q.
Q: Why must local variables used in lambda expressions be final or effectively final?
Ans:
Local variables are stored on the stack and disappear when the method execution completes. 
A lambda or anonymous class may continue to exist after the method returns. Therefore, 
Java captures a copy of the local variable's value. To avoid inconsistencies between the 
original variable and the captured copy, Java requires the variable to be final or 
effectively final.

public class Test {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 5; i++) {
            count++;
        }

        System.out.println(count); // 5
    }
}
Local variable : variables declared inside Method Only.
Scope: till method execution completes.
Modify further :yes
Accessible :Only after instantiation of class. syntax : obj.variable_name;
Not Accessible : from static reference directly.

Becomes Tricky: With Lambda Expression,Anonymous Inner Class, Local Inner Class -->not modified further

Remember: Local variables are mutable by default. The "effectively final" rule applies
only when they are captured by lambdas, anonymous classes, or local inner classes.
*/
//not modifiable with Lambada ,Anonymous Inner Class,Local Inner Class.
public class LocalVariable {
    public static void main(String[] args) {
        int x=10; //effectively final -->you don't need to write it.
        Runnable r= ()-> {
            System.out.println(x);

        };
        //System.out.println(x++); 
//compile time error->local variables referenced from lambda expression must be final or effectively final
    }
}
/*
The moment you add x++, you are attempting to modify x. This instantly ruins its status 
as "effectively final," and the compiler steps in to stop you from creating a thread-unsafe environment
*/