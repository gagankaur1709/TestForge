
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
    
    public class GeneratedTest_llama3_70b_8192_Java_55_humaneval_role_playing_6c3e9433 {

    @Test
    void should_return_0_when_n_is_0() {
        Solution solution = new Solution();
        int result = solution.fib(0);
        assertEquals(0, result);
    }

    @Test
    void should_return_1_when_n_is_1() {
        Solution solution = new Solution();
        int result = solution.fib(1);
        assertEquals(1, result);
    }

    @Test
    void should_return_1_when_n_is_2() {
        Solution solution = new Solution();
        int result = solution.fib(2);
        assertEquals(1, result);
    }

    @Test
    void should_return_2_when_n_is_3() {
        Solution solution = new Solution();
        int result = solution.fib(3);
        assertEquals(2, result);
    }

    @Test
    void should_return_3_when_n_is_4() {
        Solution solution = new Solution();
        int result = solution.fib(4);
        assertEquals(3, result);
    }

    @Test
    void should_return_5_when_n_is_5() {
        Solution solution = new Solution();
        int result = solution.fib(5);
        assertEquals(5, result);
    }

    @Test
    void should_return_8_when_n_is_6() {
        Solution solution = new Solution();
        int result = solution.fib(6);
        assertEquals(8, result);
    }

    @Test
    void should_return_13_when_n_is_7() {
        Solution solution = new Solution();
        int result = solution.fib(7);
        assertEquals(13, result);
    }

    @Test
    void should_return_21_when_n_is_8() {
        Solution solution = new Solution();
        int result = solution.fib(8);
        assertEquals(21, result);
    }

    @Test
    void should_return_34_when_n_is_9() {
        Solution solution = new Solution();
        int result = solution.fib(9);
        assertEquals(34, result);
    }

    @Test
    void should_return_55_when_n_is_10() {
        Solution solution = new Solution();
        int result = solution.fib(10);
        assertEquals(55, result);
    }
}
    