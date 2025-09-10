import java.util.Arrays;
public class FindSecondHighest {
    public static void main(String[] args) {
       int [] arr={12,8,5,6,11,24}; 
       Arrays.sort(arr);
        System.out.println("Second Highest elements is : "+(arr[arr.length-2]));//arr[arr.length]=>return length of arr as simple as that 
        //we are just retrieve the element at index arr[length-2];
    }
}
/*if you are solving this using streams-->
 Comparator instances are commonly used with sorting methods in classes like 
 Arrays.sort(), Collections.sort(), and Java Stream API's sorted() method.
*/



/* 
import java.util.Arrays;
import java.util.Collections;

public class FindSecondHighest {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 40, 50, 50, 30};
        Arrays.sort(arr, Collections.reverseOrder());

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < first) {
                System.out.println("Second highest: " + arr[i]);
                break;
            }
        }
    }
}

*/

/* 
import java.util.TreeSet;

public class FindSecondHighest {
    public static void main(String[] args) {
        
    
        int[] arr = {10, 20, 40, 50, 50, 30};

    TreeSet<Integer>set=new TreeSet<>();
    
    for(int num:arr){
        set.add(num);  //internally Autoboxing takeplace=>Integer.valueOf(num);
     }
     set.pollLast();//to remove highest 
     System.out.println("Second highest: " + set.last());

   }
}
*/