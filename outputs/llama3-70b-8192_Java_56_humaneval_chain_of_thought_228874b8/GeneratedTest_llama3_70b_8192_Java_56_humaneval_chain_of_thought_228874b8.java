
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
    brackets is a string of "<" and ">".
    return True if every opening bracket has a corresponding closing bracket.
    
    >>> correctBracketing("<")
    false
    >>> correctBracketing("<>")
    true
    >>> correctBracketing("<<><>>")
    true
    >>> correctBracketing("><<>")
    false
     */
    public boolean correctBracketing(String brackets) {

            int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '<') {
                depth += 1;
            } else {
                depth -= 1;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_56_humaneval_chain_of_thought_228874b8 {
    Solution solution = new Solution();

    @Test
    void testCorrectBracketing_HappyPath() {
        assertTrue(solution.correctBracketing("<<><>>"));
    }

    @Test
    void testCorrectBracketing_OpeningBracketOnly() {
        assertFalse(solution.correctBracketing("<"));
    }

    @Test
    void testCorrectBracketing_ClosingBracketOnly() {
        assertFalse(solution.correctBracketing(">"));
    }

    @Test
    void testCorrectBracketing_MixedBrackets() {
        assertFalse(solution.correctBracketing("><<>"));
    }

    @Test
    void testCorrectBracketing_EmptyString() {
        assertTrue(solution.correctBracketing(""));
    }
}
    