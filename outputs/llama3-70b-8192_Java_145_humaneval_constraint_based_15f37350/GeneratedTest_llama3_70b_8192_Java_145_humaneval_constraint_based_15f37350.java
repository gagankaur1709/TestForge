
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
    Write a function which sorts the given list of integers
    in ascending order according to the sum of their digits.
    Note: if there are several items with similar sum of their digits,
    order them based on their index in original list.

    For example:
    >>> orderByPoints(Arrays.asList(1, 11, -1, -11, -12)) == [-1, -11, 1, -12, 11]
    >>> orderByPoints(Arrays.asList()) == []
     */
    public List<Integer> orderByPoints(List<Integer> nums) {

            List<Integer> result = new ArrayList<>(nums);
        result.sort((o1, o2) -> {
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < String.valueOf(o1).length(); i++) {
                if (i != 0 || o1 >= 0) {
                    sum1 += (String.valueOf(o1).charAt(i) - '0' );
                    if (i == 1 && o1 < 0) {
                        sum1 = -sum1;
                    }
                }
            }
            for (int i = 0; i < String.valueOf(o2).length(); i++) {
                if (i != 0 || o2 >= 0) {
                    sum2 += (String.valueOf(o2).charAt(i) - '0' );
                    if (i == 1 && o2 < 0) {
                        sum2 = -sum2;
                    }
                }
            }
            return Integer.compare(sum1, sum2);
        });
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_145_humaneval_constraint_based_15f37350 {

    Solution solution = new Solution();

    @Test
    void testOrderByPoints_HappyPath() {
        List<Integer> input = Arrays.asList(1, 11, -1, -11, -12);
        List<Integer> expected = Arrays.asList(-1, -11, 1, -12, 11);
        assertEquals(expected, solution.orderByPoints(input));
    }

    @Test
    void testOrderByPoints_EmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.orderByPoints(input));
    }

    @Test
    void testOrderByPoints_SingleElement() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, solution.orderByPoints(input));
    }

    @Test
    void testOrderByPoints_MultipleElementsWithSameDigitSum() {
        List<Integer> input = Arrays.asList(10, 12, 20, 21);
        List<Integer> expected = Arrays.asList(10, 12, 20, 21);
        assertEquals(expected, solution.orderByPoints(input));
    }
}
    