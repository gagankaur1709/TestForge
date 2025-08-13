
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
    The Fib4 number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    fib4(0) -> 0
    fib4(1) -> 0
    fib4(2) -> 2
    fib4(3) -> 0
    fib4(n) -> fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4).
    Please write a function to efficiently compute the n-th element of the fib4 number sequence.  Do not use recursion.
    >>> fib4(5)
    4
    >>> fib4(6)
    8
    >>> fib4(7)
    14
     */
    public int fib4(int n) {

            List<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(2);
        results.add(0);
        if (n < 4) {
            return results.get(n);
        }

        for (int i = 4; i <= n; i++) {
            results.add(results.get(0) + results.get(1) + results.get(2) + results.get(3));
            results.remove(0);
        }
        return results.get(3);
    }
}
    
    class GeneratedTest_llama3_70b_8192_Java_46_humaneval_guided_tree_of_thought_1ec1fa56 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFib4Zero() {
        assertEquals(0, solution.fib4(0));
    }

    @Test
    void testFib4One() {
        assertEquals(0, solution.fib4(1));
    }

    @Test
    void testFib4Two() {
        assertEquals(2, solution.fib4(2));
    }

    @Test
    void testFib4Three() {
        assertEquals(0, solution.fib4(3));
    }

    @Test
    void testFib4Four() {
        assertEquals(2, solution.fib4(4));
    }

    @Test
    void testFib4Five() {
        assertEquals(4, solution.fib4(5));
    }

    @Test
    void testFib4Six() {
        assertEquals(8, solution.fib4(6));
    }

    @Test
    void testFib4Seven() {
        assertEquals(14, solution.fib4(7));
    }

    @Test
    void testFib4Large() {
        assertEquals(1346269, solution.fib4(20));
    }
}
    