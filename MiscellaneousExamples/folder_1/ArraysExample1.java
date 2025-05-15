import java.util.Arrays;
import java.util.List;
public class ArraysExample1 {
    public static void main(String[] args){
       // List<Integer>numbers=Arrays.asList(1,2,3);
//Arrays.asList(T...a);creates immutable list 
//i.e.In which we r able to set an element inside existing list but not able to add elements.
//instead you shuld go with List.of()       
List<Integer>numbers=List.of(1,2,3,4,5,6,7,8,9);
     //List.of(T ...e);==>does't allowing to add or set the element into list.   
        try{
            numbers.add(10);
        }catch(Exception e){
            System.out.println("exception while adding number");
        }
        try{                   
            numbers.set(2,20);
        }catch(Exception e){
            System.out.println("exception while setting number");

        }
    }
}
