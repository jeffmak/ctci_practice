package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_5Test extends Question1_5{

    @Test
    void oneArray() {
        //Test Case 1 (identical strings)
        assertTrue(oneArray("pale".toCharArray(),"pale".toCharArray()));

        //Test Case 2 (delete)
        assertTrue(oneArray("pale".toCharArray(),"ple".toCharArray()));

        //Test Case 3 (delete)
        assertTrue(oneArray("pales".toCharArray(),"pale".toCharArray()));

        //Test Case 4 (replace)
        assertTrue(oneArray("pale".toCharArray(),"bale".toCharArray()));

        //Test Case 5 (different strings)
        assertFalse(oneArray("pale".toCharArray(),"bake".toCharArray()));

        //Test Case 6 (insert)
        assertTrue(oneArray("pale".toCharArray(),"pable".toCharArray()));

    }
}