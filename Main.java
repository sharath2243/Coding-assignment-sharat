import java.util.*;

public class Main {
    public static boolean isAnagram(String s, String t) {
        
        //checking the length of 2 strings
        if (s.length() != t.length()) {
            return false;
        }
        //hahsmap charcount is declared
        HashMap<Character, Integer> charcount = new HashMap<>(); 

        //count characters in string s
        for (char c : s.toCharArray()) {
            charcount.put(c, charcount.getOrDefault(c, 0) + 1);
        }

        //decrease count for characters in string t
        for (char c : t.toCharArray()) {
            //if charecter not a key or count is 0 then not aan anagram
            if (!charcount.containsKey(c) || charcount.get(c) == 0) {
                return false;
            }
            charcount.put(c, charcount.get(c) - 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("Hello", "world")); 
    }
}
