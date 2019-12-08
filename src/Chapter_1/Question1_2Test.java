package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_2Test extends Question1_2{

    @Test
    void checkPermutation() {
        // Test case 1
        assertTrue(checkPermutation("abcd","dacb"));

        // Test case 2
        assertFalse(checkPermutation("ab","dacb"));

        // Test case 3
        assertFalse(checkPermutation("accd","dacb"));
    }
}