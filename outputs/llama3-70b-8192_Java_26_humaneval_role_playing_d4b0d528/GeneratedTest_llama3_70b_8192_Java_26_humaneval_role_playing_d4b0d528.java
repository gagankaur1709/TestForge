
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
import java.util.stream.Collectors;

class Solution {
    /**
    From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
    >>> removeDuplicates(Array.asList(1, 2, 3, 2, 4))
    [1, 3, 4]
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {

            Map<Integer, Integer> c = new HashMap<>();
        for (int i : numbers) {
            c.put(i, c.getOrDefault(i, 0) + 1);
        }
        return numbers.stream().filter(i -> c.get(i) == 1).collect(Collectors.toList());
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_26_humaneval_role_playing_d4b0d528 {

    @Test
    void should_return_empty_list_when_input_list_is_empty() {
        Solution solution = new Solution();
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    void should_return_list_with_single_element_when_input_list_has_single_element() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    void should_return_list_with_unique_elements_when_input_list_has_duplicates() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    void should_return_list_with_all_elements_when_input_list_has_no_duplicates() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    void should_return_list_with_unique_elements_when_input_list_has_consecutive_duplicates() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        List<Integer> expected = Arrays.asList(1, 4);
        assertEquals(expected, solution.removeDuplicates(input));
    }
}
    