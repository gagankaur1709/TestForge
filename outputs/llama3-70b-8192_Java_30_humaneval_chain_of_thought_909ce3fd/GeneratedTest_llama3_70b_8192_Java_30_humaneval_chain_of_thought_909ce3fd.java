
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
    Return only positive numbers in the list.
    >>> getPositive(Arrays.asList(-1, 2, -4, 5, 6))
    [2, 5, 6]
    >>> getPositive(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
    [5, 3, 2, 3, 9, 123, 1]
     */
    public List<Integer> getPositive(List<Integer> l) {

            return l.stream().filter(p -> p > 0).collect(Collectors.toList());
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_30_humaneval_chain_of_thought_909ce3fd {

    @Test
    void testGetPositive_HappyPath() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(-1, 2, -4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 5, 6);
        assertEquals(expected, solution.getPositive(input));
    }

    @Test
    void testGetPositive_EmptyList() {
        Solution solution = new Solution();
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.getPositive(input));
    }

    @Test
    void testGetPositive_AllNegativeNumbers() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.getPositive(input));
    }

    @Test
    void testGetPositive_AllPositiveNumbers() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, solution.getPositive(input));
    }
}
    