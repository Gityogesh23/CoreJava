//using typical logic=>quite similar to bubble sort.not that efficient but for Interview pupose and for practice.
//largest element is stored at one acc to this logic =>simply print=>arr[1]
//=>similarly finding largest as well.=>arr[0]
public class FindSecHighest {
    public static void main(String[] args) {
    int[]arr={12,11,14,14,15,11,18,10};
    int temp=0; 
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
       }
       System.out.println("Second Highest elements inside array is "+arr[1]);
    }
}


/*
 Let's trace it with your example arr = {11, 12, 13, 10, 16, 17}.

Initial Array: {11, 12, 13, 10, 16, 17}

Outer Loop (i = 0):
arr[i] is 11.
Inner Loop (j = 1): arr[j] is 12. if (11 < 12) is true. Swap.
Array becomes: {12, 11, 13, 10, 16, 17}
Inner Loop (j = 2): arr[j] is 13. if (12 < 13) is true. Swap.
Array becomes: {13, 11, 12, 10, 16, 17}
Inner Loop (j = 3): arr[j] is 10. if (13 < 10) is false. No swap.
Inner Loop (j = 4): arr[j] is 16. if (13 < 16) is true. Swap.
Array becomes: {16, 11, 12, 10, 13, 17}
Inner Loop (j = 5): arr[j] is 17. if (16 < 17) is true. Swap.
Array becomes: {17, 11, 12, 10, 13, 16}
After i = 0 pass, arr[0] now holds the largest element (17).

Outer Loop (i = 1):
arr[i] is 11. (Remember, the array is now {17, 11, 12, 10, 13, 16})
Inner Loop (j = 2): arr[j] is 12. if (11 < 12) is true. Swap.
Array becomes: {17, 12, 11, 10, 13, 16}
Inner Loop (j = 3): arr[j] is 10. if (12 < 10) is false. No swap.
Inner Loop (j = 4): arr[j] is 13. if (12 < 13) is true. Swap.
Array becomes: {17, 13, 11, 10, 12, 16}
Inner Loop (j = 5): arr[j] is 16. if (13 < 16) is true. Swap.
Array becomes: {17, 16, 11, 10, 12, 13}

After i = 1 pass, arr[1] now holds the second largest element (16).

The loop will continue, but the elements at arr[0] and arr[1] are already correctly 
placed (largest and second largest respectively). The rest of the array will also be 
sorted in descending order.

Why System.out.println("second largest element " + arr[1]); Works
Because your sorting logic:

Compares arr[i] with all subsequent elements arr[j].
If arr[i] is smaller than arr[j], it swaps them, effectively bubbling larger elements 
towards the beginning of the array.
This process ensures that:

After the first pass (when i is 0), the largest element in the entire array will be 
moved to index 0.
After the second pass (when i is 1), the second largest element will be moved to index 1.
So, by the time the loops complete, arr[0] will hold the largest number, and arr[1] will 
hold the second largest number.
 */