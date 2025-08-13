
    import java.lang.*;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_54_humaneval_role_playing_2adb8e18 {

    @Test
    void shouldReturnTrueWhenBothStringsHaveSameCharacters() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc");
        assertEquals(true, result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsHaveSameCharactersInDifferentOrder() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("abcd", "dddddddabc");
        assertEquals(true, result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsHaveSameCharactersWithDifferentCounts() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("dddddddabc", "abcd");
        assertEquals(true, result);
    }

    @Test
    void shouldReturnFalseWhenStringsHaveDifferentCharacters() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("eabcd", "dddddddabc");
        assertEquals(false, result);
    }

    @Test
    void shouldReturnFalseWhenStringsHaveDifferentCharactersInDifferentOrder() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("abcd", "dddddddabce");
        assertEquals(false, result);
    }

    @Test
    void shouldReturnFalseWhenStringsHaveDifferentCharactersWithDifferentCounts() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("eabcdzzzz", "dddzzzzzzzddddabc");
        assertEquals(false, result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsAreEmpty() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("", "");
        assertEquals(true, result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsHaveSameSingleCharacter() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("a", "a");
        assertEquals(true, result);
    }

    @Test
    void shouldReturnFalseWhenOneStringIsEmptyAndTheOtherIsNot() {
        Solution solution = new Solution();
        boolean result = solution.sameChars("a", "");
        assertEquals(false, result);
    }

    @Test
    void shouldReturnFalseWhenOneStringIsNullAndTheOtherIsNot() {
        Solution solution = new Solution();
        boolean result = solution.sameChars(null, "a");
        assertEquals(false, result);
    }

    @Test
    void shouldReturnFalseWhenBothStringsAreNull() {
        Solution solution = new Solution();
        boolean result = solution.sameChars(null, null);
        assertEquals(false, result);
    }
}
    