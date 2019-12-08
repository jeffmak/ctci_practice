package Chapter_1;

public class Question1_7 {
    // Runtime: O(n^2), uses no extra space.
    public static void pointRotate(int i, int j, int[][] matrix, int n){
        int temp = matrix[i][j];
        int temp2 = matrix[j][n-1-i];
        int temp3 = matrix[n-1-i][n-1-j];
        int temp4 = matrix[n-1-j][i];
        matrix[i][j] = temp4;
        matrix[j][n-1-i] = temp;
        matrix[n-1-i][n-1-j] = temp2;
        matrix[n-1-j][i] = temp3;
    }
    public static void rotateMatrix(int[][] matrix){
        if(matrix == null || matrix.length <= 1) return;
        if(matrix.length != matrix[0].length){
            System.err.println("not square matrix");
            return;
        }
        int matrixSize = matrix.length;
        for(int row = 0; row < matrixSize / 2; ++row){
           for(int col = row; col < matrixSize - 1 - row; ++col){
               pointRotate(row, col, matrix, matrixSize);
           }
        }
    }
}
