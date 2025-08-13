
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_122_humaneval_guided_tree_of_thought_2f11e713 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testAddElements_HappyPath() {
        List<Integer> arr = Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_SingleElement() {
        List<Integer> arr = Arrays.asList(10);
        int k = 1;
        int expected = 10;
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_NoElements() {
        List<Integer> arr = Arrays.asList();
        int k = 0;
        int expected = 0;
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_AllElements() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int k = arr.size();
        int expected = 45;
        assertEquals(expected, solution.addElements(arr, k));
    }

    @Test
    void testAddElements_NoTwoDigitElements() {
        List<Integer> arr = Arrays.asList(1000, 2000, 3000, 4000, 5000);
        int k = arr.size();
        int expected = 0;
        assertEquals(expected, solution.addElements(arr, k));
    }
}
    