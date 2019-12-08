package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_7Test extends Question1_7{

    @Test
    void rotateMatrix() {
        // Test case 1
        int[][] matrix = null;
        rotateMatrix(matrix);
        assertArrayEquals(matrix, null);

        // Test case 2
        matrix = new int[1][1];
        matrix[0][0] = 5;
        rotateMatrix(matrix);
        assertArrayEquals(matrix, new int[][]{{5}});

        // Test case 3 (3x3 square)
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(matrix);
        assertArrayEquals(matrix, new int[][]{{7,4,1},{8,5,2},{9,6,3}});

        // Test case 3 (4x4 square)
        matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateMatrix(matrix);
        assertArrayEquals(matrix, new int[][]{{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}});

    }
}