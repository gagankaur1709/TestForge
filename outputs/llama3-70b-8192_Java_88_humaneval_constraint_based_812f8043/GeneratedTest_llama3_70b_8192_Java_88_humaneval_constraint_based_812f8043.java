
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
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
    Given an array of non-negative integers, return a copy of the given array after sorting,
    you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
    or sort it in descending order if the sum( first index value, last index value) is even.

    Note:
    * don't change the given array.

    Examples:
    * sortArray(Arrays.asList()) => []
    * sortArray(Arrays.asList(5)) => [5]
    * sortArray(Arrays.asList(2, 4, 3, 0, 1, 5)) => [0, 1, 2, 3, 4, 5]
    * sortArray(Arrays.asList(2, 4, 3, 0, 1, 5, 6)) => [6, 5, 4, 3, 2, 1, 0]
     */
    public List<Integer> sortArray(List<Integer> array) {

            if (array.size() == 0) {
            return array;
        }
        List<Integer> result = new ArrayList<>(array);
        if ((result.get(0) + result.get(result.size() - 1)) % 2 == 1) {
            Collections.sort(result);
        } else {
            result.sort(Collections.reverseOrder());
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_88_humaneval_constraint_based_812f8043 {
    private Solution solution = new Solution();

    @Test
    void testEmptyArray() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void testSingleElementArray() {
        List<Integer> input = Collections.singletonList(5);
        List<Integer> expected = Collections.singletonList(5);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void testOddSumArray() {
        List<Integer> input = Arrays.asList(2, 4, 3, 0, 1, 5);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(expected, solution.sortArray(input));
    }

    @Test
    void testEvenSumArray() {
        List<Integer> input = Arrays.asList(2, 4, 3, 0, 1, 5, 6);
        List<Integer> expected = Arrays.asList(6, 5, 4, 3, 2, 1, 0);
        assertEquals(expected, solution.sortArray(input));
    }
}
    