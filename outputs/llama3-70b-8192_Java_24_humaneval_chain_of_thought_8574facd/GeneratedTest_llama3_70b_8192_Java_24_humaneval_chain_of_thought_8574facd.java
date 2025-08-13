
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
    For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largestDivisor(15)
    5
     */
    public int largestDivisor(int n) {

            for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_24_humaneval_chain_of_thought_8574facd {

    @Test
    void testLargestDivisor_HappyPath() {
        Solution solution = new Solution();
        assertEquals(5, solution.largestDivisor(15));
    }

    @Test
    void testLargestDivisor_EdgeCase_SmallNumber() {
        Solution solution = new Solution();
        assertEquals(1, solution.largestDivisor(2));
    }

    @Test
    void testLargestDivisor_EdgeCase_LargeNumber() {
        Solution solution = new Solution();
        assertEquals(30, solution.largestDivisor(60));
    }

    @Test
    void testLargestDivisor_EdgeCase_One() {
        Solution solution = new Solution();
        assertEquals(1, solution.largestDivisor(1));
    }
}
    