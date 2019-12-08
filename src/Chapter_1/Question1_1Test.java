package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_1Test extends Question1_1{

    @Test
    void isUnique() {
        // Test case 1
        assertTrue(isUnique("abcd"));

        // Test case 2
        assertFalse(isUnique("abbd"));

        // Test case 3
        assertFalse(isUnique(""));
    }

    @Test
    void isUniqueB() {
        // Test case 1
        assertTrue(isUniqueB("abcd"));

        // Test case 2
        assertFalse(isUniqueB("abbd"));

        // Test case 3
        assertFalse(isUniqueB(""));
    }
}