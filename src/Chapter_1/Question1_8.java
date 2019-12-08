package Chapter_1;

public class Question1_8 {
    //Runtime: O(mn), extra space: O(m+n)
    public static void zeroMatrix(int[][] matrix){
        if(matrix == null) return;
        if(matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];
        for(int row = 0; row < m; ++row){
            for(int col = 0; col < n; ++col){
                if(matrix[row][col] == 0){
                    zeroRows[row] = true;
                    zeroCols[col] = true;
                }
            }
        }
        for(int row = 0; row < m; ++row){
            if(zeroRows[row]){
                for(int col = 0; col < n; ++col){
                    matrix[row][col] = 0;
                }
            }
        }
        for(int col = 0; col < n; ++col){
            if(zeroCols[col]){
                for(int row = 0; row < m; ++row){
                    matrix[row][col] = 0;
                }
            }
        }
    }
}
