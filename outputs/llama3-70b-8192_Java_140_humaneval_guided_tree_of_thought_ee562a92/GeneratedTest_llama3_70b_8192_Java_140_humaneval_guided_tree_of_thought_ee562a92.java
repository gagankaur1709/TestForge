
    import java.lang.*;
import java.util.*;
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
    Given a string text, replace all spaces in it with underscores,
    and if a string has more than 2 consecutive spaces,
    then replace all consecutive spaces with -

    fixSpaces("Example") == "Example"
    fixSpaces("Example 1") == "Example_1"
    fixSpaces(" Example 2") == "_Example_2"
    fixSpaces(" Example   3") == "_Example-3"
     */
    public String fixSpaces(String text) {

            StringBuilder sb = new StringBuilder();
        int start = 0, end = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                end += 1;
            } else {
                if (end - start > 2) {
                    sb.append('-');
                } else if (end - start > 0) {
                    sb.append("_".repeat(end - start));
                }
                sb.append(text.charAt(i));
                start = i + 1;
                end = i + 1;
            }
        }
        if (end - start > 2) {
            sb.append('-');
        } else if (end - start > 0) {
            sb.append("_".repeat(end - start));
        }
        return sb.toString();
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_140_humaneval_guided_tree_of_thought_ee562a92 {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testFixSpaces_NoSpaces() {
        assertEquals("Example", solution.fixSpaces("Example"));
    }

    @Test
    void testFixSpaces_SingleSpace() {
        assertEquals("Example_1", solution.fixSpaces("Example 1"));
    }

    @Test
    void testFixSpaces_LeadingSpace() {
        assertEquals("_Example_2", solution.fixSpaces(" Example 2"));
    }

    @Test
    void testFixSpaces_MultipleSpaces() {
        assertEquals("_Example-3", solution.fixSpaces(" Example   3"));
    }

    @Test
    void testFixSpaces_MultipleConsecutiveSpaces() {
        assertEquals("_Example-_4", solution.fixSpaces(" Example   4   "));
    }

    @Test
    void testFixSpaces_TrailingSpaces() {
        assertEquals("_Example_5", solution.fixSpaces(" Example 5   "));
    }

    @Test
    void testFixSpaces_EmptyString() {
        assertEquals("", solution.fixSpaces(""));
    }
}
    