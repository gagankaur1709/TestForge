
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
    Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
     */
    public int fib(int n) {

            if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_55_humaneval_constraint_based_a918939f {
    private Solution solution = new Solution();

    @Test
    void testFibHappyPath() {
        assertEquals(55, solution.fib(10));
    }

    @Test
    void testFibBaseCase1() {
        assertEquals(1, solution.fib(1));
    }

    @Test
    void testFibBaseCase0() {
        assertEquals(0, solution.fib(0));
    }

    @Test
    void testFibEdgeCase2() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    void testFibEdgeCaseLargeInput() {
        assertEquals(832040, solution.fib(30));
    }
}
    