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


/* 
import java.util.TreeSet;

public class FindSecondHighest {
    public static void main(String[] args) {
        
    
        int[] arr = {10, 20, 40, 50, 50, 30};

    TreeSet<Integer>set=new TreeSet<>();
    
    for(int num:arr){
        set.add(num);
     }
     set.pollLast();//to remove highest 
     System.out.println("Second highest: " + set.last());

   }
}
*/