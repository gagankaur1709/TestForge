
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
    You are given a list of integers.
    Write a function nextSmallest() that returns the 2nd smallest element of the list.
    Return null if there is no such element.
    <p>
    nextSmallest(Arrays.asList(1, 2, 3, 4, 5)) == Optional[2]
    nextSmallest(Arrays.asList(5, 1, 4, 3, 2)) == Optional[2]
    nextSmallest(Arrays.asList()) == Optional.empty
    nextSmallest(Arrays.asList(1, 1)) == Optional.empty
     */
    public Optional<Integer> nextSmallest(List<Integer> lst) {

                    Set < Integer > set = new HashSet<>(lst);
        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);
        if (l.size() < 2) {
            return Optional.empty();
        } else {
            return Optional.of(l.get(1));
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_90_humaneval_constraint_based_36b9e0ad {

    @Test
    void testNextSmallest_HappyPath() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result = solution.nextSmallest(input);
        assertTrue(result.isPresent());
        assertEquals(2, result.get().intValue());
    }

    @Test
    void testNextSmallest_UnorderedInput() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(5, 1, 4, 3, 2);
        Optional<Integer> result = solution.nextSmallest(input);
        assertTrue(result.isPresent());
        assertEquals(2, result.get().intValue());
    }

    @Test
    void testNextSmallest_EmptyInput() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList();
        Optional<Integer> result = solution.nextSmallest(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testNextSmallest_DuplicateInput() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 1);
        Optional<Integer> result = solution.nextSmallest(input);
        assertTrue(result.isEmpty());
    }
}
    