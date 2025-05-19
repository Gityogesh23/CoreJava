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