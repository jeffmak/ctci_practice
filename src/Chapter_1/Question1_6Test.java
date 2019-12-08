package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_6Test extends Question1_6{

    @Test
    void basicCompress() {
        // Test Case 1
        assertEquals(basicCompress("aabcccccaaa"), "a2b1c5a3");

        // Test Case 2
        assertEquals(basicCompress("AAaabcccccaaa"), "A2a2b1c5a3");

        // Test Case 3
        assertEquals(basicCompress("acbgtcadf"), "acbgtcadf");

        // Test Case 4
        assertEquals(basicCompress(""), "");
    }
}