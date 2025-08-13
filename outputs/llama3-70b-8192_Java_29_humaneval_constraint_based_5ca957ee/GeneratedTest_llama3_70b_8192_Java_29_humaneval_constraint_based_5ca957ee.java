
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
import java.util.stream.Collectors;

class Solution {
    /**
    Filter an input list of strings only for ones that start with a given prefix.
    >>> filterByPrefix(List.of(), "a")
    []
    >>> filterByPrefix(Arrays.asList("abc", "bcd", "cde", "array"), "a")
    ["abc", "array"]
     */
    public List<String> filterByPrefix(List<String> strings, String prefix) {

            return strings.stream().filter(p -> p.startsWith(prefix)).collect(Collectors.toList());
    }
}
    
    class GeneratedTest_llama3_70b_8192_Java_29_humaneval_constraint_based_5ca957ee {

    @Test
    void testFilterByPrefix_EmptyList_ReturnsEmptyList() {
        Solution solution = new Solution();
        List<String> strings = new ArrayList<>();
        String prefix = "a";
        List<String> expected = new ArrayList<>();
        assertEquals(expected, solution.filterByPrefix(strings, prefix));
    }

    @Test
    void testFilterByPrefix_ListWithMatchingPrefix_ReturnsFilteredStrings() {
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("abc", "bcd", "cde", "array");
        String prefix = "a";
        List<String> expected = Arrays.asList("abc", "array");
        assertEquals(expected, solution.filterByPrefix(strings, prefix));
    }

    @Test
    void testFilterByPrefix_ListWithoutMatchingPrefix_ReturnsEmptyList() {
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("bcd", "cde", "xyz");
        String prefix = "a";
        List<String> expected = new ArrayList<>();
        assertEquals(expected, solution.filterByPrefix(strings, prefix));
    }

    @Test
    void testFilterByPrefix_NullPrefix_ThrowsNullPointerException() {
        Solution solution = new Solution();
        List<String> strings = Arrays.asList("abc", "bcd", "cde", "array");
        String prefix = null;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, 
                () -> solution.filterByPrefix(strings, prefix));
        assertEquals("prefix", exception.getMessage());
    }

    @Test
    void testFilterByPrefix_NullInputList_ThrowsNullPointerException() {
        Solution solution = new Solution();
        List<String> strings = null;
        String prefix = "a";
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, 
                () -> solution.filterByPrefix(strings, prefix));
        assertEquals("strings", exception.getMessage());
    }
}
    