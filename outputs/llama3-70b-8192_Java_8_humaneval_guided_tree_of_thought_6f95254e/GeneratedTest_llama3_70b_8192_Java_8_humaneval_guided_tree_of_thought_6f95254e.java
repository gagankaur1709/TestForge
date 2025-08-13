
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
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
    For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sumProduct(List.of())
    [0, 1]
    >>> sumProduct(Arrays.asList(1, 2, 3, 4))
    [10, 24]
     */
    public List<Integer> sumProduct(List<Integer> numbers) {

            int sum = 0;
        int product = 1;

        for (int n : numbers) {
            sum += n;
            product *= n;
        }
        return Arrays.asList(sum, product);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_8_humaneval_guided_tree_of_thought_6f95254e {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> result = solution.sumProduct(numbers);
        assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void testSingleElementList() {
        List<Integer> numbers = Arrays.asList(5);
        List<Integer> result = solution.sumProduct(numbers);
        assertEquals(Arrays.asList(5, 5), result);
    }

    @Test
    void testMultipleElementsList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = solution.sumProduct(numbers);
        assertEquals(Arrays.asList(10, 24), result);
    }

    @Test
    void testNegativeNumbersList() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4);
        List<Integer> result = solution.sumProduct(numbers);
        assertEquals(Arrays.asList(-10, 24), result);
    }

    @Test
    void testMixedNumbersList() {
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);
        List<Integer> result = solution.sumProduct(numbers);
        assertEquals(Arrays.asList(-2, -24), result);
    }
}
    