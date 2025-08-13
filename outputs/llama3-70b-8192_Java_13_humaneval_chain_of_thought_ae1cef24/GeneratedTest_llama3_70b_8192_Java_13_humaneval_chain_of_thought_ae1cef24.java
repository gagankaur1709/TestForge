
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
    
    public class GeneratedTest_llama3_70b_8192_Java_13_humaneval_chain_of_thought_ae1cef24 {
    private Solution solution = new Solution();

    @Test
    void testGreatestCommonDivisor_HappyPath() {
        assertEquals(1, solution.greatestCommonDivisor(3, 5));
    }

    @Test
    void testGreatestCommonDivisor_EqualNumbers() {
        assertEquals(25, solution.greatestCommonDivisor(25, 25));
    }

    @Test
    void testGreatestCommonDivisor_ZeroInput() {
        assertEquals(0, solution.greatestCommonDivisor(0, 5));
    }

    @Test
    void testGreatestCommonDivisor_OneInput() {
        assertEquals(1, solution.greatestCommonDivisor(1, 5));
    }

    @Test
    void testGreatestCommonDivisor_LargeNumbers() {
        assertEquals(3, solution.greatestCommonDivisor(12, 15));
    }
}
    