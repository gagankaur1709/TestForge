
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_69_humaneval_guided_tree_of_thought_646a9fb0 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testSearch_HappyPath() {
        List<Integer> lst = Arrays.asList(4, 1, 2, 2, 3, 1);
        assertEquals(2, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_SingleElement() {
        List<Integer> lst = Arrays.asList(5);
        assertEquals(-1, solution.search(lst));
    }

    @Test
    void testSearch_EdgeCase_AllSameElements() {
        List<Integer> lst = Arrays.asList(2, 2, 2, 2);
        assertEquals(2, solution.search(lst));
    }

    @Test
    void testSearch_NegativePath_NoValidResult() {
        List<Integer> lst = Arrays.asList(5, 5, 4, 4, 4);
        assertEquals(-1, solution.search(lst));
    }

    @Test
    void testSearch_NegativePath_EmptyList() {
        List<Integer> lst = Collections.emptyList();
        assertEquals(-1, solution.search(lst));
    }
}
    