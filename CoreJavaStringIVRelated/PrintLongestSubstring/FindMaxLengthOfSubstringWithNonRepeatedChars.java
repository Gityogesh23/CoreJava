// package CoreJavaStringIVRelated.PrintLongestSubstring;


import java.util.HashSet;
import java.util.Set;

public class FindMaxLengthOfSubstringWithNonRepeatedChars {
	public static int calLengthOfSubstring(String s){
		if(s==null && s.isEmpty()) {
			return 0;
		}
		int maxLength=0;
		int Left=0;
		Set<Character>set=new HashSet<>();
		
		for(int Right=0;Right<s.length();Right++) {
			//to remove already contained character element inside set.
			while(set.contains(s.charAt(Right))) {
				set.remove(s.charAt(Left));
				Left++;
			}
			
			//Add if not contains by set<V>
			set.add(s.charAt(Right));
			maxLength=Math.max(maxLength,Right-Left+1);
		}
		
		return maxLength;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String input="abcabcbb";
		System.out.println("Longest substring length would be: " +calLengthOfSubstring(input)); //Longest substring length would be: 3
	// Output: 3 ( because the substring is "abc")
	}

}
