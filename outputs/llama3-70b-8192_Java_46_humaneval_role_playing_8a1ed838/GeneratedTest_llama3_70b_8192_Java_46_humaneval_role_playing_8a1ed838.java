
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
    
    public class GeneratedTest_llama3_70b_8192_Java_46_humaneval_role_playing_8a1ed838 {
    @Test
    void shouldReturnZeroWhenNIsZero() {
        Solution solution = new Solution();
        assertEquals(0, solution.fib4(0));
    }

    @Test
    void shouldReturnZeroWhenNIsOne() {
        Solution solution = new Solution();
        assertEquals(0, solution.fib4(1));
    }

    @Test
    void shouldReturnTwoWhenNIsTwo() {
        Solution solution = new Solution();
        assertEquals(2, solution.fib4(2));
    }

    @Test
    void shouldReturnZeroWhenNIsThree() {
        Solution solution = new Solution();
        assertEquals(0, solution.fib4(3));
    }

    @Test
    void shouldReturnFourWhenNIsFour() {
        Solution solution = new Solution();
        assertEquals(4, solution.fib4(4));
    }

    @Test
    void shouldReturnEightWhenNIsFive() {
        Solution solution = new Solution();
        assertEquals(8, solution.fib4(5));
    }

    @Test
    void shouldReturnFourteenWhenNIsSix() {
        Solution solution = new Solution();
        assertEquals(14, solution.fib4(6));
    }

    @Test
    void shouldReturnTwentyEightWhenNIsSeven() {
        Solution solution = new Solution();
        assertEquals(28, solution.fib4(7));
    }

    @Test
    void shouldReturnFiftySixWhenNIsEight() {
        Solution solution = new Solution();
        assertEquals(56, solution.fib4(8));
    }

    @Test
    void shouldReturnOneHundredTwelveWhenNIsNine() {
        Solution solution = new Solution();
        assertEquals(112, solution.fib4(9));
    }

    @Test
    void shouldReturnOneHundredEightyWhenNIsTen() {
        Solution solution = new Solution();
        assertEquals(180, solution.fib4(10));
    }
}
    