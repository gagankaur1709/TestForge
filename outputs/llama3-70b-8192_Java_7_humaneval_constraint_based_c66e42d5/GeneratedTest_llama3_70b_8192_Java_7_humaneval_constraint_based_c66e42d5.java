
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
    
    public class GeneratedTest_llama3_70b_8192_Java_7_humaneval_constraint_based_c66e42d5 {

    @Test
    void testFilterBySubstring_EmptyList_ReturnsEmptyList() {
        Solution solution = new Solution();
        List<String> inputList = new ArrayList<>();
        String substring = "a";
        List<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, solution.filterBySubstring(inputList, substring));
    }

    @Test
    void testFilterBySubstring_ListWithSubstring_ReturnsFilteredStrings() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "a";
        List<String> expectedResult = Arrays.asList("abc", "bacd", "array");
        assertEquals(expectedResult, solution.filterBySubstring(inputList, substring));
    }

    @Test
    void testFilterBySubstring_ListWithoutSubstring_ReturnsEmptyList() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("xyz", "pqr", "mno");
        String substring = "a";
        List<String> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, solution.filterBySubstring(inputList, substring));
    }

    @Test
    void testFilterBySubstring_NullSubstring_ThrowsNullPointerException() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = null;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, 
                () -> solution.filterBySubstring(inputList, substring));
        assertEquals("substring cannot be null", exception.getMessage());
    }
}
    