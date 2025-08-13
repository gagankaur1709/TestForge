
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
    
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
    Given a non-empty list of integers lst. add the even elements that are at odd indices..

    Examples:
        add(Arrays.asList(4, 2, 6, 7)) ==> 2
     */
    public int add(List<Integer> lst) {

            int sum = 0;
        for (int i = 1; i < lst.size(); i += 2) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}
    
    @ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_Java_85_humaneval_role_playing_dabe6779 {

    @Test
    void should_return_zero_when_input_list_is_empty() {
        Solution solution = new Solution();
        assertEquals(0, solution.add(Collections.emptyList()));
    }

    @Test
    void should_return_zero_when_no_even_elements_at_odd_indices() {
        Solution solution = new Solution();
        assertEquals(0, solution.add(Arrays.asList(1, 3, 5, 7)));
    }

    @Test
    void should_return_sum_of_even_elements_at_odd_indices() {
        Solution solution = new Solution();
        assertEquals(2, solution.add(Arrays.asList(4, 2, 6, 7)));
    }

    @Test
    void should_return_sum_of_multiple_even_elements_at_odd_indices() {
        Solution solution = new Solution();
        assertEquals(10, solution.add(Arrays.asList(4, 2, 6, 8, 10, 12)));
    }

    @Test
    void should_return_sum_of_even_elements_at_odd_indices_with_negative_numbers() {
        Solution solution = new Solution();
        assertEquals(-2, solution.add(Arrays.asList(4, -2, 6, -8, 10, -12)));
    }
}
    