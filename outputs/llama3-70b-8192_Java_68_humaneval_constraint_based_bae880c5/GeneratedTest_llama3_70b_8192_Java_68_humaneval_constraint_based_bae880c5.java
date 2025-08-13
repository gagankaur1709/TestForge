
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
    "Given an array representing a branch of a tree that has non-negative integer nodes
    your task is to pluck one of the nodes and return it.
    The plucked node should be the node with the smallest even value.
    If multiple nodes with the same smallest even value are found return the node that has smallest index.

    The plucked node should be returned in a list, [ smalest_value, its index ],
    If there are no even values or the given array is empty, return [].

    Example 1:
        Input: [4,2,3]
        Output: [2, 1]
        Explanation: 2 has the smallest even value, and 2 has the smallest index.

    Example 2:
        Input: [1,2,3]
        Output: [2, 1]
        Explanation: 2 has the smallest even value, and 2 has the smallest index.

    Example 3:
        Input: []
        Output: []

    Example 4:
        Input: [5, 0, 3, 0, 4, 2]
        Output: [0, 1]
        Explanation: 0 is the smallest value, but  there are two zeros,
                     so we will choose the first zero, which has the smallest index.

    Constraints:
        * 1 <= nodes.length <= 10000
        * 0 <= node.value
     */
    public List<Integer> pluck(List<Integer> arr) {

            List<Integer> result = new ArrayList<>();
        if (arr.size() == 0) {
            return result;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                if (arr.get(i) < min) {
                    min = arr.get(i);
                    minIndex = i;
                }
            }
        }
        if (minIndex != -1) {
            result.add(min);
            result.add(minIndex);
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_68_humaneval_constraint_based_bae880c5 {
    private Solution solution = new Solution();

    @Test
    void testPluck_EmptyArray_ReturnsEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.pluck(input));
    }

    @Test
    void testPluck_ArrayWithNoEvenNumbers_ReturnsEmptyList() {
        List<Integer> input = Arrays.asList(1, 3, 5);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.pluck(input));
    }

    @Test
    void testPluck_ArrayWithOneEvenNumber_ReturnsListWithEvenNumberAndIndex() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, solution.pluck(input));
    }

    @Test
    void testPluck_ArrayWithMultipleEvenNumbers_ReturnsListWithSmallestEvenNumberAndIndex() {
        List<Integer> input = Arrays.asList(4, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, solution.pluck(input));
    }

    @Test
    void testPluck_ArrayWithMultipleSmallestEvenNumbers_ReturnsListWithSmallestEvenNumberAndSmallestIndex() {
        List<Integer> input = Arrays.asList(5, 0, 3, 0, 4, 2);
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, solution.pluck(input));
    }
}
    