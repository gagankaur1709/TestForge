
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
    Add two numbers x and y
    >>> add(2, 3)
    5
    >>> add(5, 7)
    12
     */
    public int add(int x, int y) {

            return x + y;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_53_humaneval_role_playing_b5e119c1 {

    @Test
    void should_return_sum_when_adding_two_positive_numbers() {
        Solution solution = new Solution();
        int result = solution.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void should_return_sum_when_adding_two_negative_numbers() {
        Solution solution = new Solution();
        int result = solution.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    void should_return_sum_when_adding_positive_and_negative_numbers() {
        Solution solution = new Solution();
        int result = solution.add(2, -3);
        assertEquals(-1, result);
    }

    @Test
    void should_return_sum_when_adding_zero_and_positive_number() {
        Solution solution = new Solution();
        int result = solution.add(0, 3);
        assertEquals(3, result);
    }

    @Test
    void should_return_sum_when_adding_zero_and_negative_number() {
        Solution solution = new Solution();
        int result = solution.add(0, -3);
        assertEquals(-3, result);
    }

    @Test
    void should_return_sum_when_adding_two_max_integer_values() {
        Solution solution = new Solution();
        int result = solution.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MIN_VALUE + 1, result);
    }

    @Test
    void should_return_sum_when_adding_two_min_integer_values() {
        Solution solution = new Solution();
        int result = solution.add(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(0, result);
    }
}
    