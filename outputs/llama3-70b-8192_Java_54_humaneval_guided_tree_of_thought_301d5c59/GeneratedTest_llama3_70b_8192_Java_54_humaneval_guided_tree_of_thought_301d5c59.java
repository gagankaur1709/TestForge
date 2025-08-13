
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
    
    public class GeneratedTest_llama3_70b_8192_Java_54_humaneval_guided_tree_of_thought_301d5c59 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSameChars_HappyPath_SameCharacters() {
        assertTrue(solution.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
    }

    @Test
    void testSameChars_HappyPath_SameCharacters_Reversed() {
        assertTrue(solution.sameChars("abcd", "dddddddabc"));
    }

    @Test
    void testSameChars_EdgeCase_DifferentCharacters() {
        assertFalse(solution.sameChars("eabcd", "dddddddabc"));
    }

    @Test
    void testSameChars_EdgeCase_ExtraCharacter() {
        assertFalse(solution.sameChars("abcd", "dddddddabce"));
    }

    @Test
    void testSameChars_EdgeCase_DifferentCharacters_Reversed() {
        assertFalse(solution.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }

    @Test
    void testSameChars_EmptyStrings() {
        assertTrue(solution.sameChars("", ""));
    }

    @Test
    void testSameChars_OneEmptyString() {
        assertFalse(solution.sameChars("abcd", ""));
    }
}
    