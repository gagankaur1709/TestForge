
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
    
    public class GeneratedTest_llama3_70b_8192_Java_29_humaneval_guided_tree_of_thought_f9c77624 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFilterByPrefix_EmptyList_ReturnsEmptyList() {
        List<String> input = Arrays.asList();
        String prefix = "a";
        List<String> expected = Arrays.asList();
        List<String> result = solution.filterByPrefix(input, prefix);
        assertEquals(expected, result);
    }

    @Test
    void testFilterByPrefix_ListWithMatchingPrefix_ReturnsFilteredStrings() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        String prefix = "a";
        List<String> expected = Arrays.asList("abc", "array");
        List<String> result = solution.filterByPrefix(input, prefix);
        assertEquals(expected, result);
    }

    @Test
    void testFilterByPrefix_ListWithoutMatchingPrefix_ReturnsEmptyList() {
        List<String> input = Arrays.asList("bcd", "cde", "efg");
        String prefix = "a";
        List<String> expected = Arrays.asList();
        List<String> result = solution.filterByPrefix(input, prefix);
        assertEquals(expected, result);
    }

    @Test
    void testFilterByPrefix_NullInput_ThrowsNullPointerException() {
        String prefix = "a";
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, 
                () -> solution.filterByPrefix(null, prefix));
        assertEquals("Cannot invoke \"java.util.List.stream()\" because \"strings\" is null", exception.getMessage());
    }

    @Test
    void testFilterByPrefix_NullPrefix_ThrowsNullPointerException() {
        List<String> input = Arrays.asList("abc", "bcd", "cde", "array");
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, 
                () -> solution.filterByPrefix(input, null));
        assertEquals("Cannot invoke \"java.lang.String.startsWith(java.lang.String)\" because \"prefix\" is null", exception.getMessage());
    }
}
    