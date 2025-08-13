
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generateIntegers(2, 8) => [2, 4, 6, 8]
    generateIntegers(8, 2) => [2, 4, 6, 8]
    generateIntegers(10, 14) => []
     */
    public List<Integer> generateIntegers(int a, int b) {

            int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));

        List<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i += 2) {
            result.add(i);
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_163_humaneval_role_playing_2dcd8ab9 {

    @Test
    void should_return_even_digits_between_a_and_b_when_a_is_less_than_b() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(2, 4, 6, 8));
        assertEquals(expected, solution.generateIntegers(2, 8));
    }

    @Test
    void should_return_even_digits_between_a_and_b_when_a_is_greater_than_b() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(2, 4, 6, 8));
        assertEquals(expected, solution.generateIntegers(8, 2));
    }

    @Test
    void should_return_empty_list_when_no_even_digits_between_a_and_b() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.generateIntegers(10, 14));
    }

    @Test
    void should_return_empty_list_when_a_and_b_are_equal_and_out_of_range() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.generateIntegers(9, 9));
    }

    @Test
    void should_return_list_with_single_element_when_a_and_b_are_equal_and_in_range() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(4));
        assertEquals(expected, solution.generateIntegers(4, 4));
    }

    @Test
    void should_return_list_with_multiple_elements_when_a_and_b_are_in_range() {
        Solution solution = new Solution();
        List<Integer> expected = new ArrayList<>(List.of(2, 4, 6));
        assertEquals(expected, solution.generateIntegers(2, 6));
    }
}
    