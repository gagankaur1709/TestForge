
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
    sumToN is a function that sums numbers from 1 to n.
    >>> sumToN(30)
    465
    >>> sumToN(100)
    5050
    >>> sumToN(5)
    15
    >>> sumToN(10)
    55
    >>> sumToN(1)
    1
     */
    public int sumToN(int n) {

            int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_60_humaneval_guided_tree_of_thought_11c30aaa {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSumToN_HappyPath_SmallNumber() {
        int n = 5;
        int expected = 15;
        int actual = solution.sumToN(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSumToN_HappyPath_MediumNumber() {
        int n = 10;
        int expected = 55;
        int actual = solution.sumToN(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSumToN_HappyPath_LargeNumber() {
        int n = 100;
        int expected = 5050;
        int actual = solution.sumToN(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSumToN_EdgeCase_One() {
        int n = 1;
        int expected = 1;
        int actual = solution.sumToN(n);
        assertEquals(expected, actual);
    }

    @Test
    void testSumToN_EdgeCase_Zero() {
        int n = 0;
        int expected = 0;
        int actual = solution.sumToN(n);
        assertEquals(expected, actual);
    }
}
    