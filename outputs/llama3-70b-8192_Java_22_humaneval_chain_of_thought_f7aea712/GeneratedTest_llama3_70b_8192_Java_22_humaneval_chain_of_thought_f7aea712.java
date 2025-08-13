
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_22_humaneval_chain_of_thought_f7aea712 {
    private Solution solution = new Solution();

    @Test
    void testFilterIntegers_HappyPath() {
        List<Object> input = Arrays.asList('a', 3.14, 5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, solution.filterIntergers(input));
    }

    @Test
    void testFilterIntegers_MultipleIntegers() {
        List<Object> input = Arrays.asList(1, 2, 3, "abc", new HashMap<>(), Arrays.asList());
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.filterIntergers(input));
    }

    @Test
    void testFilterIntegers_NoIntegers() {
        List<Object> input = Arrays.asList('a', 3.14, "abc", new HashMap<>(), Arrays.asList());
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.filterIntergers(input));
    }

    @Test
    void testFilterIntegers_NullInput() {
        List<Object> input = null;
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.filterIntergers(input));
    }

    @Test
    void testFilterIntegers_EmptyInput() {
        List<Object> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.filterIntergers(input));
    }
}
    