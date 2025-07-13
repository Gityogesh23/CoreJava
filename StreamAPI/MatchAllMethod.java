import java.util.Arrays;
import java.util.List;

public class MatchAllMethod {
    
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,45,67,87,99,00,123);
        boolean isNumbers=l.stream().distinct().allMatch(s->!(s / 2==0));
        System.out.println("All are numbers greater than 00 "+isNumbers);
    }
}
/*
A) allMatch()
The allMatch() method evaluates whether all elements in the stream satisfy a specified 
predicate. It returns true if all elements match the predicate, and false otherwise. 
The predicate is an inline lambda expression or a method reference that takes an element 
of the stream as its argument and returns a boolean value. If the stream is empty, 
allMatch() returns true. 
*/