
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
    primeFib returns n-th number that is a Fibonacci number and it's also prime.
    >>> primeFib(1)
    2
    >>> primeFib(2)
    3
    >>> primeFib(3)
    5
    >>> primeFib(4)
    13
    >>> primeFib(5)
    89
     */
    public int primeFib(int n) {

            int f0 = 0, f1 = 1;
        while (true) {
            int p = f0 + f1;
            boolean is_prime = p >= 2;
            for (int k = 2; k < Math.min(Math.sqrt(p) + 1, p - 1); k++) {
                if (p % k == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                n -= 1;
            }
            if (n == 0) {
                return p;
            }
            f0 = f1;
            f1 = p;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_39_humaneval_constraint_based_97261713 {
    @Test
    void testPrimeFib_HappyPath() {
        Solution solution = new Solution();
        assertEquals(2, solution.primeFib(1));
        assertEquals(3, solution.primeFib(2));
        assertEquals(5, solution.primeFib(3));
        assertEquals(13, solution.primeFib(4));
        assertEquals(89, solution.primeFib(5));
    }

    @Test
    void testPrimeFib_EdgeCase_NegativeInput() {
        Solution solution = new Solution();
        assertEquals(2, solution.primeFib(0));
        assertEquals(2, solution.primeFib(-1));
        assertEquals(2, solution.primeFib(-5));
    }

    @Test
    void testPrimeFib_EdgeCase_LargeInput() {
        Solution solution = new Solution();
        assertEquals(1597, solution.primeFib(15));
        assertEquals(28657, solution.primeFib(30));
    }
}
    