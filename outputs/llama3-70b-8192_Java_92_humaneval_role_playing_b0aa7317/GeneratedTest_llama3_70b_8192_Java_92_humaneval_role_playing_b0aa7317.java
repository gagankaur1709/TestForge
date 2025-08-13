
    import java.lang.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
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
    Create a function that takes 3 numbers.
    Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    Returns false in any other cases.

    Examples
    anyInt(5, 2, 7) -> true

    anyInt(3, 2, 2) -> false

    anyInt(3, -2, 1) -> true

    anyInt(3.6, -2.2, 2) -> false
     */
    public boolean anyInt(Object x, Object y, Object z) {

            if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            return (int) x + (int) y == (int) z || (int) x + (int) z == (int) y || (int) y + (int) z == (int) x;
        }
        return false;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_92_humaneval_role_playing_b0aa7317 {

    @Test
    @DisplayName("should return true when one number is equal to the sum of the other two and all numbers are integers")
    void should_return_true_when_one_number_is_equal_to_the_sum_of_the_other_two_and_all_numbers_are_integers() {
        Solution solution = new Solution();
        assertTrue(solution.anyInt(5, 2, 7));
        assertTrue(solution.anyInt(3, -2, 1));
    }

    @Test
    @DisplayName("should return false when one number is not equal to the sum of the other two and all numbers are integers")
    void should_return_false_when_one_number_is_not_equal_to_the_sum_of_the_other_two_and_all_numbers_are_integers() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(3, 2, 2));
    }

    @Test
    @DisplayName("should return false when not all numbers are integers")
    void should_return_false_when_not_all_numbers_are_integers() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(3.6, -2.2, 2));
        assertFalse(solution.anyInt(3, 2.2, 1));
        assertFalse(solution.anyInt(3.6, -2, 1));
    }

    @Test
    @DisplayName("should return false when null is passed as an argument")
    void should_return_false_when_null_is_passed_as_an_argument() {
        Solution solution = new Solution();
        assertFalse(solution.anyInt(null, 2, 7));
        assertFalse(solution.anyInt(5, null, 7));
        assertFalse(solution.anyInt(5, 2, null));
    }
}
    