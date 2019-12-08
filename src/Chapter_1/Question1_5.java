package Chapter_1;

public class Question1_5 {
    public static boolean oneArray(char[] str, char[] str2){
        // Runtime: O(n)
        if(str.length == str2.length){
            int numEdits = 0;
            for(int i = 0; i < str.length; ++i){
                if(str[i] != str2[i]){
                    numEdits++;
                }
            }
            return numEdits <=1;
        } else { // str.length - str2.length > 1 || str2.length - str.length > 1
            boolean secondIsLonger = Math.min(str.length, str2.length) == str.length;
            int idx = 0, idx2 = 0;
            boolean hasIndel = false;
            while(idx < str.length && idx2 < str2.length) {
                if(str[idx] != str[idx2]){
                    if(hasIndel){
                        return false;
                    }else if(secondIsLonger){
                        idx2++;
                        hasIndel = true;
                    }else{
                        idx++;
                        hasIndel = true;
                    }
                }else{
                    idx++;
                    idx2++;
                }
            }
            return true;
        }
    }
}
