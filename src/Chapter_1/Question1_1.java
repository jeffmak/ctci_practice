package Chapter_1;
import java.util.*;


public class Question1_1 {
    public static boolean isUnique(String str){
        // Runtime: O(n), Space: O(n)
        if(str == "") return false;
        HashSet<Character> uniqueSet = new HashSet<Character>();
        for(int i = 0; i < str.length(); ++i){
            char currChar = str.charAt(i);
            if(!uniqueSet.contains(currChar)){
                uniqueSet.add(currChar);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueB(String str){
        // Runtime: O(n log(n))
        if(str == "") return false;
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        for(int i = 0; i < tempArray.length-1; ++i){
            if(tempArray[i] == tempArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
