
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
    Given a positive integer N, return the total sum of its digits in binary.

    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".

    Variables:
        @N integer
             Constraints: 0 <= N <= 10000.
    Output:
         a string of binary number
     */
    public String solve(int N) {

            int sum = 0;
        for (char c : String.valueOf(N).toCharArray()) {
            sum += (c - '0');
        }
        return Integer.toBinaryString(sum);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_84_humaneval_role_playing_3ec7659e {

    @Test
    void should_return_binary_sum_of_digits_for_N_1000() {
        Solution solution = new Solution();
        assertEquals("1", solution.solve(1000));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_150() {
        Solution solution = new Solution();
        assertEquals("110", solution.solve(150));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_147() {
        Solution solution = new Solution();
        assertEquals("1100", solution.solve(147));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_0() {
        Solution solution = new Solution();
        assertEquals("0", solution.solve(0));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_10000() {
        Solution solution = new Solution();
        assertEquals("1110100", solution.solve(10000));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_1() {
        Solution solution = new Solution();
        assertEquals("1", solution.solve(1));
    }

    @Test
    void should_return_binary_sum_of_digits_for_N_10() {
        Solution solution = new Solution();
        assertEquals("11", solution.solve(10));
    }
}
    