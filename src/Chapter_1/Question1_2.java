package Chapter_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Question1_2 {
    public static boolean checkPermutation(String s1, String  s2){
        // Runtime: O(n), Space: O(n)
        if(s1.length() != s2.length()) return false;
        char s1Array[] = s1.toCharArray();
        char s2Array[] = s2.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();
        for(char c: s1Array){
            if(!counts.containsKey(c)){
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }
        for(char c: s2Array){
            if (!counts.containsKey(c) || counts.get(c) == 0){
                return false;
            } else {
                counts.put(c, counts.get(c) - 1);
            }
        }
        for(int value: counts.values()){
            if(value != 0) return false;
        }
        return true;
    }
}
