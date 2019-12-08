package Chapter_1;

public class Question1_6 {
    public static String basicCompress(String input){
        boolean isUnique = true;
        for(int i = 0; i < input.length() - 1; ++i){
            if (input.charAt(i) == input.charAt(i + 1)) {
                isUnique = false;
            }
        }
        if(isUnique) return input;
        StringBuilder output = new StringBuilder();
        char currChar = input.charAt(0);
        int currCharCount = 0;
        for(int i = 0; i < input.length(); ++i){
            if(input.charAt(i) == currChar){
                currCharCount++;
            }else{
                output.append(currChar);
                output.append(currCharCount);
                currChar = input.charAt(i);
                currCharCount = 1;
            }
        }
        output.append(currChar);
        output.append(currCharCount);
        return output.toString();
    }
}
