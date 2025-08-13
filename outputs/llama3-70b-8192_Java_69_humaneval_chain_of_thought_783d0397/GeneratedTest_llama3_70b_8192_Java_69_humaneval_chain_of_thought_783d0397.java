
    import java.lang.*;
import java.util.*;
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
    You are given a non-empty list of positive integers. Return the greatest integer that is greater than
    zero, and has a frequency greater than or equal to the value of the integer itself.
    The frequency of an integer is the number of times it appears in the list.
    If no such a value exist, return -1.
    Examples:
        search(Arrays.asList(4, 1, 2, 2, 3, 1)) == 2
        search(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4)) == 3
        search(Arrays.asList(5, 5, 4, 4, 4)) == -1
     */
    public int search(List<Integer> lst) {

            int[] frq = new int[Collections.max(lst) + 1];
        for (int i : lst) {
            frq[i] += 1;
        }
        int ans = -1;
        for (int i = 1; i < frq.length; i++) {
            if (frq[i] >= i) {
                ans = i;
            }
        }
        return ans;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_69_humaneval_chain_of_thought_783d0397 {
    @Test
    void testSearch_HappyPath() {
        Solution solution = new Solution();
        List<Integer> lst = Arrays.asList(4, 1, 2, 2, 3, 1);
        int expected = 2;
        assertEquals(expected, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_FrequencyEqualsValue() {
        Solution solution = new Solution();
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4);
        int expected = 3;
        assertEquals(expected, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_NoSuchValueExist() {
        Solution solution = new Solution();
        List<Integer> lst = Arrays.asList(5, 5, 4, 4, 4);
        int expected = -1;
        assertEquals(expected, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_SingleElementList() {
        Solution solution = new Solution();
        List<Integer> lst = Arrays.asList(5);
        int expected = -1;
        assertEquals(expected, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_EmptyList() {
        Solution solution = new Solution();
        List<Integer> lst = new ArrayList<>();
        int expected = -1;
        assertEquals(expected, solution.search(lst));
    }
}
    