
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
    Return sorted unique common elements for two lists.
    >>> common(Arrays.asList(1, 4, 3, 34, 653, 2, 5), Arrays.asList(5, 7, 1, 5, 9, 653, 121))
    [1, 5, 653]
    >>> common(Arrays.asList(5, 3, 2, 8), Arrays.asList(3, 2))
    [2, 3]
     */
    public List<Integer> common(List<Integer> l1, List<Integer> l2) {

            Set<Integer> ret = new HashSet<>(l1);
        ret.retainAll(new HashSet<>(l2));
        List<Integer> result = new ArrayList<>(ret);
        Collections.sort(result);
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_58_humaneval_chain_of_thought_3ba80797 {

    @Test
    void testCommonHappyPath() {
        Solution solution = new Solution();
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Integer> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Integer> expected = Arrays.asList(1, 5, 653);
        assertEquals(expected, solution.common(l1, l2));
    }

    @Test
    void testCommonEdgeCaseEmptyLists() {
        Solution solution = new Solution();
        List<Integer> l1 = Arrays.asList();
        List<Integer> l2 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.common(l1, l2));
    }

    @Test
    void testCommonEdgeCaseOneEmptyList() {
        Solution solution = new Solution();
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.common(l1, l2));
    }

    @Test
    void testCommonEdgeCaseNoCommonElements() {
        Solution solution = new Solution();
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.common(l1, l2));
    }
}
    