
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
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
    Return True is list elements are monotonically increasing or decreasing.
    >>> monotonic(Arrays.asList(1, 2, 4, 20))
    true
    >>> monotonic(Arrays.asList(1, 20, 4, 10))
    false
    >>> monotonic(Arrays.asList(4, 1, 0, -10))
    true
     */
    public boolean monotonic(List<Integer> l) {

            List<Integer> l1 = new ArrayList<>(l), l2 = new ArrayList<>(l);
        Collections.sort(l1);
        l2.sort(Collections.reverseOrder());
        return l.equals(l1) || l.equals(l2);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_57_humaneval_constraint_based_7a01162c {

    @Test
    void testMonotonic_Increasing() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(1, 2, 4, 20);
        assertTrue(solution.monotonic(list));
    }

    @Test
    void testMonotonic_Decreasing() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(4, 1, 0, -10);
        assertTrue(solution.monotonic(list));
    }

    @Test
    void testMonotonic_NotMonotonic() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(1, 20, 4, 10);
        assertFalse(solution.monotonic(list));
    }

    @Test
    void testMonotonic_SingleElement() {
        Solution solution = new Solution();
        List<Integer> list = Collections.singletonList(1);
        assertTrue(solution.monotonic(list));
    }

    @Test
    void testMonotonic_EmptyList() {
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>();
        assertTrue(solution.monotonic(list));
    }
}
    