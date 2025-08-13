
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
    Write a function that accepts two lists of strings and returns the list that has
    total number of chars in the all strings of the list less than the other list.

    if the two lists have the same number of chars, return the first list.

    Examples
    totalMatch(Arrays.asList(), Arrays.asList()) -> []
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi")) -> ["hI", "Hi"]
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project")) -> ["hi", "admin"]
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi")) -> ["hI", "hi", "hi"]
    totalMatch(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5")) -> ["4"]
     */
    public List<String> totalMatch(List<String> lst1, List<String> lst2) {

            int l1 = 0;
        for (String st : lst1) {
            l1 += st.length();
        }

        int l2 = 0;
        for (String st : lst2) {
            l2 += st.length();
        }

        if (l1 <= l2) {
            return lst1;
        } else {
            return lst2;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_74_humaneval_constraint_based_f0c52264 {
    private Solution solution = new Solution();

    @Test
    void testEmptyLists() {
        List<String> lst1 = Arrays.asList();
        List<String> lst2 = Arrays.asList();
        assertEquals(lst1, solution.totalMatch(lst1, lst2));
    }

    @Test
    void testFirstListSmaller() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hI", "Hi");
        assertEquals(lst2, solution.totalMatch(lst1, lst2));
    }

    @Test
    void testSecondListSmaller() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hi", "hi", "admin", "project");
        assertEquals(lst1, solution.totalMatch(lst1, lst2));
    }

    @Test
    void testEqualLength() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hI", "hi", "hi");
        assertEquals(lst2, solution.totalMatch(lst1, lst2));
    }

    @Test
    void testSingleElementLists() {
        List<String> lst1 = Arrays.asList("4");
        List<String> lst2 = Arrays.asList("1", "2", "3", "4", "5");
        assertEquals(Arrays.asList("4"), solution.totalMatch(lst1, lst2));
    }
}
    