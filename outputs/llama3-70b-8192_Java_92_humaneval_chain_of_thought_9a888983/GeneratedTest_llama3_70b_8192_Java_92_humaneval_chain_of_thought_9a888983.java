
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
    Create a function that takes 3 numbers.
    Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    Returns false in any other cases.

    Examples
    anyInt(5, 2, 7) -> true

    anyInt(3, 2, 2) -> false

    anyInt(3, -2, 1) -> true

    anyInt(3.6, -2.2, 2) -> false
     */
    public boolean anyInt(Object x, Object y, Object z) {

            if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            return (int) x + (int) y == (int) z || (int) x + (int) z == (int) y || (int) y + (int) z == (int) x;
        }
        return false;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_92_humaneval_chain_of_thought_9a888983 {

    @Test
    void testAnyInt_HappyPath() {
        Solution solution = new Solution();
        assertTrue(solution.anyInt(5, 2, 7));
    }

    @Test
    void testAnyInt_EdgeCase_SameNumbers() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(3, 2, 2));
    }

    @Test
    void testAnyInt_EdgeCase_NegativeNumbers() {
        Solution solution = new Solution();
        assertTrue(solution.anyInt(3, -2, 1));
    }

    @Test
    void testAnyInt_EdgeCase_NonIntegerNumbers() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(3.6, -2.2, 2));
    }

    @Test
    void testAnyInt_EdgeCase_NullInput() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(null, 2, 1));
    }

    @Test
    void testAnyInt_EdgeCase_NonNumericInput() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt("a", 2, 1));
    }
}
    