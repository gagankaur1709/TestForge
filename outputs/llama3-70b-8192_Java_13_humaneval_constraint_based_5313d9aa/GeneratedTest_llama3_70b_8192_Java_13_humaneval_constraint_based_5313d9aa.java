
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
    Return a greatest common divisor of two integers a and b
    >>> greatestCommonDivisor(3, 5)
    1
    >>> greatestCommonDivisor(25, 15)
    5
     */
    public int greatestCommonDivisor(int a, int b) {

            if (a == 0 || b == 0) {
            return a + b;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return greatestCommonDivisor(a % b, b);
        } else {
            return greatestCommonDivisor(a, b % a);
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_13_humaneval_constraint_based_5313d9aa {
    @Test
    void testGreatestCommonDivisor_HappyPath() {
        Solution solution = new Solution();
        assertEquals(1, solution.greatestCommonDivisor(3, 5));
        assertEquals(5, solution.greatestCommonDivisor(25, 15));
    }

    @Test
    void testGreatestCommonDivisor_EdgeCase_Zero() {
        Solution solution = new Solution();
        assertEquals(0, solution.greatestCommonDivisor(0, 5));
        assertEquals(0, solution.greatestCommonDivisor(3, 0));
        assertEquals(0, solution.greatestCommonDivisor(0, 0));
    }

    @Test
    void testGreatestCommonDivisor_EdgeCase_SameNumbers() {
        Solution solution = new Solution();
        assertEquals(3, solution.greatestCommonDivisor(3, 3));
        assertEquals(10, solution.greatestCommonDivisor(10, 10));
    }
}
    