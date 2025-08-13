
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
    Return median of elements in the list l.
    >>> median(Arrays.asList(3, 1, 2, 4, 5))
    3
    >>> median(Arrays.asList(-10, 4, 6, 1000, 10, 20))
    15.0
     */
    public double median(List<Integer> l) {

            List<Integer> list = l;
        Collections.sort(list);
        if (l.size() % 2 == 1) {
            return l.get(l.size() / 2);
        } else {
            return (l.get(l.size() / 2 - 1) + l.get(l.size() / 2)) / 2.0;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_47_humaneval_constraint_based_a4e29d16 {

    @Test
    void testMedianHappyPath() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(3, 1, 2, 4, 5);
        assertEquals(3, solution.median(list));
    }

    @Test
    void testMedianEvenLengthList() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        assertEquals(10.0, solution.median(list));
    }

    @Test
    void testMedianEmptyList() {
        Solution solution = new Solution();
        List<Integer> list = Collections.emptyList();
        assertEquals(0, solution.median(list), 0.01);
    }

    @Test
    void testMedianSingleElementList() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(5);
        assertEquals(5, solution.median(list));
    }

    @Test
    void testMedianTwoElementList() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(2, 4);
        assertEquals(3, solution.median(list));
    }
}
    