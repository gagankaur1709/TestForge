
    import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
    Filter given list of any values only for integers
    >>> filter_integers(Arrays.asList('a', 3.14, 5))
    [5]
    >>> filter_integers(Arrays.asList(1, 2, 3, "abc", Map.of(), List.of()))
    [1, 2, 3]
     */
    public List<Integer> filterIntergers(List<Object> values) {

            List<Integer> result = new ArrayList<>();
        for (Object x : values) {
            if (x instanceof Integer) {
                result.add((Integer) x);
            }
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_22_humaneval_constraint_based_9479c8d9 {

    @Test
    void testFilterIntegers_HappyPath() {
        Solution solution = new Solution();
        List<Object> input = Arrays.asList('a', 3.14, 5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> result = solution.filterIntergers(input);
        assertIterableEquals(expected, result);
    }

    @Test
    void testFilterIntegers_MultipleIntegers() {
        Solution solution = new Solution();
        List<Object> input = Arrays.asList(1, 2, 3, "abc", new HashMap<>(), new ArrayList<>());
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = solution.filterIntergers(input);
        assertIterableEquals(expected, result);
    }

    @Test
    void testFilterIntegers_EmptyList() {
        Solution solution = new Solution();
        List<Object> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = solution.filterIntergers(input);
        assertIterableEquals(expected, result);
    }

    @Test
    void testFilterIntegers_NoIntegers() {
        Solution solution = new Solution();
        List<Object> input = Arrays.asList("abc", new HashMap<>(), new ArrayList<>());
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = solution.filterIntergers(input);
        assertIterableEquals(expected, result);
    }
}
    