package Chapter_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1_3Test extends Question1_3 {

    @Test
    void URLify() {
        // Test case 1
        char[] str = "Mr John Smith    ".toCharArray();
        URLify(str, 13);
        assertArrayEquals(str, "Mr%20John%20Smith".toCharArray());

        // Test case 2
        str = "Mr John  Smith      ".toCharArray();
        URLify(str, 14);
        assertArrayEquals(str, "Mr%20John%20%20Smith".toCharArray());

        // Test case 3
        str = "   ".toCharArray();
        URLify(str, 1);
        assertArrayEquals(str, "%20".toCharArray());

        // Test case 4
        str = "".toCharArray();
        URLify(str, 0);
        assertArrayEquals(str, "".toCharArray());
    }
}