
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
    Check if two words have the same characters.
    >>> sameChars("eabcdzzzz", "dddzzzzzzzddeddabc")
    true
    >>> sameChars("abcd", "dddddddabc")
    true
    >>> sameChars("dddddddabc", "abcd")
    true
    >>> sameChars("eabcd", "dddddddabc")
    false
    >>> sameChars("abcd", "dddddddabce")
    false
    >>> sameChars("eabcdzzzz", "dddzzzzzzzddddabc")
    false
     */
    public boolean sameChars(String s0, String s1) {

            Set<Character> set0 = new HashSet<>();
        for (char c : s0.toCharArray()) {
            set0.add(c);
        }
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        return set0.equals(set1);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_54_humaneval_chain_of_thought_e597d546 {
    @Test
    void testSameChars_HappyPath() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc");
        assertEquals(true, result);
    }

    @Test
    void testSameChars_EdgeCase_DifferentLength() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("abcd", "dddddddabc");
        assertEquals(true, result);
    }

    @Test
    void testSameChars_EdgeCase_DifferentCharacters() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("eabcd", "dddddddabc");
        assertEquals(false, result);
    }

    @Test
    void testSameChars_EdgeCase_EmptyString() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("abcd", "");
        assertEquals(false, result);
    }

    @Test
    void testSameChars_EdgeCase_NullInput() {
        Solution solution = new Solution();
        boolean result = solution.sameChars(null, "abcd");
        assertEquals(false, result);
    }
}
    