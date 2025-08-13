
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
    
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
    Return maximum element in the list.
    >>> maxElement(Arrays.asList(1, 2, 3))
    3
    >>> maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
    123
     */
    public int maxElement(List<Integer> l) {

            return Collections.max(l);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_35_humaneval_constraint_based_9cfec6f0 {
    @Test
    void testMaxElement_HappyPath() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(3, solution.maxElement(list));
    }

    @Test
    void testMaxElement_EdgeCase_EmptyList() {
        Solution solution = new Solution();
        List<Integer> list = Collections.emptyList();
        assertEquals(null, solution.maxElement(list));
    }

    @Test
    void testMaxElement_EdgeCase_SingleElement() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(5);
        assertEquals(5, solution.maxElement(list));
    }
}
    