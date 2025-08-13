
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
    Change numerical base of input number x to base.
    return string representation after the conversion.
    base numbers are less than 10.
    >>> changeBase(8, 3)
    "22"
    >>> changeBase(8, 2)
    "1000"
    >>> changeBase(7, 2)
    "111"
     */
    public String changeBase(int x, int base) {

            StringBuilder ret = new StringBuilder();
        while (x > 0) {
            ret.append(String.valueOf(x % base));
            x /= base;
        }
        return ret.reverse().toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_44_humaneval_role_playing_e71de314 {

    @Test
    void should_return_empty_string_when_x_is_zero() {
        Solution solution = new Solution();
        assertEquals("", solution.changeBase(0, 2));
    }

    @Test
    void should_return_single_digit_string_when_x_is_less_than_base() {
        Solution solution = new Solution();
        assertEquals("1", solution.changeBase(1, 2));
        assertEquals("1", solution.changeBase(1, 3));
        assertEquals("1", solution.changeBase(1, 5));
    }

    @Test
    void should_return_correct_base_conversion_for_small_numbers() {
        Solution solution = new Solution();
        assertEquals("10", solution.changeBase(2, 2));
        assertEquals("11", solution.changeBase(3, 2));
        assertEquals("22", solution.changeBase(8, 3));
        assertEquals("1000", solution.changeBase(8, 2));
        assertEquals("111", solution.changeBase(7, 2));
    }

    @Test
    void should_throw_arithmetic_exception_when_base_is_zero_or_negative() {
        Solution solution = new Solution();
        // No test for ArithmeticException as it's not explicitly thrown in the solution code
    }

    @Test
    void should_return_correct_base_conversion_for_larger_numbers() {
        Solution solution = new Solution();
        assertEquals("10001", solution.changeBase(17, 2));
        assertEquals("102", solution.changeBase(18, 3));
        assertEquals("11010", solution.changeBase(26, 2));
    }
}
    