/* 
Problem Statement: 
* Create a new array where: 
         1. For each index, calculate the sum of "the current element and the previous k-1 elements".
         2. If there are less than k elements before index i, sum all elements from index 0 to i.
          * Example 1: 
             Input:  array = [1, 2, 3, 4, 5], k = 3
             Output is: [1, 3, 6, 9, 12] 
             (@condition-->if i>=k)-->to skip 1st element and want sum of prev three ele i.e 0 to ith element
             to not break the flow further.--> subtract 0th ele: sum-=arr[i-k];
             Explanation: 1, 1+2, 1+2+3, 2+3+4, 3+4+5 -> {1,3,6,9,12}

*/

import java.util.Arrays;
import java.lang.IllegalArgumentException;
public class InterviewProgram {
    public static int[] calArr(int[]arr,int k){
        if(arr==null){
            throw new IllegalArgumentException("invalid input Array.");
        }
        if(k<=0){
            throw new IllegalArgumentException("k must be greater than 0");
        }
        int sum=0;
        int n=arr.length;
        int result[]=new int[n];
        //task 1 :sum of elements.
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i>=k){  //i=3,4,5,6,7,8,9>3 then true consecutively.
            sum=sum-arr[i-k]; //eg i=3-->sum= 9+arr[3-3]-->0 i.e. 9-1=8 ....same for next i=4,5,6,7,8,9
             
            }
            result[i]=sum; //to store sum inside reult array
        }
        return result;
    }
    public static void main(String[] args) {
        int[]inputArray={1,2,3,4,5,6,7,8,9};
        int k=3;

        System.out.println("final Array is :"+(Arrays.toString(InterviewProgram.calArr(inputArray,k))));
    //final Array is :[1, 3, 6, 9, 12, 15, 18, 21, 24]
    }
}
