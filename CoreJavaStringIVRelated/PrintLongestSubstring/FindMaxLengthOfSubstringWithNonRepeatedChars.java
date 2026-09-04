// package CoreJavaStringIVRelated.PrintLongestSubstring;


// import java.util.HashSet;
// import java.util.Set;

// public class FindMaxLengthOfSubstringWithNonRepeatedChars {
// 	public static int calLengthOfSubstring(String s){
// 		if(s==null && s.isEmpty()) {
// 			return 0;
// 		}
// 		int maxLength=0;
// 		int Left=0;
// 		Set<Character>set=new HashSet<>();
		
// 		for(int Right=0;Right<s.length();Right++) {
// 			//to remove already contained character element inside set.
// 			while(set.contains(s.charAt(Right))) {
// 				set.remove(s.charAt(Left));
// 				Left++;
// 			}
			
// 			//Add if not contains by set<V>
// 			set.add(s.charAt(Right));
// 			maxLength=Math.max(maxLength,Right-Left+1);
// 		}
		
// 		return maxLength;
// 	}
// 	public static void main(String[] args) {
		
// 		// TODO Auto-generated method stub
// 		String input="abcabcbb";
// 		System.out.println("Longest substring length would be: " +calLengthOfSubstring(input)); //Longest substring length would be: 3
// 	// Output: 3 ( because the substring is "abc")
// 	}

// }
/* */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class FindMaxLengthOfSubstringWithNonRepeatedChars{
    public static void getSubstring(String str){
        if(str==null){
          throw new IllegalArgumentException("string shoud have charactes as input.");
        }
        int startMax=0;
        int maxLen=0;
        int left=0;
        Set<Character>set=new HashSet<>();
        
        
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));//removes character at an respevtive index,means i.e index where left points.
                left++; //index++
            }
            //if not contains
            set.add(str.charAt(right));
            if(right-left+1>maxLen){
                maxLen=right-left+1;
                startMax=left;
            }
            
        }
        String uniqueStr=str.substring(startMax,startMax+maxLen);
        System.out.println("unique string is :"+uniqueStr);
         System.out.println("maximum legth of unique Strin is :"+maxLen);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();//abcbbc
        getSubstring(str);
        sc.close();
    //   System.out.println("unique substring becomes :"+result);
    }
}

/* Find an unique substring from input string*/

