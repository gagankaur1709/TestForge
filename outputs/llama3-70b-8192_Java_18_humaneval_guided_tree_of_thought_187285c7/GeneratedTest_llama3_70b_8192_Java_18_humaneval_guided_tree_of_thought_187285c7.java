
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    
    import static org.junit.jupiter.api.Assertions.*;
    import static org.junit.jupiter.api.Assertions.assertFalse;
    import static org.junit.jupiter.api.Assertions.assertTrue;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    import static org.junit.jupiter.api.Assertions.assertNotNull;
    import static org.junit.jupiter.api.Assertions.assertNull;
    import static org.junit.jupiter.api.Assertions.assertArrayEquals;
    import org.mockito.Mockito;
    import org.mockito.junit.jupiter.MockitoExtension;
    import org.junit.jupiter.api.extension.ExtendWith;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeAll;
    
    
    import java.util.*;
import java.lang.*;

class Solution {
    /**
    Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {

            int times = 0;

        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times += 1;
            }
        }

        return times;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_18_humaneval_guided_tree_of_thought_187285c7 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testEmptySubstring() {
        assertEquals(0, solution.howManyTimes("", "a"));
    }

    @Test
    void testSingleCharacterSubstring() {
        assertEquals(3, solution.howManyTimes("aaa", "a"));
    }

    @Test
    void testMultiCharacterSubstring() {
        assertEquals(3, solution.howManyTimes("aaaa", "aa"));
    }

    @Test
    void testSubstringNotFound() {
        assertEquals(0, solution.howManyTimes("abcd", "e"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, solution.howManyTimes("", ""));
    }

    @Test
    void testSubstringLongerThanString() {
        assertEquals(0, solution.howManyTimes("abc", "abcd"));
    }
}
    