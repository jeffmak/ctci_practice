package Chapter_1;

public class Question1_3 {
    public static void URLify(char[] input, int length){
        // Runtime: O(n), Space: O(1)
        int idx = input.length - 1;
        int idx2 = length - 1;
        while(idx > idx2) { // idx2 > 0
            if (input[idx2] != ' '){
                input[idx] = input[idx2];
                input[idx2] = ' ';
                idx--;
                idx2--;
            } else {
                input[idx] = '0';
                input[idx - 1] = '2';
                input [idx - 2] = '%';
                idx -= 3;
                idx2--;
            }
        }
    }
}
