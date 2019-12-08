package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_8Test extends Question1_8{

    @Test
    void zeroMatrix() {
        // Test case 1
        int[][] input = null;
        zeroMatrix(input);
        assertArrayEquals(input, null);

        // Test case 2
        input = new int[][]{{0,5,0},{3,4,6},{0,1,0}};
        zeroMatrix(input);
        assertArrayEquals(input, new int[][]{{0,0,0},{0,4,0},{0,0,0}});
    }
}