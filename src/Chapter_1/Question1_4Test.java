package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_4Test extends Question1_4{

    @Test
    void paliPerm() {
        // Test case 1
        assertTrue(paliPerm("".toCharArray()));

        // Test case 2
        assertTrue(paliPerm("Tact Coa ".toCharArray()));

        // Test case 3
        assertTrue(paliPerm("TaCt*Co5A# ".toCharArray()));

    }

    @Test
    void betterPaliPerm(){
        // Test case 1
        assertTrue(betterPaliPerm("".toCharArray()));

        // Test case 2
        assertTrue(betterPaliPerm("Tact Coa ".toCharArray()));

        // Test case 3
        assertTrue(betterPaliPerm("TaCt*Co5A# ".toCharArray()));
    }
}