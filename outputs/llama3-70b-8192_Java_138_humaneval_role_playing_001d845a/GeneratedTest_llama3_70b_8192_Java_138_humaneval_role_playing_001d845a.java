
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
    Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    Example
    isEqualToSumEven(4) == false
    isEqualToSumEven(6) == false
    isEqualToSumEven(8) == true
     */
    public boolean isEqualToSumEven(int n) {

            return n % 2 == 0 && n >= 8;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_138_humaneval_role_playing_001d845a {

    @Test
    void should_return_false_when_input_is_less_than_8() {
        Solution solution = new Solution();
        assertFalse(solution.isEqualToSumEven(7));
    }

    @Test
    void should_return_false_when_input_is_odd() {
        Solution solution = new Solution();
        assertFalse(solution.isEqualToSumEven(9));
    }

    @Test
    void should_return_true_when_input_is_divisible_by_4_and_greater_than_or_equal_to_8() {
        Solution solution = new Solution();
        assertTrue(solution.isEqualToSumEven(8));
        assertTrue(solution.isEqualToSumEven(12));
        assertTrue(solution.isEqualToSumEven(16));
    }

    @Test
    void should_return_true_when_input_is_multiple_of_4_and_greater_than_or_equal_to_8() {
        Solution solution = new Solution();
        assertTrue(solution.isEqualToSumEven(20));
        assertTrue(solution.isEqualToSumEven(24));
        assertTrue(solution.isEqualToSumEven(28));
    }
}
    