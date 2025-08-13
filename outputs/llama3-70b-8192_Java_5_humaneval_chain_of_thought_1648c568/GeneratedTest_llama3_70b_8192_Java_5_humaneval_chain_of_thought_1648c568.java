
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
    Insert a number 'delimeter' between every two consecutive elements of input list `numbers'
    >>> intersperse(List.of(), 4)
    []
    >>> intersperse(Arrays.asList(1, 2, 3), 4)
    [1, 4, 2, 4, 3]
     */
    public List<Integer> intersperse(List<Integer> numbers, int delimiter) {

            if (numbers.size() == 0) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>(List.of());
        for (int i = 0; i < numbers.size() - 1; i++) {
            result.add(numbers.get(i));
            result.add(delimiter);
        }

        result.add(numbers.get(numbers.size() - 1));

        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_5_humaneval_chain_of_thought_1648c568 {

    @Test
    void testIntersperse_HappyPath() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int delimiter = 4;
        List<Integer> expectedResult = Arrays.asList(1, 4, 2, 4, 3);
        assertEquals(expectedResult, solution.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperse_EmptyList() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList();
        int delimiter = 4;
        List<Integer> expectedResult = Arrays.asList();
        assertEquals(expectedResult, solution.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperse_SingleElementList() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList(1);
        int delimiter = 4;
        List<Integer> expectedResult = Arrays.asList(1);
        assertEquals(expectedResult, solution.intersperse(numbers, delimiter));
    }

    @Test
    void testIntersperse_DelimiterZero() {
        Solution solution = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int delimiter = 0;
        List<Integer> expectedResult = Arrays.asList(1, 0, 2, 0, 3);
        assertEquals(expectedResult, solution.intersperse(numbers, delimiter));
    }
}
    