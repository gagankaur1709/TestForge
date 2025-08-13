
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
    
    public class GeneratedTest_llama3_70b_8192_Java_13_humaneval_role_playing_650391d6 {

    @Test
    void should_Return1_When_GCDOf3And5() {
        Solution solution = new Solution();
        assertEquals(1, solution.greatestCommonDivisor(3, 5));
    }

    @Test
    void should_Return5_When_GCDOf25And15() {
        Solution solution = new Solution();
        assertEquals(5, solution.greatestCommonDivisor(25, 15));
    }

    @Test
    void should_Return0_When_GCDOf0And0() {
        Solution solution = new Solution();
        assertEquals(0, solution.greatestCommonDivisor(0, 0));
    }

    @Test
    void should_ReturnA_When_GCDOfAAnd0() {
        Solution solution = new Solution();
        assertEquals(5, solution.greatestCommonDivisor(5, 0));
    }

    @Test
    void should_ReturnB_When_GCDOf0AndB() {
        Solution solution = new Solution();
        assertEquals(5, solution.greatestCommonDivisor(0, 5));
    }

    @Test
    void should_ReturnA_When_GCDOfAAndA() {
        Solution solution = new Solution();
        assertEquals(5, solution.greatestCommonDivisor(5, 5));
    }

    @Test
    void should_ReturnGCD_When_GCDOfLargeNumbers() {
        Solution solution = new Solution();
        assertEquals(2, solution.greatestCommonDivisor(10, 12));
    }
}
    