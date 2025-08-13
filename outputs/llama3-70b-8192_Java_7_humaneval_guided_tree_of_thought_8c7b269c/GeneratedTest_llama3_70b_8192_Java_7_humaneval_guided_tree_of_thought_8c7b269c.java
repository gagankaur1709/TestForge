
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
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
    Filter an input list of strings only for ones that contain given substring
    >>> filterBySubstring(List.of(), "a")
    []
    >>> filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a")
    ["abc", "bacd", "array"]
     */
    public List<String> filterBySubstring(List<String> strings, String substring) {

            List<String> result = new ArrayList<>();
        for (String x : strings) {
            if (x.contains(substring)) {
                result.add(x);
            }
        }
        return result;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_7_humaneval_guided_tree_of_thought_8c7b269c {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFilterBySubstring_EmptyList_ReturnsEmptyList() {
        List<String> strings = new ArrayList<>();
        String substring = "a";
        List<String> expected = new ArrayList<>();
        List<String> result = solution.filterBySubstring(strings, substring);
        assertEquals(expected, result);
    }

    @Test
    void testFilterBySubstring_ListWithMatchingSubstring_ReturnsFilteredStrings() {
        List<String> strings = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "a";
        List<String> expected = Arrays.asList("abc", "bacd", "array");
        List<String> result = solution.filterBySubstring(strings, substring);
        assertEquals(expected, result);
    }

    @Test
    void testFilterBySubstring_ListWithoutMatchingSubstring_ReturnsEmptyList() {
        List<String> strings = Arrays.asList("bcd", "cde", "efg");
        String substring = "a";
        List<String> expected = new ArrayList<>();
        List<String> result = solution.filterBySubstring(strings, substring);
        assertEquals(expected, result);
    }

    @Test
    void testFilterBySubstring_NullList_ThrowsNullPointerException() {
        String substring = "a";
        List<String> strings = null;
        assertThrows(NullPointerException.class, () -> solution.filterBySubstring(strings, substring));
    }

    @Test
    void testFilterBySubstring_NullSubstring_ThrowsNullPointerException() {
        List<String> strings = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = null;
        assertThrows(NullPointerException.class, () -> solution.filterBySubstring(strings, substring));
    }
}
    