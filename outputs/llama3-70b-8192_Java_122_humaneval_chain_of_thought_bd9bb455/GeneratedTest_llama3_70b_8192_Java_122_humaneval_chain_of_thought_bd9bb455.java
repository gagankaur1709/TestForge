
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
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
     */
    public int addElements(List<Integer> arr, int k) {

            arr = arr.subList(0, k);
        Optional<Integer> sum = arr.stream().filter(p -> String.valueOf(Math.abs(p)).length() <= 2).reduce(Integer::sum);
        return sum.orElse(0);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_122_humaneval_chain_of_thought_bd9bb455 {

    @Test
    void testAddElements_HappyPath() {
        Solution solution = new Solution();
        List<Integer> arr = Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24; // sum of 21 + 3
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_EmptyArray() {
        Solution solution = new Solution();
        List<Integer> arr = new ArrayList<>();
        int k = 0;
        int expected = 0;
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_KGreaterThanArrayLength() {
        Solution solution = new Solution();
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int k = 5;
        int expected = 6; // sum of 1 + 2 + 3
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_ArrayWithOnlyThreeDigitNumbers() {
        Solution solution = new Solution();
        List<Integer> arr = Arrays.asList(111, 222, 333);
        int k = 3;
        int expected = 0;
        assertEquals(expected, solution.addElements(arr, k));
    }
}
    