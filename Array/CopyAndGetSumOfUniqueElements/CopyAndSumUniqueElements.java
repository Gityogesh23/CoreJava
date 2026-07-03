import java.util.HashSet;
import java.util.Set;

public class CopyAndSumUniqueElements {
    
    public static int getSumOfUniqueElements(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }
        
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Add all elements from the first array (duplicates are automatically ignored)
        for (int num : arr1) {
            uniqueElements.add(num);
        }
        
        // Add all elements from the second array
        for (int num : arr2) {
            uniqueElements.add(num);
        }
        
        // Calculate the sum of all unique elements in the set
        int sum = 0;
        for (int num : uniqueElements) {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 6, 7, 8};  // Unique: 1, 2, 3, 4, 6, 7, 8
        int[] arr2 = {2, 4, 5, 6, 1, 11, 22};  // Unique adding: 5, 11, 22
        
        // Combined unique set: {1, 2, 3, 4, 5, 6, 7, 8, 11, 22}
        int totalSum = getSumOfUniqueElements(arr1, arr2);
        
        System.out.println("Sum of unique elements from both arrays is: " + totalSum);
    }
}