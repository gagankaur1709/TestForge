
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
    
    public class GeneratedTest_llama3_70b_8192_Java_60_humaneval_constraint_based_a7f37d9f {
    private Solution solution = new Solution();

    @Test
    void testSumToN_HappyPath() {
        assertEquals(465, solution.sumToN(30));
        assertEquals(5050, solution.sumToN(100));
        assertEquals(15, solution.sumToN(5));
        assertEquals(55, solution.sumToN(10));
        assertEquals(1, solution.sumToN(1));
    }

    @Test
    void testSumToN_EdgeCase_Zero() {
        assertEquals(0, solution.sumToN(0));
    }

    @Test
    void testSumToN_EdgeCase_Negative() {
        assertEquals(0, solution.sumToN(-5));
    }
}
    