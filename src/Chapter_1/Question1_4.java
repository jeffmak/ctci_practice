package Chapter_1;

public class Question1_4 {
    public static boolean paliPerm(char[] string){
        // Runtime: O(n), Space: O(1)
        //Forgot to handle edge case:
        if(string.length == 0) return true;
        boolean hasOddCount = false;
        for(char letter = 'a'; letter <='z'; letter++){
            // This is wrong: char capLetter = letter - 'a' + 'A';
            char capLetter = Character.toUpperCase(letter);
            int count = 0;
            for(int i = 0; i < string.length; ++i){
                if(string[i] == letter || string[i] == capLetter){
                    count++;
                }
            }
            if(count % 2 == 1 && hasOddCount){
                return false;
            } else if (count % 2 == 1){
                hasOddCount = true;
            }
        }
        return hasOddCount;
    }

    public static boolean betterPaliPerm(char[] string){
        // Runtime: O(n), Space: O(1)
        // One would prefer this method over the one above due to the
        // time reduction by using an array instead of a for loop
        if(string.length == 0) return true; // edge case
        boolean[] letters = new boolean[26]; // stores the 26 letters (case-insensitive)
        for(char letter: string){
            int idx = -1;
            if(Character.isUpperCase(letter)){
                idx = letter - 'A';
            }else if(Character.isLowerCase(letter)){
                idx = letter - 'a';
            }else{
                continue;
            }
            letters[idx] = !letters[idx];
        }
        boolean foundUnique = false;
        for(boolean val:  letters){
            if(val && foundUnique){
                return false;
            }else if(val){
                foundUnique = true;
            }
        }
        return foundUnique;
    }
}
