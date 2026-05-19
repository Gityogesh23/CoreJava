
public class NonRepeatedChar {
    public static void main(String[] args) {
        String str = "aabbcdde";

        for(char c : str.toCharArray()){

        if(str.indexOf(c) == str.lastIndexOf(c)){
        System.out.println(c);
        break;
    }
}
    }
}

/*
indexOf(int ch): Returns the index of the first occurrence of the 
specified character (Unicode value).

indexOf(int ch, int fromIndex): Searches for a character starting from a specific index.
indexOf(String str): Returns the index of the first occurrence of the specified substring.
indexOf(String str, int fromIndex): Searches for a substring starting from a specific index


----------------------------------------
indexOf(): Finds the first occurrence of the specified value, searching from the beginning 
of the string/list.
lastIndexOf(): Finds the last occurrence of the specified value, effectively searching 
backwards from the end
*/