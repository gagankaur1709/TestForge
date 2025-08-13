
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
    
    class GeneratedTest_llama3_70b_8192_Java_7_humaneval_role_playing_6642074f {

    @Test
    void should_return_empty_list_when_input_list_is_empty() {
        Solution solution = new Solution();
        List<String> inputList = new ArrayList<>();
        String substring = "a";
        List<String> expected = new ArrayList<>();
        List<String> actual = solution.filterBySubstring(inputList, substring);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_with_all_strings_when_substring_is_empty() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "";
        List<String> expected = inputList;
        List<String> actual = solution.filterBySubstring(inputList, substring);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_with_strings_containing_substring() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "a";
        List<String> expected = Arrays.asList("abc", "bacd", "array");
        List<String> actual = solution.filterBySubstring(inputList, substring);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_empty_list_when_no_strings_contain_substring() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "xyz";
        List<String> expected = new ArrayList<>();
        List<String> actual = solution.filterBySubstring(inputList, substring);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_with_strings_containing_substring_case_insensitive() {
        Solution solution = new Solution();
        List<String> inputList = Arrays.asList("abc", "bacd", "cde", "Array");
        String substring = "a";
        List<String> expected = Arrays.asList("abc", "bacd", "Array");
        List<String> actual = solution.filterBySubstring(inputList, substring);
        assertEquals(expected, actual);
    }
}
    