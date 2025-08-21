
//Interview Que-->1 )print an count of elements 2)print count of an duplicate elements only.
/*
 Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
Parameters:
key the key whose associated value is to be returned
defaultValue the default mapping of the key
Returns:
the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
 */
import java.util.Map;
import java.util.TreeMap;

public class DuplicatArraysElements{
   public static void main(String[] args){
    int[]arr={11,2,33,4,44,33,2,5,6,7,8,9,5,6,1,23,4,3,2,6,7,11,12,111,12,1};
    // o/p --> 1:0,2:3,3:0,11:2 and so on
    Map<Integer,Integer>result = new TreeMap<>();
    
    for(int num : arr){
        result.put(num,result.getOrDefault(num,0)+1);

    }
    System.err.println("duplicates with count are : "+result);
}
}

// 2)print count of an duplicate elements only.