
    import java.lang.*;
import java.util.*;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_18_humaneval_chain_of_thought_9a43b56a {

    @Test
    void testHowManyTimes_HappyPath() {
        Solution solution = new Solution();
        assertEquals(3, solution.howManyTimes("aaa", "a"));
    }

    @Test
    void testHowManyTimes_EmptySubstring() {
        Solution solution = new Solution();
        assertEquals(0, solution.howManyTimes("aaa", ""));
    }

    @Test
    void testHowManyTimes_EmptyString() {
        Solution solution = new Solution();
        assertEquals(0, solution.howManyTimes("", "a"));
    }

    @Test
    void testHowManyTimes_SubstringLongerThanString() {
        Solution solution = new Solution();
        assertEquals(0, solution.howManyTimes("a", "aa"));
    }

    @Test
    void testHowManyTimes_SubstringEqualsString() {
        Solution solution = new Solution();
        assertEquals(1, solution.howManyTimes("a", "a"));
    }

    @Test
    void testHowManyTimes_Overlap() {
        Solution solution = new Solution();
        assertEquals(3, solution.howManyTimes("aaaa", "aa"));
    }
}
    