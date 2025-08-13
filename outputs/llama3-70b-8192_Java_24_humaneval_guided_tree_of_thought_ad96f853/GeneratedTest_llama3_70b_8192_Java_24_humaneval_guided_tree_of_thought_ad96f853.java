
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
    
    public class GeneratedTest_llama3_70b_8192_Java_24_humaneval_guided_tree_of_thought_ad96f853 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testLargestDivisor_HappyPath() {
        assertEquals(5, solution.largestDivisor(15));
    }

    @Test
    void testLargestDivisor_SmallestDivisor() {
        assertEquals(1, solution.largestDivisor(7));
    }

    @Test
    void testLargestDivisor_EvenNumber() {
        assertEquals(4, solution.largestDivisor(8));
    }

    @Test
    void testLargestDivisor_LargeNumber() {
        assertEquals(999, solution.largestDivisor(1000));
    }

    @Test
    void testLargestDivisor_SmallNumber() {
        assertEquals(1, solution.largestDivisor(2));
    }
}
    