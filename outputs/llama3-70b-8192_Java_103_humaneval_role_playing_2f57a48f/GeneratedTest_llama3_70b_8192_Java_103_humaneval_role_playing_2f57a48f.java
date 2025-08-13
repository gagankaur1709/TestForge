
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
    You are given two positive integers n and m, and your task is to compute the
    average of the integers from n through m (including n and m).
    Round the answer to the nearest integer and convert that to binary.
    If n is greater than m, return -1.
    Example:
    roundedAvg(1, 5) => "11"
    roundedAvg(7, 5) => -1
    roundedAvg(10, 20) => "1111"
    roundedAvg(20, 33) => "11011"
     */
    public Object roundedAvg(int n, int m) {

            if (n > m) {
            return -1;
        }
        return Integer.toBinaryString((int) Math.round((double) (m + n) / 2));
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_103_humaneval_role_playing_2f57a48f {

    @Test
    void should_return_minus_one_when_n_is_greater_than_m() {
        Solution solution = new Solution();
        assertEquals(-1, solution.roundedAvg(7, 5));
    }

    @Test
    void should_return_binary_representation_of_average_when_n_is_less_than_or_equal_to_m() {
        Solution solution = new Solution();
        assertEquals("11", solution.roundedAvg(1, 5));
        assertEquals("1111", solution.roundedAvg(10, 20));
        assertEquals("11011", solution.roundedAvg(20, 33));
    }

    @Test
    void should_return_binary_representation_of_average_for_edge_case_n_equal_to_m() {
        Solution solution = new Solution();
        assertEquals("1", solution.roundedAvg(1, 1));
        assertEquals("1010", solution.roundedAvg(10, 10));
    }

    @Test
    void should_return_binary_representation_of_average_for_large_numbers() {
        Solution solution = new Solution();
        assertEquals("11111111111", solution.roundedAvg(1000, 2000));
        assertEquals("111111111111", solution.roundedAvg(10000, 20000));
    }
}
    