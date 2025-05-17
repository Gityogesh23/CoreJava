
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//Consumer<T>interface represents an operation that accepts a single input argument and
//returns no result(void).It's useful for performing actions on
//elements of a collection without modifying the collection itself.
//functional interface demo
public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
      //Consumer to print each number 
    Consumer<Integer>prisntNumber=num->System.out.println("Numbers :" +num);
    
    System.out.println("Printing each number:");
    numbers.forEach(printNumber);

// Consumer to print the square of each number
Consumer<Integer>printSquare=num -> System.out.println("Square of " +num+ (num*num));    

System.out.println("/Printing the square of each number: ");
numbers.forEach(printSquare);
//chaining Consumers using andThen()
Consumer<Integer>printAndThenSquare=printNumber.andThen(printSquare);
     
System.out.println("\nPrinting number and then its square:");
        numbers.forEach(printAndThenSquare);
    }

}
