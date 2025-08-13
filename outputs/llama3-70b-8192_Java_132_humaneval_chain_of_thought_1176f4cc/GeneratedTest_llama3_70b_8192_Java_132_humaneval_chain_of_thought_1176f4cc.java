
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
    Create a function that takes a string as input which contains only square brackets.
    The function should return true if and only if there is a valid subsequence of brackets
    where at least one bracket in the subsequence is nested.

    isNested("[[]]") -> true
    isNested("[]]]]]]][[[[[]") -> false
    isNested("[][]") -> false
    isNested("[]") -> false
    isNested("[[][]]") -> true
    isNested("[[]][[") -> true
     */
    public boolean isNested(String string) {

            List<Integer> opening_bracket_index = new ArrayList<>(), closing_bracket_index = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '[') {
                opening_bracket_index.add(i);
            } else {
                closing_bracket_index.add(i);
            }
        }
        Collections.reverse(closing_bracket_index);
        int i = 0, l = closing_bracket_index.size();
        for (int idx : opening_bracket_index) {
            if (i < l && idx < closing_bracket_index.get(i)) {
                i += 1;
            }
        }
        return i >= 2;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_132_humaneval_chain_of_thought_1176f4cc {

    @Test
    void testIsNested_HappyPath() {
        Solution solution = new Solution();
        assertTrue(solution.isNested("[[]]"));
    }

    @Test
    void testIsNested_NoNesting() {
        Solution solution = new Solution();
        assertFalse(solution.isNested("[]"));
    }

    @Test
    void testIsNested_MultipleNesting() {
        Solution solution = new Solution();
        assertTrue(solution.isNested("[[][]]"));
    }

    @Test
    void testIsNested_IncompleteNesting() {
        Solution solution = new Solution();
        assertTrue(solution.isNested("[[]][["));
    }

    @Test
    void testIsNested_NoBrackets() {
        Solution solution = new Solution();
        assertFalse(solution.isNested(""));
    }

    @Test
    void testIsNested_OnlyOpeningBrackets() {
        Solution solution = new Solution();
        assertFalse(solution.isNested("[][][]"));
    }

    @Test
    void testIsNested_OnlyClosingBrackets() {
        Solution solution = new Solution();
        assertFalse(solution.isNested("][][]]"));
    }
}
    