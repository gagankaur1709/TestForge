
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
    Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest(List.of())
    Optional.empty
    >>> longest(Arrays.asList("a", "b", "c"))
    Optional[a]
    >>> longest(Arrays.asList("a", "bb", "ccc"))
    Optional[ccc]
     */
    public Optional<String> longest(List<String> strings) {

            if (strings.isEmpty()) {
            return Optional.empty();
        }
        String longest = strings.get(0);
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return Optional.of(longest);
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_12_humaneval_constraint_based_0d2713d3 {
    private Solution solution = new Solution();

    @Test
    void testEmptyList() {
        List<String> strings = Arrays.asList();
        Optional<String> result = solution.longest(strings);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementList() {
        List<String> strings = Arrays.asList("a");
        Optional<String> result = solution.longest(strings);
        assertEquals("a", result.get());
    }

    @Test
    void testMultipleElementsList() {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        Optional<String> result = solution.longest(strings);
        assertEquals("ccc", result.get());
    }

    @Test
    void testMultipleLongestElementsList() {
        List<String> strings = Arrays.asList("a", "bb", "ccc", "ccc");
        Optional<String> result = solution.longest(strings);
        assertEquals("ccc", result.get());
    }
}
    